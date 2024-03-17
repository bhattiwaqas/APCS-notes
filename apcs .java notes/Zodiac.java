import java.util.Scanner;
import java.text.DecimalFormat;

public class Zodiac {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String month;
    int date;
    
    System.out.println("What month is your birthday in?");
    month = input.next().toLowerCase();
    System.out.println("What day is your birthday on?");
    date = input.nextInt();
    
    
    if (month.equals("march") && date >= 21 ) {
      System.out.println("You are a Aries. You are strong, independent, you have a good personality and are the most romantic.");
    }
    else if (month.equals("april") && date <=19 ) {
      System.out.println("You are a Aries. You are strong, independent, you have a good personality and are the most romantic.");
    }
    else if (month.equals("april") && date >= 20 ) {
      System.out.println("You are a Tauras. You're dependable, persistent, loyal, kind, but stubborn.");
    }
    else if (month.equals("may") && date <= 20 ) {
     System.out.println("You are a Tauras. You're dependable, persistent, loyal, kind, but stubborn.");
    }
    else if (month.equals("may") && date >= 21) {
      System.out.println("You are a Gemini. You are one with many personalities, you are smart, think more than they should do, versatile, curious, and fun.");
    }
    else if (month.equals("june") && date <= 21 ) {
     System.out.println("You are a Gemini. You are one with many personalities, you are smart, think more than they should do, versatile, curious, and fun.");
    }
    else if (month.equals("june") && date >= 22 ) {
      System.out.println("You are a Cancer. You are emotional, empathetic, imaginative, adaptable, nurtuuring, and you are motivated by feelings.");
    }
    else if (month.equals("july") && date <= 22 ) {
     System.out.println("You are a Cancer. You are emotional, empathetic, imaginative, adaptable, nurtuuring, and you are motivated by feelings.");
    }
    else if (month.equals("july") && date >= 23 ) {
      System.out.println("You are a Leo. You love being the center of attention, you like to laugh and crack jokes, be dramatic and overall enjopy life in an entertaining away");
    }
    else if (month.equals("august") && date <= 22 ) {
     System.out.println("You are a Leo. You love being the center of attention, you like to laugh and crack jokes, be dramatic and overall enjopy life in an entertaining away");
    }
    else if (month.equals("august") && date >= 23 ) {
      System.out.println("You are a Virgo. You have disagreeable opinions, you are critical, picky, and attractive");
    }
    else if (month.equals("september") && date <= 22 ) {
     System.out.println("You are a Virgo. You have disagreeable opinions, you are critical, picky, and attractive");
    }
    else if (month.equals("september") && date >= 23 ) {
      System.out.println("You are a Libra. Other people enjoy being around you, you're charming , beautiful, and well balanced");
    }
    else if (month.equals("october") && date <= 23 ) {
     System.out.println("You are a Libra. Other people enjoy being around you, you're charming , beautiful, and well balanced");
    }
     else if (month.equals("october") && date >= 24 ) {
      System.out.println("You are a Scorpious. You are secretive, intuitive, obsessive, posessive, loyal, distrustful, and vengeful");
    }
    else if (month.equals("november") && date <= 21 ) {
     System.out.println("You are a Scorpius. You are secretive, intuitive, obsessive, posessive, loyal, distrustful, and vengeful");
    }
    else if (month.equals("november") && date >= 22 ) {
      System.out.println("You are a Sagitarrius. You are optimistic, restless, progressive, and adventurous");
    }
    else if (month.equals("december") && date <= 21 ) {
     System.out.println("You are a Sagitarrius. You are optimistic, restless, progressive, and adventurous");
    }
    else if (month.equals("december") && date >= 22 ) {
      System.out.println("You are a Capricornus. You are responsible, determined, reserved, resourceful, motivated by successes, organized, competitive, and practical");
    }
    else if (month.equals("january") && date <= 19 ) {
     System.out.println("You are a Capricornus. You are responsible, determined, reserved, resourceful, motivated by successes, organized, competitive, and practical");
    }
    else if (month.equals("january") && date >= 20 ) {
      System.out.println("You are an Aquarius. You are rational, you don't often display emotions, you're clever, independent, a loyal friend, rebellious, and eccentric");
    }
    else if (month.equals("february") && date <= 18 ) {
     System.out.println("You are an Aquarius. You are rational, you don't often display emotions, you're clever, independent, a loyal friend, rebellious, and eccentric");
    }
    else if (month.equals("february") && date >= 19 ) {
      System.out.println("You are a Pisces. You can be extremely emotional, can make a great partners, you're caring, creative, selfless, introspective, and thrive around others.");
    }
    else if (month.equals("february") && date >= 19 ) {
      System.out.println("You are a Pisces. You can be extremely emotional, can make a great partners, you're caring, creative, selfless, introspective, and thrive around others.");
    }
    
    
    
  }
}