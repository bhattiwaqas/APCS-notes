import java.util.Scanner;
import java.text.DecimalFormat;

public class Methods3 {
  /********* END METHODS HERE ****************/
  
  public static void prtHorizontal(String word) {
    for (int i = 0; i < word.length(); i++) {
      System.out.print(word.charAt(i) + " ");
    }
      System.out.println();
      System.out.println();
  } // end prtHorizontal
  
  public static void prtVertical(String word) {
    for (int i = 1; i <= word.length(); i++){ 
      System.out.println(word.charAt(i-1) );
    }
    System.out.println();
  } // end prtVertical
  
  public static void prtBackwards(String word) {
    for (int i = word.length() - 1; i >= 0; i--){ 
      System.out.print(word.charAt(i) );
    }
    System.out.println();
    System.out.println();
    System.out.println();
  } // end prtBackwards
  
  public static void prtAll(String word) {
    prtHorizontal(word);
    prtVertical(word);
    prtBackwards(word);
  }
  
  /********* END METHODS HERE ****************/
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    prtHorizontal("Hello"); // H e l l o
    prtVertical("Hello");
    prtBackwards("Hello"); // olleH
    prtAll("Java"); // will prtHoriz then prtVert then prtBackw
    
    
    
  }
}