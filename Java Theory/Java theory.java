Java is a programming language.

Java is used to develop mobile apps, web apps, desktop apps, games and much more.
Our "Show Java" tool makes it easy to learn Java, it shows both the code and the result.

Example
public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

Java is an object oriented language and some concepts may be new. Take breaks when needed, and go over the examples as many times as needed.

What is Java?
Java is a popular programming language, created in 1995.

It is owned by Oracle, and more than 3 billion devices run Java.

It is used for:

Mobile applications (specially Android apps)
Desktop applications
Web applications
Web servers and application servers
Games
Database connection
And much, much more!
Why Use Java?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming language in the world
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has a huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa
Get Started
This tutorial will teach you the basics of Java.

It is not necessary to have any prior programming experience.


===  Java Install :
Some PCs might have Java already installed.

To check if you have Java installed on a Windows PC, search in the start bar for Java or type the following in Command Prompt (cmd.exe):

C:\Users\Your Name>java -version
If Java is installed, you will see something like this (depending on version):

java version "11.0.1" 2018-10-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)
If you do not have Java installed on your computer, you can download it for free from oracle.com.

Note: In this tutorial, we will write Java code in a text editor. However, it is possible to write Java in an Integrated Development Environment, such as IntelliJ IDEA, Netbeans or Eclipse, which are particularly useful when managing larger collections of Java files.

Setup for Windows
To install Java on Windows:

Go to "System Properties" (Can be found on Control Panel > System and Security > System > Advanced System Settings)
Click on the "Environment variables" button under the "Advanced" tab
Then, select the "Path" variable in System variables and click on the "Edit" button
Click on the "New" button and add the path where Java is installed, followed by \bin. By default, Java is installed in C:\Program Files\Java\jdk-11.0.1 (If nothing else was specified when you installed it). In that case, You will have to add a new path with: C:\Program Files\Java\jdk-11.0.1\bin
Then, click "OK", and save the settings
At last, open Command Prompt (cmd.exe) and type java -version to see if Java is running on your machine

Java Quickstart
In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called MyClass.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:

MyClass.java

public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

Don't worry if you don't understand the code above - we will discuss it in detail in later chapters. For now, focus on how to run the code above.

Save the code in Notepad as "MyClass.java". Open Command Prompt (cmd.exe), navigate to the directory where you saved your file, and type "javac MyClass.java":

C:\Users\Your Name>javac MyClass.java
This will compile your code. If there are no errors in the code, the command prompt will take you to the next line. Now, type "java MyClass" to run the file:

C:\Users\Your Name>java MyClass
The output should read:

Hello World
Congratulations! You have written and executed your first Java program.
