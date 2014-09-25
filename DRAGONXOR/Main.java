import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();

    int N = 0;
    String A = null;
    String B = null;
    StringBuilder bit = new StringBuilder();
    for (int i = 0; i < cases; i++) {
      N = in.nextInt();
      A = Integer.toBinaryString(in.nextInt());
      B = Integer.toBinaryString(in.nextInt());

      while (A.length() < N) {
        A = "0" + A;
      }

      while (B.length() < N) {
        B = "0" + B;
      }

      bit.setLength(0);
      for (int j = 0; j < N; j++) {
        char currChar = A.charAt(j);

        int lenB = B.length();
        for (int k = 0; k < lenB; k++) {
          if (currChar != B.charAt(k)) {
            bit.append("1");
            B = B.substring(0, k) + B.substring(k + 1);
            break;
          }
        }
      }

      while (bit.length() < N) {
        bit.append("0");
      }

      System.out.println(Integer.parseInt(bit.toString(), 2));
    }
  }
}
