import java.util.Scanner;

public class ReportCard {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    double english1, english2, english3, history1, history2, history3, math1, math2, math3, science1, science2, science3;
    
    System.out.print("First English test grade: ");
    english1 = input.nextDouble();
    System.out.print("Second English test grade: ");
    english2 = input.nextDouble();
    System.out.print("Third English test grade: ");
    english3 = input.nextDouble();
    
    System.out.print("First History test grade: ");
    history1 = input.nextDouble();
    System.out.print("Second History test grade: ");
    history2 = input.nextDouble();
    System.out.print("Third History test grade: ");
    history3 = input.nextDouble();
    
    System.out.print("First Math test grade: ");
    math1 = input.nextDouble();
    System.out.print("Second Math test grade: ");
    math2 = input.nextDouble();
    System.out.print("Third Math test grade: ");
    math3 = input.nextDouble();
    
    System.out.print("First Science test grade: ");
    science1 = input.nextDouble();
    System.out.print("Second Science test grade: ");
    science2 = input.nextDouble();
    System.out.print("Third Science test grade: ");
    science3 = input.nextDouble();
    
    double avgenglish = ((english1 + english2 + english3)/3);
    double avghistory = ((history1 + history2 + history3)/3);
    double avgmath = ((math1 + math2 + math3)/3);
    double avgscience = ((science1 + science2 + science3)/3);

    System.out.println("Average test grade for English: " + avgenglish);
    System.out.println("Average test grade for History: " + avghistory);
    System.out.println("Average test grade for Math: " + avgmath);
    System.out.println("Average test grade for Science: " + avgscience);
    
    double overallavg = ((avgenglish+avghistory+avgmath+avgscience)/4);
    System.out.println("Your overall test average is: " + overallavg);
    System.out.println(" ");
    System.out.println("Overall grades between 90 - 100 receive an A");
    System.out.println("Overall grades between 80 - 89 receive a B");
    System.out.println("Overall grades between 70 - 79 receive a C");
    System.out.println("Overall grades between 65 - 69 receive a D");
    System.out.println("Overall grades between below 65 receives an F");
    
    input.close();
  }
}