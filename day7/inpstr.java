package day7;
import java.io.*;
public class inpstr {
	public static void main(String args[])throws IOException{
		String text;
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		text =  br.readLine();
		System.out.println(text);
	}

}
