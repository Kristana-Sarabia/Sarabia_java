package tryagain;

public class tryagainn {

public static void main(String[] args) {

int a = 10;
int b = 20;
int c = 30;

// Arithmetic precedence: * before +
int result1 = a + b * c;
System.out.println("a + b * c = " + result1); // 10 + (20 * 30) = 610

// Relational before logical
boolean result2 = a < b && b < c;
System.out.println("a < b && b < c = " + result2); // true && true = true

// Logical AND before Logical OR
boolean result3 = (a < b) || (b > c && a == 10);
System.out.println("(a < b) || (b > c && a == 10) = " + result3);
// (true) || (false && true) → true || false → true

// Assignment happens last
int x = 5;
x += 10 * 2; // multiplication first, then assignment
System.out.println("x after x += 10 * 2: " + x); // 25

// Ternary operator
int max = (a > b) ? a : b;
System.out.println("Max of a and b = " + max); // 20

}

}

 