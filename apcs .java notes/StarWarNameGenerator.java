import java.util.Scanner;
import java.text.DecimalFormat;

public class StarWarNameGenerator {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String first, last, mother, city, car;
    String newfirst, newlast, planet;
    int length;
    
    System.out.println("Enter your first name: ");
    first = input.nextLine();
    System.out.println("Enter your last name: ");
    last = input.nextLine();
    System.out.println("Enter your mother's maiden name: ");
    mother = input.nextLine();
    System.out.println("Enter the city you were born: ");
    city = input.nextLine();
    System.out.println("Enter the first car you drove: ");
    car = input.nextLine();

    length = last.length();
    
    newfirst = first.substring(0,3) + last.substring(0,2);
    newlast = mother.substring(0,2) + city.substring(0,3);
    planet = last.substring(length-2) + car;
    
    System.out.println("\nYour first name: " + first + "\nYour last name: " + last + "\nYour mother's maiden name: " + mother + "\nThe city you were born: " + city + "\nFirst car you drove: " + car);
    System.out.println("\n\nStar Wars Name Generator: ");
    System.out.println("You are " + newfirst.toUpperCase() + " " + newlast.toUpperCase() + " of " + planet.toUpperCase());
    
    input.close();
    
  }
}