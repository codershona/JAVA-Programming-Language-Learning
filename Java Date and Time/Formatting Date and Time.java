// Formatting Date and Time
// The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the "T" and milliseconds from the date-time:

// Example
// import java.time.LocalDateTime; // Import the LocalDateTime class
// import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

// public class MyClass {
//   public static void main(String[] args) {
//     LocalDateTime myDateObj = LocalDateTime.now();
//     System.out.println("Before formatting: " + myDateObj);
//     DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

//     String formattedDate = myDateObj.format(myFormatObj);
//     System.out.println("After formatting: " + formattedDate);
//   }
// }
// The output will be:

// Before Formatting: 2020-01-11T09:06:27.694375
// After Formatting: 11-01-2020 09:06:27


import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After formatting: " + formattedDate);  
  }  
}  






// The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:

// Value	        |Example	
// yyyy-MM-dd	    |"1988-09-29"	
// dd/MM/yyyy	    |"29/09/1988"	
// dd-MMM-yyyy	    |"29-Sep-1988"	
// E, MMM dd yyyy	|"Thu, Sep 29 1988"


//Value yyyy-MM-dd:

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After formatting: " + formattedDate);  
  }  
}  


//Value: dd/MM/yyyy

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before Formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After Formatting: " + formattedDate);  
  }  
}  



//Value dd-MMM-yyyy

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before Formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After Formatting: " + formattedDate);  
  }  
}  



//Value E, MMM dd yyyy


import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {  
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before Formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After Formatting: " + formattedDate);  
  }  
}  


