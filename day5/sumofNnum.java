package day5;
import java.util.Scanner;
public class sumofNnum {
	static int sum(int n) {
		if(n==0)
			return 0;
		else
			return n+sum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N value:");
		int n = s.nextInt();
		System.out.println("Sum = "+sum(n));

	}

}
