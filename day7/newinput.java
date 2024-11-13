package day7;
import java.io.*;
public class newinput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character:");
		char c = (char)br.read();
		System.out.println(c);
	}

}
