package mypack;

public class MyClass { 
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
  } 
}


//methods works.

// Enum inside a Class
// You can also have an enum inside a class:

// Example
// public class MyClass {
//   enum Level {
//     LOW,
//     MEDIUM,
//     HIGH
//   }

//   public static void main(String[] args) {
//     Level myVar = Level.MEDIUM; 
//     System.out.println(myVar);
//   }
// }
// The output will be:

// MEDIUM
