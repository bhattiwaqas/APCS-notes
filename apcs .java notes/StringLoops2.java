import java.util.Scanner;
import java.text.DecimalFormat;

public class StringLoops2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name;
    
    System.out.println("Enter your name");
    name = input.nextLine();
    int len = name.length();
    
    System.out.print("Name backwards: ");
    for (int i = len -1 ; i >= 0 ; i-- ) { //task 1 rewrite name backwards
      System.out.print(name.charAt(i) );
    }
    System.out.println();
    
    
    System.out.print("Name without vowels: ");
    for (int i = 0 ; i < len ; i++ ) { //task 2 get rid of vowels    
      if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') { //look for vowels
        continue; //this command tells loop to stop doing the rest and go to the next iteration
      }
      else { //removes vowels // looking for non vowels
        System.out.print(name.charAt(i) );
      }
      
    }
    System.out.println();
    
    
    
     System.out.print("Name with only vowels: ");
     for (int i = 0 ; i < len ; i++ ) { //task 2 get rid of vowels    
       if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == ' ' ) {
         System.out.print(name.charAt(i) );
       }
             
     }
     System.out.println();
    
    
    
    
    
    
    
  }
}