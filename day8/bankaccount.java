package day8;
class Bank{
	String name,type;
	double balance;
	int acc_num;
	public Bank(String n,int a_n,String t,double b) {
		this.name = n;
		this.balance = b;
		this.acc_num = a_n;
		this.type = t;
	}
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
		}
		else
			System.out.println("Invalid ammount.");
	}
	public void withdraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance-=amt;
		}
		else
			System.out.println("Insufficient balance.");
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Balance :"+balance);
	}
}
public class bankaccount {
	public static void main(String[] args) {
		Bank b1 = new Bank("koushik",192211,"savings bank",2000);
		b1.display();
		Bank b2 = new Bank("lathika",192210,"premium bank",4000);
		b2.display();
	}

}
