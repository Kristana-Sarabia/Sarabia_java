package tryagain;

public class tryagain {

public static void main(String[] args) {

int a = 10, b = 5;

// Arithmetic
System.out.println("Sum: " + (a + b));

// Relational
System.out.println("Is a > b? " + (a > b));

// Logical
boolean x = true, y = false;
System.out.println("x && y: " + (x && y));

// Assignment
a += 3; // a = a + 3
System.out.println("Updated a: " + a);

// Ternary
String result = (a > b) ? "a is greater" : "b is greater";
System.out.println(result);

}

}