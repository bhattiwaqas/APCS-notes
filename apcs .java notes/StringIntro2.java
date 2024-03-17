import java.util.Scanner;
import java.text.DecimalFormat;

public class StringIntro2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name;
    System.out.println("Enter you full name");
    name = input.nextLine();
    
    int space = name.indexOf(' ');
    System.out.println("The space between your name is located at " + space);
    String lastName, firstName;
    
    firstName = name.substring(0,space); //Start? Stop?
    System.out.println("First name = " + firstName);
    lastName = name.substring(space + 1); //Start? Stop?
    System.out.println("Last name = " + lastName);
    // using the name James Madison, print out Jam, Mad, s Ma.
    String Jam = name.substring(0,3);
    System.out.println("Jam: " + Jam);
    String Mad = name.substring(6,9);
    System.out.println("Mad: " + Mad);
    String sMa = name.substring(4,8);
    System.out.println("s Ma: " + sMa);
    
    /* 1) .length() ->ciybts the number of characters in the string.
       2) .indexOf() -> finds the index of the first instance of the requested value
              We can use either a char or string in the ()
              If the result is -1, it means there are no matches.
       3) .charAt(int) -> find the char at the given index value
       4) .substring() -> allows us to use part of a string.
            .substring(start) -> will create a string that begins at the starting point and goes to the end of the initial string
            .substring(start,end) -> will go from starting point and stops before the end, not including the end
    */
  }
}