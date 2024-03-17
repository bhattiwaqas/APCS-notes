public class Intro3 {
  public static void main (String[] args) {
    System.out.println("\t\t\tDog Show Winners");
    System.out.println("Place:\t1\t2\t3\t4\t5\t6");
    System.out.println("Dog#:\t76\t32\t18\t47\t11\t29");
    
    System.out.println(6);
    System.out.println(6 + 2);
    System.out.println(6 + 2 - 4);
    System.out.println(6 * 2);
    System.out.println(6);
    //we can use basic operations instead of a string
    System.out.println(6 + 2 + (-4 * 4) );
    //follows order of operations (PEMDAS)
    System.out.println(4 + 4 + " = 6 + 2");
    //concatant... glues parts of a string together
    //Notation for concatenate.. +
    //concatenate - glue
    System.out.println(4 + 2 + " = 6");                  
    System.out.println(4 + 2 + " + " + 2 + 1);
    System.out.println("!"+ 4 + 2);
    System.out.println(4 + 2 + "!");
    //RULE - once a compiler sees a String the + becomes a concatenate
    // Will add first if possible
    System.out.println(4 + 2 + " + " + (2 + 1) ); //6+3
    System.out.println("Sum = " + (2 + 4) );
    System.out.println("inside " + "out");
    
  }
}