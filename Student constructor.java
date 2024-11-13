import java.util.Scanner;
class Student{
  String name;
  long Id;
  double m1;
  double m2;
  double m3;
  public Student(String name,long Id,double m1,double m2,double m3){
    this.name = name;
    this.Id = Id;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    Display();
  }
  public void Display(){
    System.out.println("Name:"+name);
    System.out.println("Id:"+Id);
    calAvg();
  }
  public void calAvg(){
    double avg = (m1+m2+m3)/3;
    System.out.println("Average marks:"+avg);
    if(avg>=90){
      System.out.println("Grade: A");
    }
    else if(avg>=80){
      System.out.println("Grade: B");
    }
    else if(avg>=70){
      System.out.println("Grade: C");
    }
    else if(avg>=60){
      System.out.println("Grade: D");
    }
    else if(avg>=50){
      System.out.println("Grade: E");
    }
    else{
      System.out.println("Grade: F");
      System.out.println("Better luck next time.");
    }
   
  }
}
public class R192211286{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name:");
    String n = s.nextLine();
    System.out.println("Enter you Id:");
    long id = s.nextLong();
    System.out.println("Enter marks of three subjects:");
    double m1 = s.nextDouble();
    double m2 = s.nextDouble();
    double m3 = s.nextDouble();
    Student obj = new Student(n,id,m1,m2,m3);
    s.close();
 
  }
  
}
