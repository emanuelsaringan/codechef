import java.util.*;

public class CountSubstrings {
    public static void main (String[] args)  {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String garbage = in.next();
            String N = in.next();
            long n = 0;
            for (int j = 0; j < N.length(); j++) {
                if (N.charAt(j) == '1') {
                    n++;
                }
            }
            
            if (n % 2 == 0) {
                System.out.println(n + ((n >> 1) * (n - 1)));
            } else {
                System.out.println(n + (((n - 1) >> 1) * n));
            }
        }
    }
}
