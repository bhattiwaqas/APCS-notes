import java.util.Scanner;
import java.text.DecimalFormat;

public class StringLoops3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int len;
    String name;
    
    System.out.println("Enter your name");
    name = input.nextLine();
    len = name.length();
    
    String nameLower = name.toLowerCase();
    
    System.out.println("! replaces vowels in your name: ");
    for (int i = 0 ; i < len ; i++ ) {   
      if (nameLower.charAt(i) == 'a' || nameLower.charAt(i) == 'e' || nameLower.charAt(i) == 'i' || nameLower.charAt(i) == 'o' || nameLower.charAt(i) == 'u') {
         System.out.print("!"); //replaces vowels with !
       }   
       else {
        System.out.print(name.charAt(i) ); // constant letters
       }
       
    }
    System.out.println();
    
    
    System.out.println("\n\nName without repeating letters: "); //user enters a name, if any letter is repeated after another the code will stop printing after the first letter is written
    System.out.print(name.charAt(0) ); //prints first letter because
    for (int i = 1 ; i < len ; i++ ) {  
      if (nameLower.charAt(i) == nameLower.charAt(i-1) ) { //this code checks to see if letter 1 is equal to letter 0
         // System.out.print(" REPEATS ");
         break; //stops the loop, doesnt continue
       }   
       else {
        System.out.print(name.charAt(i) );
       }
       
    }
    System.out.println();
    
    
    
    // Difference between continue and break
    // break stops the loop
    // continue -> sends the loop back to the top to the next iteration
    
    
    
    
    
  }
}
  