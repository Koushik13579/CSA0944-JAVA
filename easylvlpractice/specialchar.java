package easylvlpractice;
import java.util.Scanner;
public class specialchar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input: ");
		String Sen = s.nextLine();
		String spe = "";
		int count = 0;
		System.out.print("Special characters: ");
		for(int i=0;i<Sen.length();i++) {
			if(!(Sen.charAt(i)>='A'&&Sen.charAt(i)<='Z')&&!(Sen.charAt(i)>='a'&&Sen.charAt(i)<='z')&&!(Sen.charAt(i)>='0'&&Sen.charAt(i)<='1')) {
				System.out.print(Sen.charAt(i)+" ");
				count++;
			}
		}
		System.out.println("\nNumber of special characters are "+count);

	}

}
