import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long N = in.nextLong();
            long K = in.nextLong();
            long M = in.nextLong();

            while (K != 1 && N % K == 0) {
                N /= K;
                M--;
            }

            if (M % 2 == 0) {
                System.out.println(N);
            } else {
                System.out.println(N * K);
            }
        }
    }
}
