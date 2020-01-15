import java.io.File; 

public class DeleteFolder {
  public static void main(String[] args) { 
    File myObj = new File("C:\\Users\\MyName\\Test"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    } 
  } 
}


//javac DeleteFolder.java
//javac -d . DeleteFolder.java
//java DeleteFolder


// Delete a Folder
// You can also delete a folder. However, it must be empty:

// Example
// import java.io.File; 

// public class DeleteFolder {
//   public static void main(String[] args) { 
//     File myObj = new File("C:\\Users\\MyName\\Test"); 
//     if (myObj.delete()) { 
//       System.out.println("Deleted the folder: " + myObj.getName());
//     } else {
//       System.out.println("Failed to delete the folder.");
//     } 
//   } 
// }
// The output will be:

// Deleted the folder: Test