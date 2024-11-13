package day6;
import java.util.Scanner;
public class numrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int revnum = 0;
		while(num!=0) {
			revnum=revnum*10+(num%10);
			num/=10;
		}
		System.out.println("Reversed number: "+revnum);

	}

}
