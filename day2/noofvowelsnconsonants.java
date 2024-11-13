package day2;
import java.util.Scanner;
public class noofvowelsnconsonants {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a word:");
		String input = a.nextLine().toLowerCase();
		int vcount = 0,ccount = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
				vcount++;
			}
			else if(input.charAt(i)>='a'&&input.charAt(i)<='z') {
				ccount++;
			}
		}
		System.out.println("Number of vowels = "+vcount);
		System.out.println("Number of consonants = "+ccount);
	}

}
