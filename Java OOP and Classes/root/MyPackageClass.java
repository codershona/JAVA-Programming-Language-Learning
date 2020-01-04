package mypack;

class MyPackageClass { 
  public static void main(String[] args) { 
    System.out.println("This is my package!"); 
  } 
}

// Save the file as MyPackageClass.java, and compile it:

// C:\Users\Your Name>javac MyPackageClass.java
// Then compile the package:

// C:\Users\Your Name>javac -d . MyPackageClass.java
// This forces the compiler to create the "mypack" package.

// The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.

// Note: The package name should be written in lower case to avoid conflict with class names.

// When we compiled the package in the example above, a new folder was created, called "mypack".

// To run the MyPackageClass.java file, write the following:

// C:\Users\Your Name>java mypack.MyPackageClass
// The output will be:

// This is my package!

