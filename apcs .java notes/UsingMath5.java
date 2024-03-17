import java.util.Scanner;

public class UsingMath5 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println(145%10);
    System.out.println(145%100);
    System.out.println(145/10);
    System.out.println(145/100);
    
    
    int num;
    
    //4 digit
    System.out.println("Enter a 4 digit number: ");
    num = input.nextInt();
    System.out.println("Your thousands digit number is " + (num/1000) );
    int temp = num%1000;
    System.out.println("New temp is " +temp);
    System.out.println("Your hundreds digit is " + (temp/100) );
    
    //3 digit
    System.out.println("Your hundreds digit number is " + (num/100));
    temp = num % 100;
    System.out.println("***THE TEMP NUMBER IS NOW " +temp+ " ***");
    System.out.println("The tens is " + (temp / 10) );
    temp = temp%10;
    System.out.println("The one digit is " + (temp) );
    
    System.out.println(7%2);
    System.out.println(20%2);
    System.out.println(33%5);
    System.out.println(8/3);
    System.out.println(3/4);
    System.out.println(3.0/4.0);
    System.out.println(3.0/4);
    System.out.println(2+10*3);
    System.out.println( (20/5)+(30/6) );
    double a = 20.75;
    int b = (int)a;
    System.out.println(a);
    System.out.println(b);
    System.out.println((int)5.3/2);
    System.out.println((double)1/2);
    
  }
}