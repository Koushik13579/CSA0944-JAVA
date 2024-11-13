package day5;
import java.lang.Cloneable;
public class cloning implements Cloneable {
	int a;
	double b;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		cloning obj = new cloning();
		obj.a=10;
		obj.b=22.4;
		System.out.println(obj.a+" "+obj.b);
		cloning o2 = (cloning)obj.clone();
		System.out.println(o2.a+" "+o2.b);

	}

}
