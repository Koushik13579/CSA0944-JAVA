package day2;
import java.util.Scanner;
public class leapyearornot {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter an year:");
		int yr = a.nextInt();
		if(yr%4==0 && yr%100!=0 || yr%400==0) {
			System.out.println(yr+" is an leap year.");
		}
		else {
			System.out.println(yr+" is not a leap year.");
		}
	}

}
