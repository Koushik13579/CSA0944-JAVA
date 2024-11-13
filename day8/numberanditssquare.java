package day8;
import java.util.Scanner;
public class numberanditssquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter lower limit:");
		int ll = s.nextInt();
		System.out.println("Enter upper limit:");
		int ul = s.nextInt();
		for(int i=ll;i<ul;i++) {
			System.out.print("("+i+","+(i*i)+")"+" ");
		}
	}

}
