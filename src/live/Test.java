//package live;
//
//import java.util.Arrays;
//
//public class Test {
//
//    public static final String IMPOSSIBLE = "IMPOSSIBLE";
//    public static final String ONE = "1";
//    public static final String ZERO = "0";
//    public static final String SEPARATOR = ",";
//
//    public static void main(String[] args) {
//         int U; int L; int[] C ={1,2,3};
//
//        // write your code in Java SE 8
//        int total = Arrays.stream(C).sum();
//
//        if(total != U + L) {
//            return IMPOSSIBLE;
//        } else {
//            StringBuilder first = new StringBuilder();
//            StringBuilder second = new StringBuilder();
//
//            boolean flag = true;
//            for (int i = 0; i < C.length; i++) {
//                if (C[i] == 2) {
//                    first.append(ONE);
//                    second.append(ONE);
//                } else if (C[i] == 0) {
//                    first.append(ZERO);
//                    second.append(ZERO);
//                } else {
//                    if (flag) {
//                        first.append(ONE);
//                        second.append(ZERO);
//                    } else {
//                        first.append(ZERO);
//                        second.append(ONE);
//                    }
//                    flag = !flag;
//                }
//            }
//            return first + SAPERATOR + second;
//        }
//    }
//}
