import java.util.Scanner;
import java.text.DecimalFormat;

public class StarWarNameGenerator2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    String first, last, mother, city, car;
    String first2, last2, planet;
    int length;

    System.out.println("Enter first name:");
    first = input.nextLine().toUpperCase();
    System.out.println("Enter last name");
    last = input.nextLine().toUpperCase();
    System.out.println("Enter mother's name");
    mother = input.nextLine().toUpperCase();
    System.out.println("Enter city");
    city = input.nextLine().toUpperCase();
    System.out.println("Enter first car you drove");
    car = input.nextLine().toUpperCase();

    length = last.length();

    first2 = first.substring(0,3) + last.substring(0,2);
    last2 = mother.substring(0,2) + city.substring(0,3);
    planet = last.substring(length-2) + car;


    System.out.println("\n\nStar Wars Name Generator: ");
    System.out.println("You are " + first2 + " " + last2 + " of " + planet);

    input.close();

  }
}