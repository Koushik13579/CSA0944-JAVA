package day5;

import java.util.ArrayList;

public class arraylist {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		int s = al.size();
		System.out.println("Size is "+s);
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		System.out.println("Size is "+al.size());
		System.out.println("array is "+al);
		al.remove(2);
		System.out.println("Size is "+al);
		
	}

}
