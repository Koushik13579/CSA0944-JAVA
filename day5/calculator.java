package day5;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operator to perform operation(+,-,*,/):");
		char op = s.next().charAt(0);
		System.out.println("Enter first operand:");
		int a = s.nextInt();
		System.out.println("Enter second operand:");
		int b = s.nextInt();
		switch(op) {
		case '+':
			int c = a+b;
			System.out.println("Sum = "+c);
			break;
		case '-':
			System.out.println("Sub = "+(a-b));
			break;
		case '*':
			System.out.println("Sub = "+(a*b));
			break;
		case '/':
			System.out.println("Sub = "+(a/b));
			break;
		default:
			System.out.println("Invalid operator!");
			
		}
	}

}
