//Write a function solution that, given a string S consisting of N letters 'a' and/or 'b' returns true when all occurrences of letter 'al are before all occurrences of letter 'b' and returns false otherwise.
//Examples:
//1. Given S = "aabbb", the function should return true.
//2. Given S = "ba",
//", the function should return false.
//3. Given S = "aaa", the function should return true. Note that 'b' does not need to occur in S.
//4. Given S = "b",
//", the function should return true. Note that 'a' does not need to occur in S.
//5. Given S = "abba", the function should return false.
//Write an efficient algorithm for the following assumptions:
//• N is an integer within the range (1.300,000);
//• string S is made only of the characters 'a" and/or "b'.

public class Naver1 {
    public boolean solution(String S) {

        boolean returnValue = false;

        for (char c : S.toCharArray()) {
            if (c == 'b') {
                returnValue = true;
            } else if (returnValue && c == 'a') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Naver1 naver1 = new Naver1();
        System.out.println(naver1.solution("aabbb"));  // true
        System.out.println(naver1.solution("ba"));     // false
        System.out.println(naver1.solution("aaa"));   // true
        System.out.println(naver1.solution("b"));     // true
        System.out.println(naver1.solution("abba"));  // false
    }
}
