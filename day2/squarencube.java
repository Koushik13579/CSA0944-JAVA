package day2;
import java.util.Scanner;
public class squarencube {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number:");
		float num = a.nextFloat();
		float sq = num*num;
		float cu = num*sq;
		System.out.println("Square of "+num+" is "+sq);
		System.out.println("cube of "+num+" is "+cu);
	} 

}
