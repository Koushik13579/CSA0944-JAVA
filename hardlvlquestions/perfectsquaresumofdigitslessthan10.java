package hardlvlquestions;
import java.util.Scanner;
public class perfectsquaresumofdigitslessthan10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter lower limit:");
		int ll = s.nextInt();
		System.out.println("Enter upper limit:");
		int ul = s.nextInt();
		int i,j;
		for(i=ll;i<ul;i++) {
			for(j=1;j<=i;j++) {
				if(j*j == i) {
					int num = i;
					int sum = 0;
					while(num!=0) {
						int rem = num%10;
						sum+=rem;
						num/=10;
					}
					if(sum<10) {
						System.out.print(i+" ");
						break;
					}
				}
			}
		}
	}

}