import java.util.Scanner;

public class UsingMath7 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num;
    System.out.println("Type a number: ");
    num = input.nextInt();
    System.out.println("The original number is " + num);
    num+=1; //num = num+1; Write this woithout repitition,
    System.out.println("The number increased by 1 is " + num);
    num++; // will increase by 1
    //num = num+1; increasing by 1 is done so often we have a special code
    System.out.println("The number again increased by 1 is " + num);
    num*=3; //num = num*3;
    System.out.println("The number tripled is " + num);
    num*=2; //num = num*2;
    System.out.println("The number doubled is " + num);
    num-=10; //num = num-10;
    System.out.println("The number lowered by 10 is " +num);
    num-=1; //num = num-1;
    System.out.println("The number lowered by 1 is " + num);
    num--; //num = num-1;
    System.out.println("The number lowered by 1 again is " + num);
    
    num/=2;
    System.out.println("The number halved is " + num);
    
    /* Rules for SHORTCUTS
     * var++ -> increase the var by 1
     * var-- -> decrease the var by 1
     * var+=# -> increase the var by #
     * var-=# -> decrease the var by #
     * var*=# -> multiply var by #
     * var/=# -> divide var by #
     */
    int num1 = 225552;
    System.out.println(num1%=10);
    
    int x = 100;
    System.out.println(x+=3);
    System.out.println(x+=25);
    System.out.println(x+=-10);
    System.out.println(x+=5);
    System.out.println(x+=2);
    int x1 = 100;
    System.out.println(x1*=3);
    System.out.println(x1*=25);
    System.out.println(x1*=-10);
    System.out.println(x1*=5);
    System.out.println(x1*=2);
    int x2 = 100;
    System.out.println(x2/=3);
    System.out.println(x2/=25);
    System.out.println(x2*=-10);
    System.out.println(x2/=5);
    System.out.println(x2/=2);
    int x3 = 100;
    System.out.println(x3%=3);
    System.out.println(x3%=25);
    System.out.println(x3*=-10);
    System.out.println(x3+=5);
    System.out.println(x3/=2);
    int x4 =100;
    System.out.println(x4-=3);
    System.out.println(x4-=25);
    System.out.println(x4-=-10);
    System.out.println(x4-=5);
    System.out.println(x4-=2);
    
    
    
  }
}