import java.util.Scanner;
import java.text.DecimalFormat; // new import

public class UsingMath8 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat(".000"); // number of zeroes is how many places rounded
    
    double radius, circum, areaCir;
    
    // Cherry pies delicious --- C = pi * d
    // Apple pies are too --- A = pi * r^2
    System.out.print("Please enter the radius of the circle:");
    radius = input.nextDouble();
    
    // Math.PI is exactly pi...
    System.out.println("You entered that the radius is " + radius);
    circum = Math.PI * (radius*2);
    System.out.println("The circumference is " + circum);
    System.out.println("The circumference is " + df.format(circum) );
    System.out.println(Math.PI);
    areaCir = Math.PI * (radius*radius);
    System.out.println("The area is " + areaCir);
    System.out.println("The area is " + df.format(areaCir) );
    
  }
}