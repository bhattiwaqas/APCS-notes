import java.util.Scanner;

public class UsingMath6 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    /*Rules:
     * 60 seeconds = 1 min
     * 60 min = 1 hour
     * 3600 seconds = 1 hour
     * 24 hours = 1 day
     * 86400 seconds = 1 day
    */
    
    int totalSec, days, hour, min, sec;
    System.out.println("Enter an amount of seconds: ");
    totalSec = input.nextInt();
    
    System.out.println("You entered " + totalSec + " seconds");
    
    int temp = totalSec;
    System.out.println("\t\t\t " + temp);
    days = temp/86400;
    temp = temp % 86400;//takes away amount of days and leaves total seconds without hours
    System.out.println("\t\t\t " + temp);
    hour = temp/3600;
    temp = temp % 3600; //takes away amount of hours and leaves remainder of time.
    System.out.println("\t\t\t " + temp);
    min = temp/60;
    temp = temp % 60; //eliminate minutes, leaves seconds.
    System.out.println("\t\t\t " + temp);
    sec = temp;
    System.out.println("Days = " + days);
    System.out.println("Hours = " + hour);
    System.out.println("Minutes = " + min);
    System.out.println("Seconds = " + sec);
    
    
  }
}