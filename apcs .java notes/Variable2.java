public class Variable2 {
  public static void main (String[] args) {
    //initiative variables...
    int num;
    num = 7;
    double pie = 3.14159;
    String topic = "Computer Science";
    
    System.out.println(num);
    System.out.println(pie);
    System.out.println(topic);
    
    System.out.println(num + num);
    System.out.println("num + num");
    System.out.println(pie+pie);
    System.out.println(topic + topic); //concatenate = glues together
     
     
    System.out.println("The number is " + num);
    System.out.println("Pi is " + pie);
    System.out.println("The topic is " + topic);
    
    // once a variable has an established type we dont have to initialize it again
    // aka we can change the value but we cant change the type
    num = 15;
    System.out.println("The number is " + num);
    num = 1283;
    System.out.println("The number is " + num);
    num = -71;
    System.out.println("The number is " + num);
    
    pie = 3.3333;
    topic = "Programming";
    System.out.println("The new value of pi is " + pie);
    System.out.println("The new topic is " + topic);
    
    //The compiler reads code from top to bottom, left to right
    
  }//end main
}//end class