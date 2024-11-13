package day2;
import java.util.Scanner;
public class bankaccount {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		double bal = 0;
		int choice;
		do {
		System.out.println("\nBANK ACCOUNT MENU");
		System.out.println("1.check balance");
		System.out.println("2.deposit money");
		System.out.println("3.withdraw money");
		System.out.println("4.Exit");
		System.out.println("Choose an option:");
		choice = a.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your balance :Rs"+bal);
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				double dep = a.nextDouble();
				if(dep>0) {
					bal+=dep;
					System.out.println("Amount deposited:Rs"+dep);
					break;
				}
				else {
					System.out.println("Enter valid value for amount.");
				}
			case 3:
				System.out.println("Enter amount to withdraw:");
				double wiamt = a.nextDouble();
				if(wiamt>0 && wiamt<=bal) {
					bal-=wiamt;
					System.out.println("Amount withdrawed:Rs"+wiamt);
				}
				else if(wiamt>bal) {
					System.out.println("Insufficient balance.");
				}
				else {
					System.out.println("Enter a valid value to withdraw.");
				}
			case 4:
				System.out.println("Thankyou for using!");
				break;
			
			}
		}while(choice!=4);
		
	}

}
