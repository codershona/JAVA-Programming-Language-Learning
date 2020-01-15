import java.io.File; 

public class GetFileInfo {  
  public static void main(String[] args) {  
    File myObj = new File("filename.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName()); 
      System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
      System.out.println("Writeable: " + myObj.canWrite()); 
      System.out.println("Readable: " + myObj.canRead()); 
      System.out.println("File size in bytes: " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }  
} 


// Get File Information
// To get more information about a file, use any of the File methods:

// Example
// import java.io.File;  // Import the File class

// public class GetFileInfo { 
//   public static void main(String[] args) {
//     File myObj = new File("filename.txt");
//     if (myObj.exists()) {
//       System.out.println("File name: " + myObj.getName());
//       System.out.println("Absolute path: " + myObj.getAbsolutePath());
//       System.out.println("Writeable: " + myObj.canWrite());
//       System.out.println("Readable " + myObj.canRead());
//       System.out.println("File size in bytes " + myObj.length());
//     } else {
//       System.out.println("The file does not exist.");
//     }
//   }
// }
// The output will be:

// File name: filename.txt
// Absolute path: C:\Users\MyName\filename.txt
// Writeable: true
// Readable: true
// File size in bytes: 0
// Note: There are many available classes in the Java API that can be used to read and write files in Java: FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc. Which one to use depends on the Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc.
