import java.util.Scanner;
import java.text.DecimalFormat;

public class GradingApp {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##.0");
    
    int gradeacu = 0;
    int num, grade;
    double average;
    
    System.out.println("How many grades would you like to enter?");
    num = input.nextInt();
    
    if (num == 0) {
      System.out.println("You entered 0. Try a different number.");
    }
    else if (num < 0) {
      System.out.println("You entered a negative number. Try again.");
    }
    else {
      for (int i = 1; i <=num; i++ ) {
        System.out.print("Enter your score: ");
        grade = input.nextInt();
        //System.out.println(grade);
        
        gradeacu+=grade; //adds up all grades
      } //end for loop
    } //end else 
    
    average = (double)gradeacu/num; //average
    // System.out.println("Your average grade is " + df.format(average) );
    
    if (average > 88.5) {
      System.out.println("Congratulations! You received an average grade of A, with an average score of " + df.format(average) );
    }
    else if (88.5 > average && average > 75.5) {
      System.out.println("Good! You received an average grade of B, with an average score of " + df.format(average) );
    }
    else if (75.5 < average && average > 65) {
      System.out.println("Nice try, work harder! You received an average grade of C, with an average score of " + df.format(average) );
    }
    else {
      System.out.println("Try harder next time! You received an average grade of F, with an average score of " + df.format(average) );
    }
    
    
    
  }
}