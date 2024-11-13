package day7;
import java.io.*;
public class newinpst {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\koushik\\Desktop\\computer architecture\\github\\demo.txt");
			System.out.println(new String(fin.readAllBytes()));
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
