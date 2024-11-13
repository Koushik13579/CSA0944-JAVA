package day8;
import java.util.Scanner;
public class revandadduntilpalindrome {
	public int reverse(int n) {
		int rev = 0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	public boolean fffffff222222()

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		
	}

}
