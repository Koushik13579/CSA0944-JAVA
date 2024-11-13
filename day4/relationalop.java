package day4;
import java.util.Scanner;
public class relationalop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			
			System.out.println("A is greatest. "+a);
		}
		else if(b>a && b>c) {
			System.out.println("B is greatest. "+b);
		}
		else
			System.out.println("C is greatest. "+c);
	}

}
