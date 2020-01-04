// Java Constructors
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

// Example
// Create a constructor:

// // Create a MyClass class
// public class MyClass {
//   int x;  // Create a class attribute

//   // Create a class constructor for the MyClass class
//   public MyClass() {
//     x = 5;  // Set the initial value for the class attribute x
//   }

//   public static void main(String[] args) {
//     MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
//     System.out.println(myObj.x); // Print the value of x
//   }
// }

// Outputs 5

// Create a MyClass class
public class MyClass {
  int x;

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}



// Note that the constructor name must match the class name, and it cannot have a return type (like void).

// Also note that the constructor is called when the object is created.

// All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

// Constructor Parameters
// Constructors can also take parameters, which is used to initialize attributes.

// The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:

// Example
// public class MyClass {
//   int x;

//   public MyClass(int y) {
//     x = y;
//   }

//   public static void main(String[] args) {
//     MyClass myObj = new MyClass(5);
//     System.out.println(myObj.x);
//   }
// }

// Outputs 5


public class MyClass {
  int x;

  public MyClass(int y) {
    x = y;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(5);
    System.out.println(myObj.x);
  }
}


// You can have as many parameters as you want:

// Example
// public class Car {
//   int modelYear;
//   String modelName;

//   public Car(int year, String name) {
//     modelYear = year;
//     modelName = name;
//   }

//   public static void main(String[] args) {
//     Car myCar = new Car(1969, "Mustang");
//     System.out.println(myCar.modelYear + " " + myCar.modelName);
//   }
// }

// Outputs 1969 Mustang
 

public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}


