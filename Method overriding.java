import java.util.Scanner;
class calculator{
  double a;
  double b;
  public calculator(double a,double b){
    this.a = a;
    this.b = b;
  }
  public double add(){
    return (a+b);
  }
  public double sub(){
    return (a-b);
  }
  public double mul(){
    return (a*b);
  }
  public double div(){
    if(b!=0){
      return (a/b);
    }
    else{
      System.out.println("Division by zero error.");
      return Double.NaN;
    }
    
  }
}
class simplecalci extends calculator{
  public simplecalci(double a,double b){
    super(a,b);
  }
  @Override
  public double mul(){
    double res = super.mul();
    return res*res;
  }
}
public class R192211286{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first number:");
    double a = s.nextDouble();
    System.out.println("Enter second number:");
    double b = s.nextDouble();
    simplecalci ob = new simplecalci(a,b);
    System.out.println("Sum = "+ob.add());
    System.out.println("Sub = "+ob.sub());
    System.out.println("mul = "+ob.mul());
    System.out.println("div = "+ob.div());
  }
}
