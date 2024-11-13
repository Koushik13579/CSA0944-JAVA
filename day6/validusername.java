package day6;
import java.util.Scanner;
public class validusername {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an username:");
		String a = "Saveetha";
		String b = sc.next();
		if(b.equals(a)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
