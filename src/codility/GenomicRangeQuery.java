package codility;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        String S = "CAGCCTA";
        char[] seqs = S.toCharArray();
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        int M = P.length;

        int[] result = new int[M];

        for (int i = 0; i < M; i++) {
            int p = P[i];
            int q = Q[i];

            char lastSeq = 'T';
            for (int j = p; j <= q; j++) {
                if (lastSeq > seqs[j]) {
                    lastSeq = seqs[j];
                }
            }

            if (lastSeq == 'A') {
                result[i] = 1;
            } else if (lastSeq == 'C') {
                result[i] = 2;
            } else if (lastSeq == 'G') {
                result[i] = 3;
            } else if (lastSeq == 'T') {
                result[i] = 4;
            }
        }

        System.out.println(result);
    }
}
