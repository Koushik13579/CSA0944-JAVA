package exceptions;

import java.util.Scanner;
public class exceptionhndling {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Invalid input!");
		}
	}

}
