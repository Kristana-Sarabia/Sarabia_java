package aug10;

public class ternary {

	public static void main(String[] args) {
		int number = 15;
		String result = (number %2 == 0) ? "Even" : "Odd";
		System.out.println("The number " + number + " is " + result);
		
		int a = 10, b = 20;
		int max = (a>b)?a:b;
		System.out.println("The maximum of " + a + " and " + b + " is " +max);
		
		String str1 = "Apple";
		String str2 = "Banana";
		String str3 = "Apple";
		
		System.out.println("\nstr1 equals str2? " + str1.equals(str2));
		System.out.println("str1 equals str3? " + str1.equals(str3));
		
		System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
		
		System.out.println("str2 compareTo str1: " + str2.compareTo(str1));
		
		System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
	}

}
