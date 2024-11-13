package day2;
import java.util.Scanner;
public class primeandperfect {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = a.nextInt();
		int c=0;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+" is not a prime number.");
		}
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is a perfect number.");
		}
		else {
			System.out.println(num+" is not a perfect number.");
		}
	}
}
