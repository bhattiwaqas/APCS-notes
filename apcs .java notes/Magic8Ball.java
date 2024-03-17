import java.util.Scanner;
import java.text.DecimalFormat;

public class Magic8Ball {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int die1, die2, top;
    String question;
    
    System.out.println("Ask a question to the Magic 8 Ball!");
    question = input.nextLine();
    
    die1 = (int)(Math.random()*10 + 1);
    die2 = (int)(Math.random()*10 + 1);
    
    top = (int)(Math.random()*2 + 1);
    
    if (top==1) {
      
      if (die1 == 1){
        System.out.println("YES!");
      }
      if (die1 == 2){
        System.out.println("Definitely!");
      }
      if (die1 == 3){
        System.out.println("Certainly!");
      }
      if (die1 == 4){
        System.out.println("Of Course!");
      }
      if (die1 == 5){
        System.out.println("Without a doubt!");
      }
      if (die1 == 6){
        System.out.println("Outlook good!");
      }
      if (die1 == 7){
        System.out.println("It is certain!");
      }
      if (die1 == 8){
        System.out.println("It is decidedly so!");
      }
      if (die1 == 9){
        System.out.println("Most likely!");
      }
      if (die1 == 10){
        System.out.println("Signs point to yes!");
      }
      
      
      
      
    }
    
    else {
      
      //
      if (die2 == 1) {
        System.out.println("Ask again later.");
      }
      if (die2 == 2) {
        System.out.println("Better not tell you now.");
      }
      if (die2 == 3) {
        System.out.println("Cannot predict now.");
      }
      if (die2 == 4) {
        System.out.println("Concentrate and ask again.");
      }
      if (die2 == 5) {
        System.out.println("Reply hazy, try again.");
      }
      
      // 5 Negative responses
      if (die2 == 6) {
        System.out.println("Don't count on it.");
      }
      if (die2 == 7) {
        System.out.println("My reply is no.");
      }
      if (die2 == 8) {
        System.out.println("Don't rely on it.");
      }
      if (die2 == 9) {
        System.out.println("Outlook not so good.");
      }
      if (die2 == 10) {
        System.out.println("Very doubtful.");
      }
      
      
    } //end else statement
    
    
    
    
    
  }
}