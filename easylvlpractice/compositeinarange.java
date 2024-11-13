package easylvlpractice;
import java.util.Scanner;
public class compositeinarange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limits: ");
		int ll = s.nextInt();
		int ul = s.nextInt();
		System.out.print("Composite numbers are "+" ");
		for(int i=ll+1;i<ul;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					System.out.print(i+" ");
					break;
				}
			}
		}
	}

}
