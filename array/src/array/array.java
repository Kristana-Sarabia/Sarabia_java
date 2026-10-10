package array;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		System.out.print("Enter number: ");
		int i;
		for(i=0;i<num.length;i++) {
			num[i]=sc.nextInt();}
		
		System.out.println("Display values entered by user.");
		int x=0;
		while(x<num.length) {
			System.out.println(num[x]);
			num[x] = num[x] + 5;
			x+=1;
		}

		System.out.println("New values.");
		x=0;
		do {
			System.out.println(num[x]);
			x++;
		} while(x<num.length);
		
		sc.close();
	}

}