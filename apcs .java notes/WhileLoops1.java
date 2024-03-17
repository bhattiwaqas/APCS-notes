import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileLoops1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String secret;
    String guess; // player 2 will enter this info
    int secretLen;
    int correctLetter = 0;
    
    System.out.print("Player 1: \n \n Enter your secret word");
    secret = input.nextLine().toLowerCase();
    secretLen = secret.length();
    System.out.println("\n\n\n\n\n\n\n\n\\n\n\n\\n\n\n\n\n\n\n\n\n\nPlayer 2, it's your turn.");
    
    //Lets give them 10 guesses to start...
    
    while (true) { // Controls the amount of guesses
      System.out.println("\nThe secret word is " + secretLen + " letters long \n");
      System.out.print("Take a guess at the secret word");
      guess = input.next().toLowerCase();
      correctLetter = 0; //reset counter because it only needs to connect correct per guess, without this the counter would keep adding
      
      if (guess.equals("?") ){
        break;
      }
      
      if (guess.length() < secretLen) {
        System.out.print("Your guess needs to be " + secretLen + " letters long." );
        continue;
      }
      
      for(int j = 0; j <secretLen ; j++) {
        if(secret.charAt(j) == guess.charAt(j) ) { //look to see if the letter is equal 
          correctLetter++;
          System.out.println("Letter " + (j+1) + " is " + guess.charAt(j) );
        } //end if compare of letters
        
      } // end while loop to compare letter in guess and in secret
      System.out.println("You got " + correctLetter + " correct.");
      
      //End the code... all letters correct, correctLetter same as secretLen. or look ta both strings
      
      if (correctLetter == secretLen) { // or... guess.equals(secret)
        break; 
      }
      
      
    } // allow the user to guess, well give 10 to start
    
    
    
    
    
    
    
  }
}