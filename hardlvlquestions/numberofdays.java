package hardlvlquestions;
import java.util.Scanner;
public class numberofdays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of days:");
		int daysin = s.nextInt();
		int years = daysin/365;
		int weeks = (daysin%365)/7;
		int days = (daysin%365)%7;
		System.out.println("Years = "+years);
		System.out.println("weeks = "+weeks);
		System.out.println("days = "+days);
	}
}