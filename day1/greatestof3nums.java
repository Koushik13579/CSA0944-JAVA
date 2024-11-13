package day1;

public class greatestof3nums {
	public static void main(String args[]) {
	int num1 = 10;
	int num2 = 20;
	int num3 = 15;
	if(num1>num2){
		if(num1>num3) {
			System.out.println(num1+" is greater.");
		}
		else {
			System.out.println(num3+" is greater.");
		}
	}
	else {
		if(num2>num3) {
			System.out.println(num2+" is greater.");
		}
		else {
			System.out.println(num3+" is greater.");
		}
	}
	}
}
