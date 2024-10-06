public class StaticInternetUser {

  //static variables
  static int count = 0;
  static int happyCustomers; 

  final static int MAXTIME = 2; 
  String loginName;

  //static block to display welcome messages
  static {
      System.out.println("Let's start browsing!");
      System.out.println("Maximum allotted time for browsing: " + MAXTIME + " hours");
      happyCustomers = count; //intially happycustomer = 0
  }

  
  StaticInternetUser(String loginName) {
      this.loginName = loginName;
      count++;
  }

  // Static method to show number of internet users and happy customers
  static void show() {
      System.out.println("Number of Internet Users: " + count);
      System.out.println("Happy Customers: " + happyCustomers);
  }

  // Non-static method (Normal method) to increment happyCustomers if the customer is happy
  void compute(boolean isHappy) {
      if (isHappy) {
          happyCustomers++;
          System.out.println(loginName + " is happy!");
      } else {
          System.out.println(loginName + " is not happy.");
      }
  }

  public static void main(String[] args) {

      StaticInternetUser user1 = new StaticInternetUser("Anees");
      user1.compute(true);
      
      StaticInternetUser.show();



      StaticInternetUser user2 = new StaticInternetUser("Rigzin");
      user2.compute(false); 

      StaticInternetUser.show();
  }
}
