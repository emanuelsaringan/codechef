import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    int n = 0;
    for (int i = 0; i < cases; i++) {
      n = in.nextInt();

      if (n % 2 == 0) {
        System.out.println(n);
      } else {
        System.out.println(n - 1);
      }
    }
  }
}
