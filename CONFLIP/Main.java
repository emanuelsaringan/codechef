import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();

    for (int h = 0; h < cases; h++) {
      int rounds = in.nextInt();

      for (int j = 0; j < rounds; j++) {
        int i = in.nextInt();
        int n = in.nextInt();
        int q = in.nextInt();

        if (n % 2 == 0) {
          System.out.println(n / 2);
        } else {
          if (i == q) {
            System.out.println(n / 2);
          } else {
            System.out.println(n / 2 + 1);
          }
        }
      }
    }
  }
}
