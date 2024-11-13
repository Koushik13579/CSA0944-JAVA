package day2;
import java.util.Scanner;
public class compositesinrange {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter lower limit:");
		int ll = a.nextInt();
		System.out.print("Enter upper limit:");
		int ul = a.nextInt();
		System.out.println("Composite numbers between "+ll+" and "+ul+" is:");
		for(int i=ll;i<ul;i++) {
			for(int j=2;j<=ll/2;j++) {
				if(i%j==0) {
					System.out.print(i+",");
					break;
				}
			}
		}
	}

}
