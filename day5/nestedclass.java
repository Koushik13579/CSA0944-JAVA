package day5;
class outer{
	class inner{
		void print() {
			System.out.println("Inner class");
		}
	}
	void display() {
		inner op = new inner();
		op.print();
	}
}
public class nestedclass {
	public static void main(String args[]) {
		outer ob = new outer();
		ob.display();
	}
}                                                                                                                                                                                                                                                                                                                                                          