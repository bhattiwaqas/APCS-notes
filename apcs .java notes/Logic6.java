import java.util.Scanner;
import java.text.DecimalFormat;

public class Logic6 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int temp;
    String weather;
    
    System.out.println("What is the local temperature? ");
    temp = input.nextInt();
    System.out.println("Which condition best represents your local weather?");
    System.out.println("Please enter: sunny, cloudy, or rainy");
    weather = input.next().toLowerCase();
    
    //!weather.equals("sunny")... !weather.equals("cloudy")...!weather.equals("rainy")
    
    //with AND statements, BOTH conditions need to be TRUE for the whole bicondiition to be TRUE but if any or both statements are FALSE the whole statement is FALSE
    //and -> &&
    // with an OR statement, only one condition needs to be TRUE for the entire statement to be true, an OR statement is only FALSE if BOTH conditions are FALSE
    //OR -> ||
    
    if ( !(weather.equals("sunny") || weather.equals("cloudy") || weather.equals("rainy")) ) { // an input thats not sunny nor cloudy nor rainy
      System.out.println("You entered a bad weather condition... Try again with a correct one. ");
    }
    else {
     // we will suggestions in the ELSE, hot warm or cold?...  hot 80 edgrees or more... warm? 65 till 80?... cold 40 or less
      if (temp >= 80) {
        System.out.println("HOT");
      }
      else if (temp >= 65 && temp < 80) { //bigger than 65 and less than 80
        System.out.println("WARM");
      }
      else if (temp <= 40) {
        System.out.println("COLD");
      }
    }
    
    if (weather.equals("sunny") && temp >= 80) {
      System.out.println("You should go to the beach!");
    }
    else if (weather.equals("cloudy") || weather.equals("sunny") && temp <= 40) {
      System.out.println("You should go Skiing!");
    }
    else if (!weather.equals("rainy") && (temp >= 65 && temp < 80)) {
     System.out.println("Let's take a stroll in the park"); 
    }
    else {
      System.out.println("Let's go to the movies.");
    }
   
    
  }
}