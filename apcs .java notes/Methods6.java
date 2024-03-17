import java.util.Scanner;
import java.text.DecimalFormat;

public class Methods6 {
  public static int newNum() {
    int x = (int)(Math.random()*22 - 11 );
    //System.out.println("The number in the method is " + x);
    prtNum(x, "newNum method");
    return x;
  }
  public static void prtNum(int a, String loc){//print out a number
    System.out.print("The number is " + a);
    System.out.println(" it came from the " + loc);
  }
  
  public static int addThem(int y, int z){
    return y + z;
  }
  
  public static int addThem(){ // can use this instead of ^^
    int p = newNum();
    int q = newNum();
    return p + q;
  }
  
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num1 = newNum();
    //prtNum(num1, "main");
    
    int num2 = newNum();
    int sum = addThem(num1, num2);
    prtNum(sum, " addThem Method");
    
    //System.out.println("The number in the main is now " + num);
    
    /*int count = 0;
    while (num!=10 && num!= -10 && count <=100) {
      num = newNum();
      System.out.println(count);
      count++;
      
    }
    System.out.println(num);*/
    
    input.close();
  }
}