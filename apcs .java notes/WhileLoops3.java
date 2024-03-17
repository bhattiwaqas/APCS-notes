import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileLoops3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name;
    //Counter
    int countPeople = 0;
    //Accumulator
    String inviteList = "";
    //Flag
    boolean addPeople = true;
    
    /*
     We can use FLAGS to control a while loop
     A FLAG is a simple boolean expression that tells the loop to start or stop
     */
    
    while(addPeople) { //while addPeople = true
      System.out.println("Enter a name of a person who will be invited");
      name = input.next();
      
      System.out.print("Do you want to add another person? Yes or NO");
      String choice = input.next().toUpperCase();
      
      if (choice.equals("NO") || choice.equals("N") ) { // if its no we change the flag
        addPeople = false;
      } // end if to add more people or not
      
      countPeople++;
      inviteList+=(name + " ");
      System.out.println();
      
    } //end while loop
    System.out.println("Number of people invited: " + countPeople);
    System.out.println(inviteList);

    
    
    
    
    
    
    
    
    
  }
}