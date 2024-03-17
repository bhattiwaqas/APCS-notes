import java.util.Scanner;

public class Interactive2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("\t\tGood Afternoon! Welcome to our brand new MEGA meal deal!");
    System.out.print("First of all, would you like a burger or a chicken sandwich?");
    String firstorder;
    firstorder = input.nextLine();
    System.out.print("Next, how many chicken nuggets would you like? 6, 10, or 100?");
    int nuggets = input.nextInt();
    System.out.print("From there, let's go on to the fries. Would you like a large size, a huge size, or way-to-many size!");
    String fries;
    fries = input.next();
    System.out.println("And finally, what would you like to drink? We have many different choices from water, orange/apple juice, soda, and much more!");
    String beverage = input.next();
    
    System.out.println("Alright and that's all. So just to clarify you ordered a " + firstorder + ", " + nuggets + " nuggets, " + fries + " size fries, and " + beverage + ". Have a good day and enjoy your meal!");
    
  }
}