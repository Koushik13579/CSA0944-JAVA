package day7;
import java.io.*;
public class filecreandwrit {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\koushik\\Desktop\\computer architecture\\github\\demo.txt");
			String s = "Welcome!";
			byte b[] = s.getBytes();
			fout.write(b);
			System.out.println("Sucess....");
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
