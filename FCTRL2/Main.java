import java.util.Scanner;
import java.math.BigInteger;
import java.util.HashMap;

public class Main {
  private static HashMap<Integer, BigInteger> hash = null;
  
  public static void main(String[] args) {
    initHash();
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    
    for (int i = 0; i < cases; i++) {
      System.out.println(hash.get(in.nextInt()));
    }
  }
  
  private static final void initHash() {
    hash = new HashMap<Integer, BigInteger>();
    hash.put(0, BigInteger.ONE);
    
    for (int i = 1; i <= 100; i++) {
      hash.put(i, hash.get(i - 1).multiply(BigInteger.valueOf(i)));
    }
  }
}
