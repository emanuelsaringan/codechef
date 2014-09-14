import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    StringBuilder chefBuffer = new StringBuilder();
    StringBuilder asstBuffer = new StringBuilder();
    int cases = in.nextInt();
    for (int i = 0; i < cases; i++) {
      int m = in.nextInt();
      int n = in.nextInt();

      boolean[] dishes = new boolean[m];
      for (int j = 0; j < n; j++) {
        dishes[in.nextInt() - 1] = true;
      }

      chefBuffer.setLength(0);
      asstBuffer.setLength(0);
      
      boolean isChef = true;
      for (int j = 0; j < m; j++) {
        if (!dishes[j]) {
          if (isChef) {
            chefBuffer.append(j + 1).append(" ");
          } else {
            asstBuffer.append(j + 1).append(" ");
          }

          isChef = !isChef;
        }
      }

      System.out.println(chefBuffer.toString());
      System.out.println(asstBuffer.toString());
    }
  }
}
