import java.util.Scanner;
import java.text.DecimalFormat;

public class StringLoops1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int i, length;
    String name;
    
    System.out.println("Enter your name");
    name = input.nextLine();
    
    length = name.length();
    // task 1 - Use the method .length() to show your name however many letters you have/
    // task 2 - write users name one letter at a time. use .charAt()
    // task 3 - rewrite the name, one letter at a time till the whole name is written. w, wa, waq, waqa, waqas
    
      for(i = 1; i <= length ; i++) { //task 1
        System.out.println(name);
      }
    
      for(i = 0; i < length /* or do i <= length - 1 */ ; i++) { //task 2
        System.out.println(name.charAt(i) );
      }
    
      for(i = 1; i <= length ; i++) { //task 3
        System.out.println(name.substring(0, i) );
      }
    
    
    
    
    
    
  }
}