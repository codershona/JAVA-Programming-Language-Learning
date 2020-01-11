package mypack;

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}

//methods works in command prompt.
// Multiple Interfaces
// To implement multiple interfaces, separate them with a comma:

// Example
// interface FirstInterface {
//   public void myMethod(); // interface method
// }

// interface SecondInterface {
//   public void myOtherMethod(); // interface method
// }

// class DemoClass implements FirstInterface, SecondInterface {
//   public void myMethod() {
//     System.out.println("Some text..");
//   }
//   public void myOtherMethod() {
//     System.out.println("Some other text...");
//   }
// }

// class MyMainClass {
//   public static void main(String[] args) {
//     DemoClass myObj = new DemoClass();
//     myObj.myMethod();
//     myObj.myOtherMethod();
//   }
// }
