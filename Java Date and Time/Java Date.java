// Java Dates
// Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

// Class	Description
// LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
// LocalTime	Represents a time (hour, minute, second and milliseconds (HH-mm-ss-zzz))
// LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss.zzz)
// DateTimeFormatter	Formatter for displaying and parsing date-time objects
// If you don't know what a package is, read our Java Packages Tutorial.

// Display Current Date
// To display the current date, import the java.time.LocalDate class, and use its now() method:

// Example
// import java.time.LocalDate; // import the LocalDate class

// public class MyClass {
//   public static void main(String[] args) {
//     LocalDate myObj = LocalDate.now(); // Create a date object
//     System.out.println(myObj); // Display the current date
//   }
// }
// The output will be:

// 2020-01-11


import java.time.LocalDate;  // import the LocalDate class

public class MyClass {  
  public static void main(String[] args) {  
    LocalDate myObj = LocalDate.now();  // Create a date object
    System.out.println(myObj);  // Display the current date
  }  
}  

