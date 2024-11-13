package hardlvlquestions;
import java.util.Scanner;
public class nthfactor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find number of factors it has:");
		int num = s.nextInt();
		System.out.println("Enter n value:");
		int n = s.nextInt();
		int count = 0, i;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				if(count == n) {
					System.out.println(n+"th factor is "+i);
				}
			}
		}
		System.out.println("Number of factors: "+count);
		if(n>count) {
			System.out.println(n+"th factor for "+num+" doesnot exist");
		}
	}
}