class Patient{
  int IDnumber;
  int age;
  String BloodData;

  // Default constructor
  Patient(){
    IDnumber = 0;
    age = 0;
    BloodData = "B+";
  }

  // Overloaded constructor
  Patient(int id, int age, String BloodData) {
    IDnumber = id;
    this.age = age;
    this.BloodData = BloodData;
  }

  int getID(){
    return IDnumber;
  }

  int getAge(){
    return age;
  }

  String getBloodData(){
    return BloodData;
  }
}

class ConstructorOverloading {
  public static void main(String[] args) {
    // Testing the default constructor
    Patient patient1 = new Patient();
    System.out.println("Patient 1: ");
    System.out.println("ID: " + patient1.getID());
    System.out.println("Age: " + patient1.getAge());
    System.out.println("Blood Data: " + patient1.getBloodData());
    
    System.out.println("\n");

    // Testing the overloaded constructor
    Patient patient2 = new Patient(123456,46,"0+");
    System.out.println("Patient 2: ");
    System.out.println("ID: " + patient1.getID());
    System.out.println("Age: " + patient1.getAge());
    System.out.println("Blood Data: " + patient1.getBloodData());
  }  
}
