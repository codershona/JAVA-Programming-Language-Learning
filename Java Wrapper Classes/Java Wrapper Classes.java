// Java Wrapper Classes
// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

// The table below shows the primitive type and the equivalent wrapper class:

// Primitive Data Type	| Wrapper Class
// byte	                |Byte
// short	            |Short
// int	                |Integer
// long	                |Long
// float	            |Float
// double	            |Double
// boolean	            |Boolean
// char	                |Character
// Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):

// Example
// ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
// ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

import java.util.ArrayList;

public class MyClass { 
  public static void main(String[] args) { 
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  } 
}

