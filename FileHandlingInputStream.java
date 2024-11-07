import java.io.*;
import java.lang.*;
public class FileHandlingInputStream {
  public static void main(String[] args)throws java.lang.Exception {
    FileOutputStream ft = new FileOutputStream(new File("fake.txt")); 
    String str = "OOPs LAB";
    for (int i = 0; i < str.length(); i++) {
        ft.write(str.charAt(i));
    }

    FileInputStream fi = new FileInputStream( new File("fake.txt"));

    int i;
    while ((i = fi.read()) != -1) {
      System.out.println((char)i);
    }
    ft.close();
    fi.close();
  }  
}
