import java.util.Scanner;

public class Interactive3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double me, friend1, friend2, friend3;
    
    System.out.print("How many dollars do you have?");
    me = input.nextDouble();
    
    System.out.print("Hey friend1, how many dollars do you have on you right now?");
    friend1 = input.nextDouble();
    
    System.out.print("How about you friend2, how many dollars do you have right now?");
    friend2 = input.nextDouble();
    
    System.out.print("And finally, what about you friend3, how many dollars do you have?");
    friend3 = input.nextDouble();
    
    double total = me + friend1 + friend2 + friend3;
    System.out.println("So in total, we all have $" + total);
    
    System.out.println("What is the price of the item? ");
    double price = input.nextDouble();
    
    System.out.println("You will have " + (total - price) + " remaining");
    
    input.close();  
  }
}