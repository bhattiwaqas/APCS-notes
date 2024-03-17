import java.util.Scanner;//calls Scanner so we can use it

public class Interactive1 {
  public static void main (String[] args) {
    // Interactive - allowing a two-way flow of information between a computer (program) and a user; responding to a users input
    Scanner input = new Scanner(System.in);//declares a scanner
    System.out.print("What is your name? ");
    String name;
    name = input.nextLine();//allows user to input a String
    System.out.println("Hello " + name + ", have a nice day!");
    
    System.out.print("How old are you? ");
    int age = input.nextInt();
    System.out.println(name + " You are " + age + "years old!");
    
    System.out.print("What is your GPA from 1.0 to 4.0");
    double gpa = input.nextDouble();
    System.out.println("Your GPA is " + gpa + ", that's awesome!");
    
    
    /*Rules for interactive code
     * 1. Import the Scanner -> import java.util.Scanner;
     * 2. declare scanner -> Scanner input = new Scanner(System.in);
     * 3. input.nextLine(); -> captures the next strirng
     * 4. input.nextInt() -> captures the next int written
     * 5. input.nextDouble() -> captures the next double
     * 6. input.next(); captures a single unspaced word
     *      - if there is a space it will capture just the first part
    */
    
    input.close(); //closes the input to get rid of warning
    
  }
}
    