import java.util.Scanner; // import the Scanner class 

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}

// it does not need to create your own package. It normally works in terminal when you run it.
// Java User Input
// The Scanner class is used to get user input, and it is found in the java.util package.

// To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

// Example
// import java.util.Scanner;  // Import the Scanner class

// class MyClass {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();  // Read user input
//     System.out.println("Username is: " + userName);  // Output user input
//   }
// }