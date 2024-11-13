package day7;
import java.io.*;
public class ex1 {

	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\koushik\\Desktop\\computer architecture\\github\\demo.txt");
			System.out.println(new String(fin.readAllBytes()));
			System.out.println("Read sucess....");
			fin.close();
			FileOutputStream fout = new FileOutputStream("C:\\Users\\koushik\\Desktop\\computer architecture\\github\\demo.txt");
			String s = "king koushik";
			byte b[] = s.getBytes();
			fout.write(b);
			System.out.println("Write Sucess....");
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
}

}
