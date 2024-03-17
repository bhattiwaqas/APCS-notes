import java.util.Scanner;
import java.text.DecimalFormat;

public class Methods7 {
  public static int mystery(int num1, int num2) {
    int sum = num1+num2;
    mystery2(sum);
    return sum;
  }
  
  public static void mystery2(int num){
    System.out.println("The sum of the numbers is " + num);
  }
  
  public static void main (String[] args) {
    
    int happy = mystery(7,3);
    
    
    
    
    
    
    
  }
}