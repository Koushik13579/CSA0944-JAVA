package day2;
import java.util.Scanner;
public class factorial {
	static int fact(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = a.nextInt();
		int result = fact(num);
		System.out.println("Factorial of "+num+" is "+result);
	}

}
