import java.util.Scanner;
import java.text.DecimalFormat;

public class StringIntro1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String title;
    System.out.println("What's your favorite movie?");
    title = input.nextLine();
    
    System.out.println("Your favorite is " + title);
    int len = title.length();
    System.out.println("The length of the title is "+ len);
    int index = title.indexOf('x');
    System.out.println("x is located at " + index);
    char letter = title.charAt(4);
    System.out.println("The letter at index 4 is " + letter);
    //write a code that will find the last letter of any String
    char last = title.charAt(len-1);
    System.out.println("The last letter of " + title + " is " + last);
    char first = title.charAt(0);
    System.out.println("The last letter of " + title + " is " + first);
    
    System.out.println(25 / (3+3));
    
    /*
     * char letter = 'u'
     * String word = "hello";
     * String stores the location of the word.. like a box
     * index is the stored location value of an individual char inside a container storing the String
     * length counts the numbers from 1, index starts at 0
     
      .length() ->ciybts the number of characters in the string.
      .indexOf() -> finds the index of the first instance of the requested value
        We can use either a char or string in the ()
        If the result is -1, it means there are no matches.
      .charAt(int) -> find the char at the given index value
    */
    
  }
}