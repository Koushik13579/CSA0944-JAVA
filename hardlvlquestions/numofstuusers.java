package hardlvlquestions;
import java.util.Scanner;
public class numofstuusers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Total number of users:");
		int tot = s.nextInt();
		System.out.println("Enter number of teaching staff users:");
		int teach = s.nextInt();
		int nonteach = teach/3;
		System.out.println("Number of student users: "+(tot-teach-nonteach));
	}

}
