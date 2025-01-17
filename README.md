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
6. Static Key word
   Static VAriables Are same accross all the object instance of the class and they are accessed using teh Class name. i.e Pesrson.age(in this context age is the static Variable).
   In this class section we also talk about the static key word in java and we see that ststic method only work with static variables and if yoy wornt it to work with other variable you make sure you refer the object you want to work with as parameters. but for non-static methods you can work with static key word.
   We also went and looked further on static bloc in side a class and this can be used as the best way to initialize static variables.

7. Conclusion:
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

# Strings.Java

This Java program demonstrates the use of immutable strings (String class) and mutable strings (StringBuffer class). It provides an overview of the key differences between these two types of string handling in Java, and showcases how to modify a string with StringBuffer.

1. Introduction to Immutable Strings
   In Java, String objects are immutable, which means once a string is created, its value cannot be changed. When you modify a string (e.g., reassigning a new value to it), Java creates a new string object with the new value and points to a new memory location. This is explained in the comment within the code:

   String name = "Jackon";
   System.out.println(name);
   Here, the String variable name holds the value "Jackon". If you were to modify this string later, a new string object would be created.

2. Mutable Strings with StringBuffer
   While String is immutable, Java provides mutable strings through the StringBuffer class. StringBuffer allows you to modify the contents of the string without creating a new object each time. The StringBuffer class provides several methods to manipulate strings, such as insert(), append(), and more.

   Example with StringBuffer:

   StringBuffer namer = new StringBuffer("Hello Namer");
   namer.insert(7, "Java"); // Inserts "Java" at index 7 in the StringBuffer
   System.out.println(namer.append("Jackon")); // Appends "Jackon" to the current string
   insert(int offset, String str): Inserts the specified string ("Java") at the specified index (7 in this case) within the StringBuffer.
   append(String str): Appends the specified string ("Jackon") to the end of the current string in the StringBuffer.

3. Converting StringBuffer to String
   Once you have modified a StringBuffer object and want to convert it back to a regular String, you can use the toString() method.

   java
   Copy
   String btos = namer.toString();
   This converts the modified StringBuffer to a String object, allowing you to treat it as an immutable string if needed.

4. Key Concepts Demonstrated:
   Immutable Strings: The String class in Java is immutable, meaning once a string is created, its value cannot be changed. Reassigning a string creates a new object in memory.
   Mutable Strings with StringBuffer: The StringBuffer class allows you to modify strings without creating new objects. It provides methods like insert(), append(), and toString() to perform various string manipulations.
   Conversion Between StringBuffer and String: The toString() method can be used to convert a StringBuffer back to a regular String.
5. Conclusion:
   This program highlights the distinction between immutable strings and mutable strings in Java. By using StringBuffer, you can efficiently modify strings without creating new objects repeatedly, which can be particularly useful in performance-sensitive applications. The program also demonstrates how to convert between StringBuffer and String types.

# Encapsulation.java

This Java program demonstrates the concept of Encapsulation using the Human class, which includes various types of constructors, getter/setter methods, and the use of the this keyword. The main class, Encapsulation, demonstrates how objects of the Human class are created, initialized, and manipulated while ensuring the principles of encapsulation are upheld.

Key Concepts:

1. Encapsulation:
   Encapsulation is a fundamental concept in Object-Oriented Programming (OOP) that involves bundling the data (attributes) and methods that operate on the data into a single unit, called a class. It also restricts direct access to some of an object's components, which helps protect its internal state.

   In this program:

   Private fields: The name and age attributes are marked private, meaning they cannot be accessed directly from outside the Human class. They can only be accessed or modified via getter and setter methods.
   Public fields: The address and job attributes are public and can be accessed directly from outside the class. However, to maintain proper encapsulation, it’s recommended to make them private and provide getter and setter methods for access.

2. Constructors:
   Constructors in Java are special methods used to initialize objects. They are called when an object is created. In this program, the Human class demonstrates three types of constructors:

   Default Constructor: The default constructor does not accept any parameters and initializes the object with predefined values. For example, the address is set to "Kakamega 00100" by default.

   Parameterized Constructor: This constructor accepts parameters and initializes the object with values provided at the time of creation. In this case, the Human class has a constructor that accepts a String parameter to set the address.

   Constructor Overloading: Constructor overloading occurs when multiple constructors with the same name but different parameter lists exist in the class. In this program, the Human class has a constructor that accepts both address and job as parameters.

3. Getter and Setter Methods:
   Getter and setter methods provide controlled access to the private attributes of a class. The getter method retrieves the value of a private attribute, and the setter method updates the value.

   Naming Convention: In Java, it is a common convention to name getter methods with a get prefix followed by the attribute name, and setter methods with a set prefix followed by the attribute name. For example:
   getName(): Retrieves the name of the person.
   setName(String name): Sets the name to the provided value.
   By using getter and setter methods, we can ensure that the internal state of the object is properly controlled and modified in a consistent manner.

4. The this Keyword:
   The this keyword refers to the current instance of the class. It is often used to distinguish between instance variables and method parameters when they have the same name. For example, inside a constructor, this.Address refers to the instance variable Address, while Address (without this) refers to the parameter passed to the constructor.

   Why Use Encapsulation:
   Encapsulation helps achieve the following:

   Data protection: By restricting access to the internal state of an object, it helps ensure that data cannot be modified in unexpected ways.
   Code maintainability: Using getter and setter methods allows you to control how attributes are accessed or modified, making the class more flexible and easier to update in the future.
   Improved readability: It makes the code easier to understand by clearly defining how the object's state should be accessed and changed.
   How the Program Works:
   Creating Objects:

   Objects of the Human class are created using different constructors:
   The default constructor initializes the object with a predefined address ("Kakamega 00100").
   The parameterized constructor allows setting a custom address.
   The overloaded constructor allows setting both the address and the job.
   Setting Values:

   The setAge(24) and setName("John Doe") methods are used to set the age and name of a Human object.
   Displaying Values:

   The program demonstrates how to use getter methods (getAge(), getName()) to retrieve the values of private attributes.
   The address and job attributes are directly printed since they are public.

Example Output:

24
John Doe
Kakamega 00100
Nairobi 00100
Mombasa 00100
Software Developer
