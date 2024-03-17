import java.util.Scanner;

public class ModuloQuiz {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num, tenthousand, thousand, hundred, ten, one;
    System.out.println("Enter a 5 digit number: ");
    num = input.nextInt();
    tenthousand = num/10000;
    System.out.println("Number entered is: " + num);
    System.out.println("Ten Thousand = " + tenthousand);
    int temp1 = num%10000;
    thousand = temp1/1000;
    System.out.println("\t\t*** temp1: " + temp1);
    System.out.println("Thousand = " + thousand);
    int temp2 = num%1000;
    hundred = temp2/100;
    System.out.println("\t\t*** temp2: " + temp2);
    System.out.println("Hundred = " + hundred);
    int temp3 = num%100;
    ten = temp3/10;
    System.out.println("\t\t*** temp3: " + temp3);
    System.out.println("Ten = " + ten);
    int temp4 = num%10;
    one = temp4/1;
    System.out.println("\t\t*** temp4: " + temp4);
    System.out.println("One = " + one);
    
    System.out.println(tenthousand + " + " + thousand + " + " + hundred + " + " + ten + " + " + one + " = " + (tenthousand+thousand+hundred+ten+one) );
    
  }
}