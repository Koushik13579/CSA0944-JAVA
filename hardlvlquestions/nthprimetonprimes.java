package hardlvlquestions;
import java.util.Scanner;
public class nthprimetonprimes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = s.nextInt();
		System.out.println("Enter m'th value:");
		int m = s.nextInt();
		int i,j;
		int[] arr = new int[n];
		int count = 0;
		for(i=1;i<=n;i++) {
			int d = 0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					d++;
				}
			}
			if(d==2) {
				count++;
				arr[count]=i;
			}
		}
		for(i=m+1;i<=count;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
