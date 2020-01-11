package mypack;

class OuterClass {
    int x = 10;
  
    static class InnerClass {
      int y = 5;
    }
  }
  
  public class MyMainClass {
    public static void main(String[] args) {
      OuterClass.InnerClass myInner = new OuterClass.InnerClass();
      System.out.println(myInner.y);
    }
  }

  // Method run succesfully.
//   Static Inner Class
// An inner class can also be static, which means that you can access it without creating an object of the outer class:

// Example:
// Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.


