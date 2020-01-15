import java.io.File; 

public class DeleteFile {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}


//javac DeleteFile.java
//javac -d . DeleteFile.java
//java DeleteFile


// Delete a File
// To delete a file in Java, use the delete() method:

// Example
// import java.io.File;  // Import the File class

// public class DeleteFile {
//   public static void main(String[] args) { 
//     File myObj = new File("filename.txt"); 
//     if (myObj.delete()) { 
//       System.out.println("Deleted the file: " + myObj.getName());
//     } else {
//       System.out.println("Failed to delete the file.");
//     } 
//   } 
// }
// The output will be:

// Deleted the file: filename.txt