import java.util.Scanner;

public class Madlib {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String adjective1, adjective2, adjective3, adjective4, adjective5, adjective6, adjective7, adjective8, noun1, noun2;
    System.out.print("Age: ");
    int age = input.nextInt();
    System.out.print("Adjective 1: ");
    adjective1 = input.next();
    System.out.print("Adjective 2: ");
    adjective2 = input.next();
    System.out.print("Adjective 3: ");
    adjective3 = input.next();
    System.out.print("Adjective 4: ");
    adjective4 = input.next();
    System.out.print("Adjective 5: ");
    adjective5 = input.next();
    System.out.print("Adjective 6: ");
    adjective6 = input.next();
    System.out.print("Adjective 7: ");
    adjective7 = input.next();
    System.out.print("Adjective 8: ");
    adjective8 = input.next();
    System.out.print("Noun 1: ");
    noun1 = input.next();
    System.out.print("Noun 2: ");
    noun2 = input.next();
    
    System.out.println("It was a " + adjective1 + " spooky night of the 31st, the young " + age + " year old was out alone at night going from house to house for their expected trick or treating.");
    System.out.println("First, he started off from the " + adjective2 + " house across the block, where he was greeted by a " + adjective3 + " " + noun1 + " at the door.");
    System.out.println("Instead of getting candy, he was yelled at, so he made his way off and quickly ran away hallucinating. The boy was seeing many weird things while exiting like a " + adjective4 + " car and a + " + adjective5 + "cat");
    System.out.println("At this point he couldn't take it anymore so he started walking home. However while going back, there was a sign, Free Candy!, it said, and him being the person he is, walked towards it.");
    System.out.println("He slowly crept up towards it, and seen a " + adjective6 + " " + noun2 + "laying on the front porch. The boy was confused now but he ignored that and made his way over to knock on the door.");
    System.out.println("He knocked on the door, and it opened instantly with a long hallway and at the end was a " + adjective7 + " old man. The boy stood there and then asked if he can get his candy. Then there was a response from the old man, but it was distorted and the boy didn't understand.");
    System.out.println("Right after this happened, a " + adjective8 + " bloody doll came and swept its way through the hallway, walking back and forth. At this point the boy ran all the way home without looking back.");
    System.out.println("He then seen the sign while exiting the neighborhood. It said You are now exiting the Horror House.");
    
  }
}