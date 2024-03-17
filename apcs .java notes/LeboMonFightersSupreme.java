import java.util.Scanner;
import java.text.DecimalFormat;

public class LeboMonFightersSupreme {
  static int oppStrength, oppDefense, oppSpeed, oppDamage;
  static int strength, defense, speed, damage;
  static int hp = 100;
  static int oppHp = 100;
  static int oppRand = (int)(Math.random()*2+1);
  
  public static void greeting() {
    System.out.println("Welcome to LeboMon Fighters Supreme. You will be challenged and fight monsters!!");
  } // end greeting
  public static String typechoose() {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose your Type: STRONG, TANK, or AVERAGE");
    String type = input.next().toUpperCase();
    return type;
  } // end typechoose
  
  public static void statStrong(){
    strength = (int)(Math.random()*5 + 8);
    defense = (int) (Math.random()*6 + 1);
    speed = (int) (Math.random()*4 + 2);
    System.out.println("Your strength is " + strength);
    System.out.println("Your defense is " + defense);
    System.out.println("Your speed is " + speed);
  } // end statStrong
  public static void statTank(){
    strength = (int) (Math.random()*4 + 2);
    defense = (int) (Math.random()*5 + 8);
    speed = (int) (Math.random()*6 + 1);
    System.out.println("Your strength is " + strength);
    System.out.println("Your defense is " + defense);
    System.out.println("Your speed is " + speed);
  } // end statTank
  public static void statAverage(){
    strength = (int)(Math.random()*6 + 4);
    defense = (int)(Math.random()*6 + 4);
    speed = (int)(Math.random()*6 + 4);
    System.out.println("Your strength is " + strength);
    System.out.println("Your defense is " + defense);
    System.out.println("Your speed is " + speed);
  } // end statAverage
  public static void statgenerator(String type) {
    if (type.equals("STRONG") ){
      statStrong();
    }
    else if (type.equals("TANK") ){
      statTank();
    }
    else if (type.equals("AVERAGE") ){
      statAverage();
    } 
  } // end statgenerator
  public static void oppStat(){
    oppStrength = (int)(Math.random()*11 + 3);
    oppDefense = (int)(Math.random()*11 + 3);
    oppSpeed = (int)(Math.random()*11 + 3);
    System.out.println("\nThe monster's strength is " + oppStrength);
    System.out.println("The monster's defense is " + oppDefense);
    System.out.println("The monster's speed is " + oppSpeed);
  } // end oppStat
  public static String askReroll(){
    Scanner input = new Scanner(System.in);
    System.out.println("\nWould you like to reroll? \nWARNING: You will only get one reroll.");
    String reroll = input.next().toLowerCase();
    return reroll;
  } // end askReroll
  public static void rerollStat(String reroll){
    if (reroll.equals("yes") ){
      String type = typechoose();
      statgenerator(type);
    }
    else {
      System.out.print(" ");
    }
  }// end rerollStat
  
  /**************FIGHTING TIME********************/
  public static void goFirst(){
    if (speed >= oppSpeed) { //check who has more speed to go first.
      askAtkorDef();
      HP();
    }
    else {
      oppAtkorDef();
      HP();
    }
  } // end goFirst
  public static void askAtkorDef(){
    Scanner input = new Scanner(System.in);
    System.out.println("\nIt's your turn!");
    System.out.println("Would you like to attack or defend?");
    String x = input.next().toLowerCase();
    if (x.equals("attack") ){
      attack();
    }
    if (x.equals("defend") )  {
      defend();
    }
  } // end askAtkorDef
  public static void oppAtkorDef(){
    Scanner input = new Scanner(System.in);
    System.out.println("\nIt's the opponent's turn!");

    if (oppRand == 1){
      oppAttack();
    }
    else if (oppRand == 2)  {
      oppDefend();
    }
  } // end oppAtkorDef
  
  public static void attack(){
    int r = (int)(Math.random()*20 + 1);
    if (r > oppDefense){
      System.out.println("Your attack hit!");
      damage = (int)(Math.random()*20 + 1);
      strength = strength+damage;
      oppHp = oppHp-damage;
      System.out.println("Your strength increased by " + damage + ". It is now " + strength);
      HP();
      
    }
    else {
      System.out.println("Your attack missed");
    }
  } // end attack
  public static void defend(){
    int z = (int)(Math.random()*4 + 2);
    defense = defense+z;
    System.out.println("Your defense stat increased by " + z + ". It is now " + defense);
  } // defend 
  public static void oppAttack(){
    int r = (int)(Math.random()*20 + 1);
    if (r > defense){
      System.out.println("The opponent's attack hit!");
      damage = (int)(Math.random()*20 + 1);
      oppStrength = oppStrength+damage;
      hp = hp-damage;
      HP();
    }
    else {
      System.out.println("The opponent's attack missed");
    }
  } // end oppAttack
  public static void oppDefend(){
    int z = (int)(Math.random()*4 + 2);
    oppDefense = oppDefense+z;
    System.out.println("The opponent increased their defense stat by " + z);
  } // end oppDefend
  public static void turns(){
    if (defense >= oppDefense) {
      forloop1();
    }
    else {
      forloop2();
    }
  } // end turns
  public static void forloop1(){
    boolean loop = true;
    if (speed >= oppSpeed){
      while (loop){
        oppAtkorDef();
        askAtkorDef();
        if (hp <= 0 || oppHp <= 0) {
          loop = false;
          System.out.println("GAME OVER.");
          if (hp > oppHp){
            System.out.println("Congratulations. YOU WON!");
          }
          else {
            System.out.println("YOU LOSE.");
          }
        }
      }
    }
  } // end forloop1
  public static void forloop2(){
    boolean loop = true;
    if (oppSpeed > speed){
      while (loop){
        askAtkorDef();
        oppAtkorDef();
        if (hp <= 0 || oppHp <= 0) {
          loop = false;
          System.out.println("GAME OVER.");
          if (hp > oppHp){
            System.out.println("Congratulations. YOU WON!");
          }
          else {
            System.out.println("YOU LOSE.");
          }
        }
      }
    }
  } // end forloop2
  public static void HP(){
    System.out.println("Your current HP is " + hp);
    System.out.println("Your opponent's HP is " + oppHp);
  } // end HP
/*************************End Method****************/
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    greeting();
    String type = typechoose();
    statgenerator(type);
    String reroll = askReroll();
    rerollStat(reroll);
    oppStat();
    goFirst();
    turns();
    
    input.close();
  }
}