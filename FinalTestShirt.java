
import java.util.Scanner;




class Shirt{
  double collarSize;  
  double sleeveLength;
  final String material = "cotton";

  Shirt(double collarSize,double sleeveLength){
    this.collarSize=collarSize;
    this.sleeveLength=sleeveLength;
  }
  void display(){
    System.out.println("Shirt Details:");
        System.out.println("Collar Size: " + collarSize + " inches");
        System.out.println("Sleeve Length: " + sleeveLength + " inches");
        System.out.println("Material: " + material);
        System.out.println("----------------------------------");
  }
}



public class FinalTestShirt {
  public static void main(String[] args) {
    //Object Creation with constructor overloading
    Shirt shirt1 = new Shirt(15.5, 34);
    Shirt shirt2 = new Shirt(16.0, 36);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter collarsize : ");
    double collarSize = sc.nextDouble();
    System.out.print("Enter sleevelength : ");
    double sleeveLength = sc.nextDouble();
    Shirt shirt3 = new Shirt(collarSize, sleeveLength);

    //display the specs of each shirt
    shirt1.display();
    shirt2.display();
    shirt3.display();
}
}
