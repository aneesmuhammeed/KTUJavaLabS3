import java.util.*;

public class StringTokenizerExample {
  public static void main(String[] args) {
    System.out.println("Enter a line of integer seperated by spaces");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine(); 
    StringTokenizer st1 = new StringTokenizer(str);

    int sum = 0;
    while(st1.hasMoreTokens()){
      String token = st1.nextToken();
      int tokenint = Integer.parseInt(token);
      System.out.println(tokenint);
      sum += tokenint;
    }
    System.out.println("sum is : " + sum);
  }
}
