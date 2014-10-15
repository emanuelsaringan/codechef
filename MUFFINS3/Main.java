import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    for (int i = 0; i < cases; i++) {
      System.out.println((in.nextInt() / 2) + 1);
    }
  }
}
