package day2;
import java.util.Scanner;
public class simplencompound {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter principle amount:");
		int amt = a.nextInt();
		System.out.println("Enter rate of interest:");
		double r = a.nextDouble();
		System.out.println("Enter time in years:");
		int t = a.nextInt();
		double si = (amt*t*r)/100;
		System.out.println("\nSimple interest: "+si);
		double ci = amt* Math.pow(1+r/100, t)-amt;
		System.out.printf("\nCompound interest:%.2f ",ci);
	}
}
