// Creating Wrapper Objects
// To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:

// Example
// public class MyClass {
//   public static void main(String[] args) {
//     Integer myInt = 5;
//     Double myDouble = 5.99;
//     Character myChar = 'A';
//     System.out.println(myInt);
//     System.out.println(myDouble);
//     System.out.println(myChar);
//   }
// }


public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}


// Since you're now working with objects, you can use certain methods to get information about the specific object.

// For example, the following methods are used to get the value associated with the corresponding wrapper object: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

// This example will output the same result as the example above:

// Example
// public class MyClass {
//   public static void main(String[] args) {
//     Integer myInt = 5;
//     Double myDouble = 5.99;
//     Character myChar = 'A';
//     System.out.println(myInt.intValue());
//     System.out.println(myDouble.doubleValue());
//     System.out.println(myChar.charValue());
//   }
// }


public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}

//or,

public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}


// Another useful method is the toString() method, which is used to convert wrapper objects to strings.

// In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":

// Example
// public class MyClass {
//   public static void main(String[] args) {
//     Integer myInt = 100;
//     String myString = myInt.toString();
//     System.out.println(myString.length());
//   }
// }


public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 100; 
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}



