
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class StringTokenizerExample2 {
  public static void main(String[] args)throws java.lang.Exception {
    FileReader fr = new FileReader("stringinput.txt");
    BufferedReader br = new BufferedReader(fr);
    String line;
    int sum = 0;
    while((line = br.readLine()) != null){
      StringTokenizer str = new StringTokenizer(line);
      while(str.hasMoreTokens()){
        String intstr = str.nextToken();
        int num = Integer.parseInt(intstr);
        System.out.println(num);
        sum += num;
      }
    }
    System.out.println("sum is : " + sum);
  }


}
