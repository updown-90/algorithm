//Write a function solution that, given an integer N, returns a string of length N containing as many different lower-case letters (a'-2') as possible, in which each letter occurs an equal number of times.
//Examples:
//1. Given N = 3, the function may return "fig". "pea", "nut", etc. Each of these strings contains three
//different letters with the same number of occurrences.
//2. Given N = 5, the function may return "mango", "grape", "melon", etc.
//3. Given N = 30, the function may return "aabbcc.oo" (each letter from 'a' to 'o' occurs twice). The
//string contains 15 different letters.
//Write an efficient algorithm for the following assumptions:
//• N is an integer within the range [1.200,000).
//Copyright 2009-2025 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
public class Naver2 {
    public static String solution(int N) {
        // 만약 입력받은 N이 0이라면 빈 문자열을 반환합니다.
        if (N == 0) {
            return "";
        }

        // 사용할 서로 다른 문자의 개수를 저장할 변수입니다.
        int numLetters = 0;
        // 1부터 26까지 반복하며 N을 나눌 수 있는 가장 큰 수를 찾습니다.
        for (int i = 1; i <= 26; i++) {
            // N이 i로 나누어 떨어진다면 i개의 문자를 사용할 수 있습니다.
            if (N % i == 0) {
                numLetters = i;
            }
            // i가 N보다 크다면 더 이상 반복할 필요가 없습니다.
            if (i > N) {
                break;
            }
        }

        // 나누어 떨어지는 수를 찾지 못했다면 1개의 문자만 사용합니다.
        if (numLetters == 0) {
            numLetters = 1;
        }

        // 각 문자가 반복될 횟수를 계산합니다.
        int repeatCount = N / numLetters;
        // 결과 문자열을 저장할 StringBuilder를 생성합니다.
        StringBuilder result = new StringBuilder();
        // numLetters만큼 반복하며 문자를 추가합니다.
        for (int i = 0; i < numLetters; i++) {
            // 'a'부터 시작하여 i번째 문자를 계산합니다.
            char currentChar = (char) ('a' + i);
            // repeatCount만큼 문자를 반복하여 StringBuilder에 추가합니다.
            for (int j = 0; j < repeatCount; j++) {
                result.append(currentChar);
            }
        }

        // StringBuilder를 문자열로 변환하여 반환합니다.
        return result.toString();
    }

    public static void main(String[] args) {
        // 몇 가지 테스트 케이스를 실행하여 결과 출력
        System.out.println(solution(3));   // 예: "abc"
        System.out.println(solution(5));   // 예: "abcde"
        System.out.println(solution(30));  // 예: "aabbcc...oo"
    }
}
