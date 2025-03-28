import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Naver3 {
    static class Pizza {
        public String name;
        public int price_S;
        public int price_M;
        public int price_L;
    }

    static class OrderItem {
        public String name;
        public String size;
        public int quantity;
    }

        public int solution(Pizza[] menu, OrderItem[] order) {

            Map<String, Pizza> menuMap = new HashMap<>();
            for (Pizza pizza : menu) {
                menuMap.put(pizza.name, pizza);
            }

            // 할인 적용 없는 기본 주문 비용 계산
            int normalCost = calculateNormalCost(menuMap, order);
            int bestDiscountedCost = normalCost;

            // 각 할인 옵션을 적용하고, 최소 비용 갱신
            bestDiscountedCost = Math.min(bestDiscountedCost, applyThreeCheapestPizzaFreeDiscount(menuMap, order)); // 3개 구매 시 가장 저렴한 피자를 무료로 제공
            bestDiscountedCost = Math.min(bestDiscountedCost, applyFivePizzasForHundredDiscount(menuMap, order)); // 5개 구매 시 100원 할인 적용
            bestDiscountedCost = Math.min(bestDiscountedCost, applyFreeSmallPizzaWithLargeDiscount(menuMap, order)); // 라지 피자 구매 시 스몰 피자 무료 할인 적용
            bestDiscountedCost = Math.min(bestDiscountedCost, applyThreeLargePizzasAsMediumDiscount(menuMap, order)); // 라지 피자 3개 구매 시 미디엄 가격으로 계산 할인 적용

            return bestDiscountedCost;
        }

        // 할인을 적용하지 않은 기본 주문 비용을 계산하는 함수
        private int calculateNormalCost(Map<String, Pizza> menuMap, OrderItem[] order) {
            int totalCost = 0;
            for (OrderItem item : order) {
                Pizza pizza = menuMap.get(item.name);
                totalCost += getPrice(pizza, item.size) * item.quantity;
            }
            return totalCost;
        }

        // 피자 사이즈에 따른 가격을 반환하는 함수
        private int getPrice(Pizza pizza, String size) {
            if (size.equals("Small")) return pizza.price_S;
            if (size.equals("Medium")) return pizza.price_M;
            return pizza.price_L; // Large
        }

        // 3개 구매 시 가장 저렴한 피자를 무료로 제공하는 할인을 적용하는 함수
        private int applyThreeCheapestPizzaFreeDiscount(Map<String, Pizza> menuMap, OrderItem[] order) {
            if (getTotalQuantity(order) < 3) return Integer.MAX_VALUE;

            List<Integer> prices = new ArrayList<>();
            for (OrderItem item : order) {
                Pizza pizza = menuMap.get(item.name);
                for (int i = 0; i < item.quantity; i++) {
                    prices.add(getPrice(pizza, item.size));
                }
            }
            prices.sort(Integer::compareTo);
            return calculateNormalCost(menuMap, order) - prices.get(0);
        }

        // 5개 구매 시 100원에 제공하는 할인을 적용하는 함수
        private int applyFivePizzasForHundredDiscount(Map<String, Pizza> menuMap, OrderItem[] order) {
            int minCost = Integer.MAX_VALUE;
            for (String name : getUniqueNames(order)) {
                int count = 0;
                for (OrderItem item : order) {
                    if (item.name.equals(name)) count += item.quantity;
                }
                if (count >= 5) {
                    int discountCost = 100;
                    int remainingCost = 0;
                    int used = 0;

                    for (OrderItem item : order) {
                        if (item.name.equals(name) && used < 5) {
                            int currentPrice = getPrice(menuMap.get(name), item.size);
                            if (used + item.quantity <= 5) {
                                used += item.quantity;
                            } else {
                                remainingCost += currentPrice * (item.quantity - (5 - used));
                                used = 5;
                            }
                        } else if (item.name.equals(name)) {
                            remainingCost += getPrice(menuMap.get(name), item.size) * item.quantity;
                        } else {
                            remainingCost += getPrice(menuMap.get(item.name), item.size) * item.quantity;
                        }
                    }
                    minCost = Math.min(minCost, discountCost + remainingCost);
                }
            }
            return minCost;
        }

        // 라지 피자 구매 시 스몰 피자를 무료로 제공하는 할인을 적용하는 함수
        private int applyFreeSmallPizzaWithLargeDiscount(Map<String, Pizza> menuMap, OrderItem[] order) {
            int normalCost = calculateNormalCost(menuMap, order);
            Map<String, List<OrderItem>> largePizzas = new HashMap<>();
            Map<String, List<OrderItem>> smallPizzas = new HashMap<>();

            for (OrderItem item : order) {
                if (item.size.equals("Large")) {
                    if (!largePizzas.containsKey(item.name)) {
                        largePizzas.put(item.name, new ArrayList<>());
                    }
                    largePizzas.get(item.name).add(item);
                } else if (item.size.equals("Small")) {
                    if (!smallPizzas.containsKey(item.name)) {
                        smallPizzas.put(item.name, new ArrayList<>());
                    }
                    smallPizzas.get(item.name).add(item);
                }
            }

            int discount = 0;
            for (String name : largePizzas.keySet()) {
                if (smallPizzas.containsKey(name)) {
                    List<OrderItem> largeList = largePizzas.get(name);
                    List<OrderItem> smallList = smallPizzas.get(name);
                    int largeCount = 0;
                    int smallCount = 0;

                    for (OrderItem item : largeList) {
                        largeCount += item.quantity;
                    }
                    for (OrderItem item : smallList) {
                        smallCount += item.quantity;
                    }

                    int freeCount = Math.min(largeCount, smallCount);
                    for (OrderItem item : smallList) {
                        int free = Math.min(freeCount, item.quantity);
                        discount += getPrice(menuMap.get(name), "Small") * free;
                        freeCount -= free;
                        if (freeCount == 0) {
                            break;
                        }
                    }
                }
            }

            return normalCost - discount;
        }

        // 라지 피자 3개를 미디엄 피자 가격으로 계산하는 할인을 적용하는 함수
        private int applyThreeLargePizzasAsMediumDiscount(Map<String, Pizza> menuMap, OrderItem[] order) {
            List<OrderItem> largeItems = new ArrayList<>();
            for (OrderItem item : order) {
                if (item.size.equals("Large")) largeItems.add(item);
            }
            if (largeItems.size() < 3) return Integer.MAX_VALUE;

            int bestDiscount = Integer.MAX_VALUE;
            for (int i = 0; i < largeItems.size(); i++) {
                for (int j = i + 1; j < largeItems.size(); j++) {
                    for (int k = j + 1; k < largeItems.size(); k++) {
                        int tempDiscount = 0;
                        int tempNormalCost = 0;
                        List<OrderItem> selected = new ArrayList<>();

                        List<OrderItem> currentSelection = new ArrayList<>();
                        currentSelection.add(largeItems.get(i));
                        currentSelection.add(largeItems.get(j));
                        currentSelection.add(largeItems.get(k));

                        currentSelection.sort((a, b) -> menuMap.get(a.name).price_L - menuMap.get(b.name).price_L);

                        for (OrderItem item : order) {
                            if (currentSelection.contains(item)) {
                                tempDiscount += menuMap.get(item.name).price_M * item.quantity;
                            } else {
                                tempNormalCost += getPrice(menuMap.get(item.name), item.size) * item.quantity;
                            }
                        }

                        if (selected.size() == 3) {
                            bestDiscount = Math.min(bestDiscount, tempDiscount + tempNormalCost);
                        }
                    }
                }
            }
            return bestDiscount;
        }

        // 주문 항목의 총 개수를 반환하는 함수
        private int getTotalQuantity(OrderItem[] order) {
            int count = 0;
            for (OrderItem item : order) count += item.quantity;
            return count;
        }

        // 주문 항목에서 유일한 피자 이름을 추출하여 목록으로 반환하는 함수
        private List<String> getUniqueNames(OrderItem[] order) {
            List<String> names = new ArrayList<>();
            for (OrderItem item : order) {
                if (!names.contains(item.name)) names.add(item.name);
            }
            return names;
        }
    }