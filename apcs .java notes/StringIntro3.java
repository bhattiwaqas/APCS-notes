import java.util.Scanner;
import java.text.DecimalFormat;

public class StringIntro3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Choose your Type, there is STRONG, TANK, and AVERAGE");
    String choose = input.nextLine();
    
    String name, firstInit, lastInit, monogram;
    int space, length;
    System.out.println("Enter full name: ");
    name = input.nextLine().toUpperCase(); // makes the whole name uppercase
    System.out.println("Your name is " + name);
    
    space = name.indexOf(' '); //finds the space between first and last name
    length = name.length(); //tells the amount of char in the string
    
    firstInit = name.substring(0,1); // OR .charAt(int) by making first initial char not String
    System.out.println("First initial: " + firstInit);
    lastInit = name.substring(space+1,space+2);
    System.out.println("First initial: " + lastInit);
    monogram = firstInit+lastInit;
    System.out.println("Monogram: " + monogram);
    
    System.out.println("Name with no initials: " + (name.substring(1,space+1) + name.substring(space+2)).toLowerCase() );
    
    System.out.println("First two letters, last two letters: " + name.substring(0,2) + name.substring(length-2) );
    
    /* 1) .length() ->counts the number of characters in the string.
       2) .indexOf() -> finds the index of the first instance of the requested value
              We can use either a char or string in the ()
              If the result is -1, it means there are no matches.
       3) .charAt(int) -> find the char at the given index value
       4) .substring() -> allows us to use part of a string.
            .substring(start) -> will create a string that begins at the starting point and goes to the end of the initial string
            .substring(start,end) -> will go from starting point and stops before the end, not including the end
       5) .toUppperCase() -> makes all char in string Uppercase
       6) .toLowerCase() -> makes all char in string lowercase
    */
   
  }
}
    