package day6;
import java.util.Scanner;
public class revword {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = s.next();
		String revwor = "";
		for(int i=word.length()-1;i>=0;i--) {
			revwor+=word.charAt(i);
		}
		System.out.println("Reversed word: "+revwor);	
	}
}
