mport java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    
    for (int i = 0; i < cases; i++) {
      System.out.println(rpn(in.next()));
    }
  }
  
  private static final String rpn(String line) {
    if (line == null || "".equals(line)) {
      return "";
    }
    
    List<Token> tokens = new ArrayList<Token>();
    for (int i = 0; i < line.length(); i++) {
      tokens.add(new Token(line.charAt(i) + ""));
    }
    
    Stack<Token> stack = new Stack<Token>();
    stack.push(tokens.get(0));
    int i = 1;
    Token t = null;
    while (i < tokens.size()) {
      t = tokens.get(i++);
      
      if (")".equals(t.content)) {
        Token op2 = stack.pop();
        Token op = stack.pop();
        Token op1 = stack.pop();
        Token paren = stack.pop();
        
        stack.push(new Token(op1.content + op2.content + op.content));
      } else {
        stack.push(t);
      }
    }
    
    return stack.pop().content;
  }
}

class Token {
  public String content;
  
  public Token(String c) {
    content = c;
  }
}
