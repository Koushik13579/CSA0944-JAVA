package day6;
import java.util.Scanner;
public class voteelig {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = s.nextInt();
		if(age>=18) {
			System.out.println("You are eligable to vote.");
		}
		else {
			int a = 18-age;
			System.out.println("You are not eligable to vote. You can vote after "+a+" years.");
		}
	}
}