// Modifiers
// By now, you are quite familiar with the public keyword that appears in almost all of our examples:

// public class MyClass
// The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

// We divide modifiers into two groups:

// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other functionality
// Access Modifiers
// For classes, you can use either public or default:

// Modifier  |	Description	
// public	  |The class is accessible by any other class	
// default	  |The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter.


// public 

public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}


// default

class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}



// For attributes, methods and constructors, you can use the one of the following:

// Modifier	 |Description	
// public	 |The code is accessible for all classes	
// private	 |The code is only accessible within the declared class	
// default	 |The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
// protected |The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter.

// Example : Public

class MyClass {
  public static void main(String[] args) {
    Person myObj = new Person(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}


// or,


public class Person {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
}



// Example : Private


public class Person {
  private String fname = "John";
  private String lname = "Doe";
  private String email = "john@doe.com";
  private int age = 24;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}


// Example : default

class Person {
  String fname = "John";
  String lname = "Doe";
  String email = "john@doe.com";
  int age = 24;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}


// Example : protected

class Person {
  protected String fname = "John";
  protected String lname = "Doe";
  protected String email = "john@doe.com";
  protected int age = 24;
}

class Student extends Person {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}



// Non-Access Modifiers
// For classes, you can use either final or abstract:

// Modifier	|Description	
// final	    |The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)	
// abstract	|The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters).



// final

final class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myFastCar = new Car();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
//error will show.

// abstract


class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 
    
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}


//or,

// abstract class
abstract class Person {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() {
    System.out.println("Studying all day long");
  }
}


// For attributes and methods, you can use the one of the following:

// Modifier	      |Description
// final	      |Attributes and methods cannot be overridden/modified
// static	      |Attributes and methods belongs to the class, rather than an object
// abstract	      |Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
// transient      |Attributes and methods are skipped when serializing the object containing them
// synchronized	  |Methods can only be accessed by one thread at a time
// volatile	      |The value of an attribute is not cached thread-locally, and is always read from the "main memory".


public class MyClass {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 50; // will generate an error
    myObj.PI = 25; // will generate an error
    System.out.println(myObj.x); 
  }
}

// this will show an error.

// Static
// A static method means that it can be accessed without creating an object of the class, unlike public:

// Example
// An example to demonstrate the differences between static and public methods:

// public class MyClass {
//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   // Main method
//   public static void main(String[ ] args) {
//     myStaticMethod(); // Call the static method
//     // myPublicMethod(); This would output an error

//     MyClass myObj = new MyClass(); // Create an object of MyClass
//     myObj.myPublicMethod(); // Call the public method
//   }
// }
 

 public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}



// Abstract
// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

// Example
// // Code from filename: Person.java
// // abstract class
// abstract class Person {
//   public String fname = "John";
//   public int age = 24;
//   public abstract void study(); // abstract method
// }

// // Subclass (inherit from Person)
// class Student extends Person {
//   public int graduationYear = 2018;
//   public void study() { // the body of the abstract method is provided here
//     System.out.println("Studying all day long");
//   }
// }
// // End code from filename: Person.java

// // Code from filename: MyClass.java
// class MyClass {
//   public static void main(String[] args) {
//     // create an object of the Student class (which inherits attributes and methods from Person)
//     Student myObj = new Student();

//     System.out.println("Name: " + myObj.fname);
//     System.out.println("Age: " + myObj.age);
//     System.out.println("Graduation Year: " + myObj.graduationYear);
//     myObj.study(); // call abstract method
//   }
// }


class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 
    
    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}


//or,

// abstract class
abstract class Person {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}







 


