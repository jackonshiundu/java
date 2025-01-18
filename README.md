# java

# Hello.java

Prerequisites
To run this Java program, you need the following:

Java Development Kit (JDK) installed on your system. You can download it from the official Oracle website: Download JDK.
A text editor (such as Visual Studio Code, IntelliJ IDEA, or Notepad++) to edit the code.
Command Line Interface (CLI) (Terminal on Mac/Linux or Command Prompt on Windows) to run the program.
Running the Program
Steps:
Install Java: Ensure you have Java installed by running the following command in your terminal or command prompt:

java -version
If Java is installed, you'll see the Java version. If not, please install it following the instructions from the link above.

Download/Clone the Code: Copy the provided code into a file named Hello.java.

Navigate to the File Directory: Open a terminal or command prompt and navigate to the directory where Hello.java is located.

Compile the Program: Compile the program using the following command:

javac Hello.java
Run the Program: After compiling, run the program with:

java Hello
The program will execute, and you will see the output printed to the console.

Code Explanation

1. Data Types and Type Conversion:
   Primitive Data Types: The program demonstrates various primitive data types including int, float, boolean, and char.
   Type Conversion: The code covers both implicit and explicit casting between different data types.
   Implicit casting happens automatically when moving from a smaller data type to a larger one (e.g., int to long).
   Explicit casting is required when moving from a larger data type to a smaller one (e.g., long to int).
2. Arithmetic Operations:
   The program demonstrates basic arithmetic operations like addition, and also introduces post-increment (num++) and pre-increment (++num).
3. Relational Operators:
   The program uses relational operators like ==, !=, <, and > to compare values.
4. Logical Operators:
   Demonstrates the use of logical operators such as:
   && (AND)
   || (OR)
   ! (NOT)
5. Ternary Operator:
   The program includes a simple ternary operator, which is a compact form of an if-else statement.
6. Switch Statement:
   The program uses a switch statement to print the corresponding day of the week based on an integer value (1 for Monday, 2 for Thursday, etc.).
7. Loops:
   The program includes three types of loops:

While Loop: A loop that continues as long as the condition is true.
Do-While Loop: Similar to a while loop, but it guarantees at least one execution of the code block.
For Loop: A loop with initialization, condition check, and iteration in a single line.
The program demonstrates each type of loop with example outputs printed to the console

# Classes.java

This Java program demonstrates the concept of method overloading in the Calculator class. The program defines multiple versions of the add method with different parameter lists, showcasing how method overloading allows the same method name to handle different types and numbers of parameters.

1. Calculator Class
   The Calculator class contains several versions of the add method, each with a different parameter list.

   Instance Variable:

   int a: This variable is declared but not used in this program.
   Methods:

   public int add(int n1, int n2): This method accepts two integer parameters, adds them together, and returns the result as an integer.
   public int add(int n1, int n2, int n3): This overloaded version of the add method accepts three integer parameters, adds them together, and returns the result as an integer.
   public double add(double n1, int n2, int n3): This version of the add method accepts a double and two int parameters. It adds them together and returns the result as a double.

2. Main Method (Entry Point)
   The main method is the entry point of the program. It demonstrates the usage of the Calculator class and method overloading.

   An object of the Calculator class (calc) is created.
   The add(int n1, int n2, int n3) method is called with three integer parameters (4, 5, and 5). The result (14) is printed to the console.

3. Output:
   The program outputs:

   The result of adding three integers using the overloaded add method, which is 14.

4. Key Concept Demonstrated:
   Method Overloading: The program demonstrates method overloading by defining multiple versions of the add method with different parameter types and numbers. This allows the same method name to perform different types of addition operations.
5. Explanation of Method Overloading:
   Method overloading allows you to define multiple methods with the same name in the same class, as long as they differ in the number or type of parameters.
   In this program, the add method is overloaded three times to handle two integers, three integers, and one double along with two integers.
6. Conclusion:
   This program serves as an example of how to use method overloading in Java. It shows how different parameter types or counts can allow the same method name to perform similar operations but with different input data. This is a powerful feature in object-oriented programming, making code more readable and easier to maintain.

# Arrays.Java

This Java program demonstrates various concepts related to arrays, including single-dimensional arrays, multi-dimensional arrays, jagged arrays, and using objects within arrays. Additionally, it shows how to use enhanced for loops for iteration. The program also defines a Student class to demonstrate working with objects in arrays.

1. Student Class
   The Student class contains three fields:

   int rollNo: Represents the student's roll number.
   String name: Represents the student's name.
   int marks: Represents the student's marks.
   This class is used to create Student objects, which are later stored in an array.

2. Main Method (Entry Point)
   The main method demonstrates various types of arrays and their usage.

   a. Single-Dimensional Arrays
   Creating and Re-assigning Values:
   The program creates an integer array nums and initializes it with values {3, 5, 8, 9}. The second element (nums[1]) is updated to 10.
   A second array nums2 is created using the new keyword with a size of 5. The values are then assigned individually to the elements.
   The program prints the values of nums2 using a simple for loop.
   b. Multi-Dimensional Arrays
   A 2D array multiDimenArray is created with dimensions 3x4 (3 rows and 4 columns).
   The array is populated with random values between 0 and 99 using Math.random().
   The values of the 2D array are printed using two nested for loops, followed by printing the values using an enhanced for loop (also known as a "foreach" loop).
   c. Jagged Arrays
   A jagged array numArrays is created, where each row can have a different number of columns. In this example:
   The first row has 3 elements.
   The second row has 6 elements.
   The third row has 4 elements.
   Each element in the jagged array is populated with random values using Math.random().
   The jagged array is printed using an enhanced for loop.
   d. Arrays of Objects
   Three Student objects (s1, s2, s3) are created, and their properties (roll number, name, and marks) are set.
   These Student objects are stored in a Student array called students.
   The program uses an enhanced for loop to print out the name and marks of each student.

3. Output:
   The program produces the following outputs:

   The values of the nums2 array after reassigning certain elements.
   The randomly generated values in the multiDimenArray (2D array).
   The randomly generated values in the numArrays (jagged array).
   The names and marks of each student in the students array.

4. Key Concepts Demonstrated:
   Single-Dimensional Arrays: Arrays that store a collection of elements of the same type.
   Multi-Dimensional Arrays: Arrays that store other arrays, such as 2D arrays, to represent matrices or grids.
   Jagged Arrays: Arrays of arrays where each sub-array can have a different size.
   Enhanced For Loop: A more concise loop used to iterate over arrays and collections.
   Objects in Arrays: How to store and access objects (in this case, Student objects) within arrays.
5. Conclusion:
   This program provides examples of:

Creating and using single-dimensional, multi-dimensional, and jagged arrays.
Using random values to populate arrays.
Working with objects (i.e., Student objects) stored in arrays.
Iterating over arrays with both traditional and enhanced for loops.
This program is useful for understanding basic array manipulation, object-oriented programming with classes, and various array types in Java.
