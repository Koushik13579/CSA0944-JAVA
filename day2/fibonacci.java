package day2;
import java.util.Scanner;
public class fibonacci {
	static void fib(int n) {
		System.out.println("First "+n+" terms in fibonacci series are:");
		int first = 0,second = 1,next = 0;
		for(int i=0;i<n;i++) {
			System.out.print(first+" ");
			next = first+second;
			first = second;
			second = next;
		}
	}
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = a.nextInt();
		fib(num);
	}

}
