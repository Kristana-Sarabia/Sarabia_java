package fass;

public class faa {

	public static void main(String[] args) {
		int n = 15;
		int first = 0, second = 1, next, j;
		System.out.println("Fibonacci Sequence up to " + n + " terms;");
		for (j=1; j<=n; j++) {
			System.out.println(first + " ");
			next = first + second;
			first = second;
			second = next;
			
	}

}} 
