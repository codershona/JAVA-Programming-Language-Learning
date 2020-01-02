// Java Strings
// Strings are used for storing text.

// A String variable contains a collection of characters surrounded by double quotes:

// Example
// Create a variable of type String and assign it a value:

// String greeting = "Hello";


public class MyClass {
  public static void main(String[] args) {
    String greeting = "Hello dear, how are you?";
    System.out.println(greeting);
  }
}



// String Length
// A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

// Example
// String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
// System.out.println("The length of the txt string is: " + txt.length());


public class MyClass {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
  }
}



// More String Methods
// There are many string methods available, for example toUpperCase() and toLowerCase():

// Example
// String txt = "Hello World";
// System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
// System.out.println(txt.toLowerCase());   // Outputs "hello world"




public class MyClass {
  public static void main(String[] args) {
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
  }
}


// Finding a Character in a String
// The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

// Example
// String txt = "Please locate where 'locate' occurs!";
// System.out.println(txt.indexOf("locate")); // Outputs 7



public class MyClass {
  public static void main(String[] args) {
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
  }
}


// Java counts positions from zero.
// 0 is the first position in a string, 1 is the second, 2 is the third ...


// String Concatenation
// The + operator can be used between strings to combine them. This is called concatenation:

// Example
// String firstName = "John";
// String lastName = "Doe";
// System.out.println(firstName + " " + lastName);



public class MyClass {
  public static void main(String args[]) {
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);
  }
}



// Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

// You can also use the concat() method to concatenate two strings:

// Example
// String firstName = "John ";
// String lastName = "Doe";
// System.out.println(firstName.concat(lastName));




public class MyClass {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
  }
}




// Special Characters
// Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

// String txt = "We are the so-called "Vikings" from the north.";
// The solution to avoid this problem, is to use the backslash escape character.

// The backslash (\) escape character turns special characters into string characters:

// Escape character	|Result	      |Description
// \'	            |'	          |Single quote
// \"	            |"	          |Double quote
// \\	            |\	          |Backslash
// The sequence \"  inserts a double quote in a string:

// Example
// String txt = "We are the so-called \"Vikings\" from the north.";

public class MyClass {
  public static void main(String[] args) {
    String txt = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt);
  }
}



// The sequence \'  inserts a single quote in a string:

// Example
// String txt = "It\'s alright.";


public class MyClass {
  public static void main(String[] args) {
    String txt = "It\'s alright.";
    System.out.println(txt);
  }
}


// The sequence \\  inserts a single backslash in a string:

// Example
// String txt = "The character \\ is called backslash.";


public class MyClass {
  public static void main(String[] args) {
    String txt = "The character \\ is called backslash.";
    System.out.println(txt);
  }
}



// Six other escape sequences are valid in Java:

// Code	     |Result	
// \n	     |New Line	
// \r	     |Carriage Return	
// \t	     |Tab	
// \b	     |Backspace	
// \f	     |Form Feed


// Adding Numbers and Strings
// WARNING!

// Java uses the + operator for both addition and concatenation.

// Numbers are added. Strings are concatenated.

// If you add two numbers, the result will be a number:

// Example
// int x = 10;
// int y = 20;
// int z = x + y;      // z will be 30 (an integer/number)


public class MyClass {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = x + y;
    System.out.println(z);
  }
}



// If you add two strings, the result will be a string concatenation:

// Example
// String x = "10";
// String y = "20";
// String z = x + y;   // z will be 1020 (a String)



public class MyClass {
  public static void main(String[] args) {
    String x = "10";
    String y = "20";
    String z = x + y;
    System.out.println(z);
  }
}



// If you add a number and a string, the result will be a string concatenation:

// Example
// String x = "10";
// int y = 20;
// String z = x + y;   // z will be 1020 (a String)


public class MyClass {
  public static void main(String[] args) {
    String x = "10";
    int y = 20;
    String z = x + y;
    System.out.println(z);
  }
}



