import java.util.Scanner;
import java.text.DecimalFormat;

public class DiceCounting {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int amt;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    
    System.out.println("How many times do you want to roll the die");
    amt = input.nextInt();
    
    
    
    for (int i = 1; i<=amt ;i++) {
      int num = (int)(Math.random()*6+1);
      System.out.println(num);
      
      if (num-1==0) {
       count1++; 
      }
      if (num-2==0) {
       count2++; 
      }
      if (num-3==0) {
       count3++; 
      }
      if (num-4==0) {
       count4++; 
      }
      if (num-5==0) {
       count5++; 
      }
      if (num-6==0) {
       count6++; 
      }
        
        
    }
    
    System.out.println("*****Summary*****");
    System.out.println("In your " + amt + "amount of rolls, this is the outcome: ");
    System.out.println("you rolled a 1 " + count1 + " times.");
    System.out.println("you rolled a 2 " + count2 + " times.");
    System.out.println("you rolled a 3 " + count3 + " times.");
    System.out.println("you rolled a 4 " + count4 + " times.");
    System.out.println("you rolled a 5 " + count5 + " times.");
    System.out.println("you rolled a 6 " + count6 + " times.");
    
   
    
    
    
    
    
    
    
    
    
  }
}