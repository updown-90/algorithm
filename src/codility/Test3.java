package codility;

public class Test3 {
    public static void main(String[] args) {
        String S = "ACAX";
        char[] chars = S.toCharArray();
        int[][] pos = new int[26][2];
        for (int i = 0; i < 26; i++) {
            pos[i][0] = pos[i][1] = -1;
        }
        long ans = 0;

        for (int i = 0; i < chars.length; i++) {
            int c = chars[i] - 'A';
            int[] curpos = pos[c];
            if (curpos[0] != -1 || curpos[1] != -1) {
                ans += (long) (i - curpos[1]) * (curpos[1] - curpos[0]);
            }
            curpos[0] = curpos[1];
            curpos[1] = i;
        }

        for (int i = 0; i < 26; i++) {
            int[] curpos = pos[i];
            if (curpos[0] != -1 || curpos[1] != -1) {
                ans += (long) (chars.length - curpos[1]) * (curpos[1] - curpos[0]);
            }
        }

        System.out.println((int)ans % 1000000007);
    }
}
