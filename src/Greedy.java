import java.util.ArrayList;
import java.util.List;

public class Greedy {
    public static void main(String[] args) {
        // 동전 리스트 생성 및 초기화
        List<Integer> coinList = new ArrayList<>();
        coinList.add(500);  // 500원 동전
        coinList.add(100);  // 100원 동전
        coinList.add(50);   // 50원 동전
        coinList.add(1);    // 1원 동전

        int price = 4270;  // 가격 설정
        coinFunc(price, coinList);  // 동전 거스름돈 계산 함수 호출
    }

    // 동전 거스름돈 계산 함수
    private static void coinFunc(int price, List<Integer> coinList) {
        int totalCoinCount = 0;  // 총 동전 개수 초기화
        int coinNum = 0;         // 현재 동전 종류로 거슬러줄 동전 개수 초기화
        ArrayList<Integer> details = new ArrayList<>();  // 동전 개수 상세 정보 저장 리스트 생성

        // 동전 종류를 순회하며 거스름돈 계산
        for (int i = 0; i < coinList.size(); i++) {
            coinNum = price / coinList.get(i);  // 현재 동전 종류로 거슬러줄 동전 개수 계산
            totalCoinCount += coinNum;          // 총 동전 개수 업데이트
            price -= coinNum * coinList.get(i); // 남은 거스름돈 업데이트
            details.add(coinNum);               // 동전 개수 상세 정보 저장
            System.out.println(coinList.get(i) + "원" + coinNum + "개");  // 동전 종류와 개수 출력
        }

        System.out.println("총 동전 갯수 : " + totalCoinCount);  // 총 동전 개수 출력
    }
}
