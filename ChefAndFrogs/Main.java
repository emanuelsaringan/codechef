import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int P = in.nextInt();

        int[] points = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = in.nextInt();
        }

        long[][] adjMat = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    adjMat[i][j] = 0;
                } else if (Math.abs(points[i] - points[j]) <= K) {
                    adjMat[i][j] = 1;
                } else {
                    adjMat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Floyd-Warshall
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    long dist = adjMat[i][k] + adjMat[k][j];
                    if (dist < adjMat[i][j]) {
                        adjMat[i][j] = dist;
                    }
                }
            }
        }

        for (int i = 0; i < P; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            System.out.println(adjMat[x][y] == Integer.MAX_VALUE ? "No" : "Yes");
        }
    }
}
