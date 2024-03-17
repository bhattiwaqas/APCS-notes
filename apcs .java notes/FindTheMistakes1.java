import java.util.Scanner;

public class FindTheMistakes1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    System.out.println("10 mistakes");
    System.out.println("Favortie food?");
    String food = input.next();
   
    System.out.println("You like " + food +" so do I!");
    System.out.print("pick a number: ");
    int num = input.nextInt();
    System.out.print("If I divide the number by 2 ");
    System.out.println("the result as decimal is " + (double)(num/2) );
   
  }
}