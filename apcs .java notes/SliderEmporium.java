import java.util.Scanner;
import java.text.DecimalFormat;

public class SliderEmporium {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("$#,###.##");
    
    
    //Declarations
    int userSliders; //user input for the sliders they order
    String challenge; // will be stored in a yes or no question
    int sliderseaten; // server will input how many sliders they ate for the challenge
    String choice; // yes or no on if they want more food
    String finishchal = "o";
    //Flag
    boolean addSliders = true;
    //Counter
    int countSliders = 0; // counts total sliders they ordered
    int fries = 0;
    int milkshake = 0;
    
    
    System.out.println("Welcome to our famous Slider Emporium.\nWe have the best sliders in all of New York city.\nA slider is a mini hamburger the size of a big chicken nugget.");
    System.out.println("With that out of the way, let's get started.\nEach slider costs 60 cents.\nIf you order 10 sliders, you will get free fries, and if you order 20 at a time, you will get fries and a milkshake for free!");
    
    System.out.print("Would you like to participate in our annual challenge? Yes or No? ... \n(The record for the amount of sandwiches eaten in one sitting is 57) ");
    challenge = input.next().toUpperCase();
    
    while (addSliders) {
      
      
      if (challenge.equals("YES") ) { // if they say yes, the challenge will happen:
        System.out.println("Here's your sliders. In addition, you will receive a milkshake and as much water as you need for FREE as long as you beat the challenge. \nIf you lose, you will be have to pay the full price.\nGood luck!");
        System.out.println("When you're finished, the server will calculate if you beat the record.");
        addSliders = false;
      } // end if statement (challenge)
      else { //if user said no to the challenge, they order normally
        System.out.print("Please enter the amount of sliders you would like: ");
        userSliders = input.nextInt();
        
        
        if (userSliders >= 10) { // if statement that gives free fries if they ordered 10 sliders
          fries++;
          System.out.println("Here's your free fries.");
        }
        if (userSliders >= 20) { //if statement that gives free fries and milkshake if they ordered 10 sliders
          milkshake++;
          
          System.out.println("and here's your free milkshake.");
        } 
        
        
        System.out.print("Would you like more sliders?");
        choice = input.next().toUpperCase();
        if (choice.equals("NO") ) {
          addSliders = false;
        }
        
        countSliders+=userSliders; // calculates total sliders
        
      } // end else statement (order)
     
    } // end while loop
    
    double total = countSliders*.60;
    
    if (challenge.equals("NO") ) { 
      // if they participated in the challenge, it wont tell them what they ordered...
      // this else statement is for people that ordered, not for the challenge
      System.out.println("     The total amount of burgers was " + countSliders);
      System.out.println("     You received " + fries + " free fries.");
      System.out.println("     You received " + milkshake + " free milkshakes.");
      System.out.println("     Your total is " + df.format(total) );
    }
    else { 
      System.out.println("Server, did they beat the record of 57 sandwiches?");
      finishchal = input.next().toUpperCase(); //server decides if they beat the record
    }
    
    if (finishchal.equals("NO") ){ //but if they did participate in the challenge, it will tell them if they lost or won.
      System.out.println("Aww you failed to beat the record of 57 sandwiches, better luck next time\nYou're always welcome to try again.\nYou can pay at the front register");
    }
    else if (finishchal.equals("YES") ) {
      System.out.println("CONGRATULATIONS! You beat the record of 57 sandwiches. The food that you consumed is FREE.");
    }
    
    input.close();
  }
}