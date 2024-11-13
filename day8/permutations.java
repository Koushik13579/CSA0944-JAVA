package day8;
import java.util.Scanner;
public class permutations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		String a = s.nextLine();
		System.out.println("Unique permutations of "+a+" is :");
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<a.length();j++) {
				if(i==j) continue;
				for(int k=0;k<a.length();k++) {
					if(k==i || k==j) continue;
					System.out.println(a.charAt(i)+""+a.charAt(j)+""+a.charAt(k));
				}
			}
		}

	}

}
