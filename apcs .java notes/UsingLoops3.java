import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingLoops3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###");
    
    int rolls;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;
    
    System.out.println("How many times do you want to roll the die");
    rolls = input.nextInt();
    
    for (int i = 1; i<=rolls; i++) {
      int dice1 = (int)(Math.random()*6+1);
      int dice2 = (int)(Math.random()*6+1);
      int total = dice1 + dice2;
      //System.out.println("Roll " + i + ": You rolled a " + dice1 + " and a "+ dice2);
      
      if(total == 2) { 
        count2++;
      }
      if(total == 3) { 
        count3++;
      }
      if(total == 4) { 
        count4++;
      }
      if(total == 5) { 
        count5++;
      }
      if(total == 6) { 
        count6++;
      }
      if(total == 7) { 
        count7++;
      }
      if(total == 8) { 
        count8++;
      }
      if(total == 9) { 
        count9++;
      }
      if(total == 10) { 
        count10++;
      }
      if(total == 11) { 
        count11++;
      }
      if(total == 12) { 
        count12++;
      }
      
      
      
      
    } //end for loop
    
    System.out.println("Amount of 2s: " + df.format(count2) );
    System.out.println("Amount of 3s: " + df.format(count3) );
    System.out.println("Amount of 4s: " + df.format(count4) );
    System.out.println("Amount of 5s: " + df.format(count5) );
    System.out.println("Amount of 6s: " + df.format(count6) );
    System.out.println("Amount of 7s: " + df.format(count7) );
    System.out.println("Amount of 8s: " + df.format(count8) );
    System.out.println("Amount of 9s: " + df.format(count9) );
    System.out.println("Amount of 10s: " + df.format(count10) );
    System.out.println("Amount of 11s: " + df.format(count11) );
    System.out.println("Amount of 12s: " + df.format(count12) );
    
    
    
    
    
    
    
    
    
    
    input.close();
    
  }
}