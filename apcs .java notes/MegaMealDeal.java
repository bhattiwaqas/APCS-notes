import java.util.Scanner;
import java.text.DecimalFormat;

public class MegaMealDeal {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    DecimalFormat df = new DecimalFormat("$#,##0.##");
    int burgers, sandwich, filetfish, nuggets, fries, soda;
    double total, tax, finalprice;
    
    System.out.println("\t\t Welcome to our one and only automated Mega Meal Deal! We can get started as soon as possible.");
    System.out.println("Here is our full menu for our Mega Meal Deal: \n Burger -> $1.85 \n Chicken Sandwich -> $2.05 \n Filet of Fish -> $1.37 \n Nuggets -> $.20 per nugget \n Fries -> $1.09 \n Soda -> $.89");
    System.out.print("Alright now since we got that out of the way. \nHow many burgers would you like?");
    burgers = input.nextInt();
    System.out.print("And how many chicken sandwiches?");
    sandwich = input.nextInt();
    System.out.print("Now, how many filet of fish would you like?");
    filetfish = input.nextInt();
    System.out.print("After that, how many nuggets?");
    nuggets = input.nextInt();
    System.out.print("We are almost done! How many fries would you like?");
    fries = input.nextInt();
    System.out.print("And finally, how many sodas would you like?");
    soda = input.nextInt();
    
    System.out.println("You ordered: \n " + burgers + " Burgers \n " + sandwich + " Sandwiches \n " + filetfish + " Filet of Fish \n " + nuggets + " Nuggets \n " + fries + " Fries \n " + soda + " Sodas");
    System.out.println(" _______________");
    total = (burgers*1.85 + sandwich*2.05 + filetfish*1.37 + nuggets*.20 + fries*.99 + soda*.89);
    System.out.println(" Total= " + df.format(total) );
    tax = total*0.08;
    System.out.print(" Tax= " + df.format(tax) );
    finalprice = total+tax;
    System.out.println("\n Final Price = " + df.format(finalprice) );
     
    input.close();
    
  }
}