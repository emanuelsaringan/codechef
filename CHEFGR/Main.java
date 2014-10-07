import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int M = in.nextInt();

            int max = Integer.MIN_VALUE;
            int[] heights = new int[N];
            for (int j = 0; j < N; j++) {
                heights[j] = in.nextInt();

                if (heights[j] > max) {
                    max = heights[j];
                }
            }

            int totalNeeded = 0;
            for (int j = 0; j < N; j++) {
                totalNeeded += (max - heights[j]);
            }

            if (totalNeeded > M) {
                System.out.println("No");
            } else if (totalNeeded < M) {
                if ((M - totalNeeded) % N == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }
    }
}
