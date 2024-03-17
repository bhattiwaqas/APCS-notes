import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcMethods {
  
  public static void gui(){
    System.out.println("Welcome pick one of the following choices: ");
    System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division\n5. square \n6. square root\n7. slope\n8. Law of Cosines0. Exit");
  }
  
  public static int inputNum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int num = input.nextInt();
    input.close();
    return num;
  }// end inputNum
  
  public static String inputWord(){ // use this in userchoose
    Scanner input = new Scanner(System.in);
    //System.out.print("Please selec the operation you would like to use");
    String choice = input.next();
    input.close();
    return choice;
  }
  
  
  
  
  public static void prtSol(String word, int num){
    System.out.println("The " + word + " is equal to " + num);
  }// end prtSol
  public static void prtSol(String word, double num){ // Overloaded method
    System.out.println("The " + word + " is equal to " + num);
  }// end prtSol for douobles
  
  public static void greeting(){
    System.out.println("Welcome to the best calculator!");
    System.out.println();
  } // end greeting
  
  public static void adding(){
    info("adding", "2");
    int num1 =inputNum();
    int num2 =inputNum();
    
    int sum = num1+num2;
    prtSol("sum", sum);
  } // end adding
  
  public static void subtract(){
    info("subtracting", "2");
    int num1 =inputNum();
    int num2 =inputNum();
    
    int diff = num1-num2;
    prtSol("difference", diff);
  } // end subtract
  
  public static void multiply(){
    info("multiply", "2");
    int num1 =inputNum();
    int num2 =inputNum();
    
    int prod = num1*num2;
    prtSol("product", prod);
  } // end multiply
  
  public static void divide(){
    info("dividing", "2");
    int num1 =inputNum();
    int num2 =inputNum();
    
    double quot = ((double)num1)/num2;
    if (num2 == 0) {
      System.out.println("ERROR, don't use 0 as divisor");
    }
    else {
      prtSol("quotient", quot);
    }
  } // end divide
  
  public static void square(){
    info("squaring", "1");
    int num1 =inputNum();
    
    int sq = num1*num1;
    prtSol("square", sq);
  }// end square
  
  public static void squareRoot(){
    info("square rooting", "1");
    int num1 =inputNum();
    
    double sqroot = Math.sqrt(num1);
    if (num1 < 0) {
      System.out.println("The square root of " + num1 + " is not a real number");
    }
    else {
      prtSol("square root", sqroot);
    }
  }// end squareRoot
  
  public static void slope(){ 
    //m = (y1-y2)/(x1-x2)
    info("slope", "4");
    double y1, y2, x1, x2;
    System.out.print("y1: -> ");
    y1 = inputNum();
    System.out.print("y2: -> ");
    y2 = inputNum();
    System.out.print("x1: -> ");
    x1 = inputNum();
    System.out.print("x2: -> ");
    x2 = inputNum();
    
    double slope = (y1-y2)/(x1-x2);
    
    if (x1 - x2 == 0) {
      System.out.println("The slope is undefined");
    }
    else {
      prtSol("slope", slope);
    }
  }
  
  
  public static void lawCos(){
    //C = sqrt(a^2 + b^2 -2ab * cos(c) )
    double a,b,c;
    System.out.print("side a ->");
    a = inputNum();
    System.out.print("side b ->");
    b = inputNum();
    System.out.print("angle c ->");
    c = inputNum();
    c = Math.toRadians(c);
    double discr = (a*a)+(b*b)-(2*a*b*Math.cos(c));
    double ans = Math.sqrt(discr);
    prtSol("Law of cosines", ans);
  }
  
  /*public static void slopestraight(){ //y=mx+b
   int m = inputNum();
   int x = inputNum();
   int b = inputNum();
   
   double y = (((double)m)*x) + b;
   prtSol("y value",y);
   }
   
   public static void slope(){
   int y1 = inputNum();
   int y2 = inputNum();
   int x1 = inputNum();
   int x2 = inputNum();
   
   
   double slope = ((double)y2-y1)/(x2-x1); // slope (y2-y1)/(x2-x1)
   prtSol("slope",slope);
   }
   
   public static void resistance(){ //physics: resistance is equal to potential difference (voltage) over electric current.
   int v = inputNum(); //volts
   int i = inputNum(); //amperes
   
   double resistance = ((double)v/i); // R = V/I
   prtSol("resistance in ohms",resistance); // unit for resistance is ohms
   }*/
  
  public static String userChoose() {
    System.out.println("Please select the operation you would like to use");
    String choice = inputWord();
    return choice;
  }
  public static void payload(String ans){
    if (ans.equals("1") || (ans.length() > 1 && ans.toLowerCase().substring(0,3).equals("add"))){
      adding();
    }
    else if (ans.equals("2") || (ans.length() > 2 && ans.toLowerCase().substring(0,4).equals("subt"))){
      subtract();
    }
    else if (ans.equals("3") || (ans.length() > 2 && ans.toLowerCase().substring(0,4).equals("mult"))){
      multiply();
    }
    else if (ans.equals("4") || (ans.length() > 2 && ans.toLowerCase().substring(0,3).equals("div"))){
      divide();
    }
    else if (ans.equals("5") || (ans.length() > 3 && ans.toLowerCase().substring(0,6).equals("square"))){
      square();
    }
    else if (ans.equals("6") || (ans.length() > 3 && ans.toLowerCase().substring(0,8).equals("square r"))){
      squareRoot();
    }
    else if (ans.equals("7") || (ans.length() > 3 && ans.toLowerCase().substring(0,5).equals("slope"))){
      slope();
    }
    else if (ans.equals("8") || (ans.length() > 2 && ans.toLowerCase().substring(0,3).equals("cos"))){
      lawCos();
    }
    else if (ans.equals("0") || (ans.length() > 3 && ans.toLowerCase().substring(0,4).equals("exit"))){
      exitCalc();
    }
  }
  public static void info(String oper, String amt){
    System.out.println("For " + oper + " you will need to enter " + amt + " number(s)");
  }
  
  public static void exitCalc(){
    System.exit(1);
  }
  //*************************End Method****************//
  public static void main (String[] args) {
    //Declarations
    boolean calcOn = true;
    
    greeting();
    while(calcOn) {
      gui();
      String ans = userChoose();
      payload(ans);
      //calcOn = exitCalc(); // will tell us if we want to continue or exit
    }
    
    
    /*greeting();
     adding();
     subtract();
     multiply();
     divide();
     square();
     squareRoot();
     slope();
     
     slopestraight();
     slope();
     resistance();*/
    
    
  }
}