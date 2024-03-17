import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileLoops4 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Declarations
    String name; // allows user to enter a name of a player
    //Flag
    boolean addPlayers = true; // control our while loop
    //Counter
    int countPlayers = 1;
    //Accumulator
    String roster = "";
    
    
    System.out.println("Welcome to the basketball league");
    System.out.println("Please enter the players on your team");
    System.out.println("Each team has a minimum of 5 players and a maximum of 8");
    
    
    while (addPlayers){
      System.out.print("Please enter the name of player " + countPlayers);
      name = input.next();
      //lets control the 5 player clause
      if (countPlayers == 8) {
        addPlayers = false;
      } // looking for 8 players
      
      else if (countPlayers >= 5) {
        System.out.print("Do you have any more players to add?");
        String choice = input.next().toUpperCase();
        if (choice.equals("NO") ){
          addPlayers = false;
        } //yes or no
      } // looking for 5 or more players
      countPlayers++;
      roster+=name + " ";
    } // end while loop
    
    
    System.out.println(roster);
    
    input.close();
  }
}