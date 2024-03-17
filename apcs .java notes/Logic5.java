import java.util.Scanner;
import java.text.DecimalFormat;

public class Logic5 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String word, guess;
    int tries = 1;
    boolean wordCorrect = false;
    
    System.out.print("Player 1, please enter your secret word that has at least 6 letters: ");
    word = input.next().toLowerCase();
    
    length = word.length();
    
    System.out.println("Player 2, try to guess the secret word!");
    System.out.println("Enter your guess here: ");
    guess = input.next().toLowerCase();
    
    // try 1 ---------------------------------------------------------------------------------------------
    if (guess.equals(word) ) {
      System.out.println("You guessed the word CORRECT.");
      System.out.println("It only took you " + tries + " tries.");
      System.out.println("Thanks for playing!");
      wordCorrect = true;
    }
    else {
      System.out.println("WRONG... Try again");
      tries++;
      System.out.println("HINT: The first letter of the word is '" + word.charAt(0) + "'");
    }
    
    // try 2 ---------------------------------------------------------------------------------------------
    if (!wordCorrect) {
      
      System.out.print("Try #2, pick a different word: ");
      guess = input.next().toLowerCase();
      
      if (guess.equals(word) ) {
      System.out.println("You guessed the word CORRECT.");
      System.out.println("It only took you " + tries + " tries.");
      System.out.println("Thanks for playing!");
      wordCorrect = true;
      }
      else {
      System.out.println("WRONG... Try again.");
      tries++;
      System.out.println("HINT: The second letter of the word is '" + word.charAt(1) + "'");
      }
    }
    
    // try 3 ---------------------------------------------------------------------------------------------
    if (!wordCorrect) {
      System.out.print("Try #3, pick a different word: ");
      guess = input.next().toLowerCase();
      
      if (guess.equals(word) ) {
      System.out.println("You guessed the word CORRECT.");
      System.out.println("It only took you " + tries + " tries.");
      System.out.println("Thanks for playing!");
      wordCorrect = true;
      }
      else {
      System.out.println("WRONG... Try again.");
      tries++;
      System.out.println("HINT: The third letter of the word is '" + word.charAt(2) + "'");
      }
    }
      
    // try 4 ---------------------------------------------------------------------------------------------
    if (!wordCorrect) {
      System.out.print("Try #4, pick a different word: ");
      guess = input.next().toLowerCase();
      
      if (guess.equals(word) ) {
      System.out.println("You guessed the word CORRECT.");
      System.out.println("It only took you " + tries + " tries.");
      System.out.println("Thanks for playing!");
      wordCorrect = true;
      }
      else {
      System.out.println("WRONG... Try again.");
      tries++;
      System.out.println("HINT: The fourth letter of the word is '" + word.charAt(3)+ "'");
      }
    }
    // try 5 ---------------------------------------------------------------------------------------------
    if (!wordCorrect) {
      System.out.print("This is your final try. Good luck! Enter your guess here: ");
      guess = input.next().toLowerCase();
      
      if (guess.equals(word) ) {
      System.out.println("You guessed the word CORRECT.");
      System.out.println("It took you " + tries + " tries.");
      System.out.println("Thanks for playing!");
      wordCorrect = true;
      }
      else {
      System.out.println("You failed to get the word right in less than 5 tries. Thanks for playing! The correct word was " + word);
      }
    }
    
      
    
  }
}