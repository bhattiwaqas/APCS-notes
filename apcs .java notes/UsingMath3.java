import java.util.Scanner;

public class UsingMath3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    //rectangle pizza, sharing, we know how big it is, how many horoziantal and veritical slices is it cut in. how many slices does a person get. maybe find out how big each slice is
    
    //need -> vertSlice and horizSlice,
    //pizza size... length and width of pizza
    //num of people including you
    double length, width; //pizza slice
    int friends;
    int horiz, vert; //slices
    
    System.out.print("How many people in total?");
    friends = input.nextInt();
    System.out.print("How long is the pizza");
    length = input.nextDouble();
    System.out.print("How wide is the pizza");
    width = input.nextDouble();
    System.out.println("How many vertical cuts");
    vert = input.nextInt();
    System.out.println("How many horizontal cuts");
    horiz = input.nextInt();
    
    //1. What is the area of the pizza
    double area = length * width;
    System.out.println("The area of the pizza is " + area);
    //2. How many slices?
    int slices = vert * horiz;
    System.out.println("Number of slices = " + slices);
    //3. How many slices per person?
    System.out.println("Number of slices per person - " + (slices/friends) );
    //4. How big is each individual slice?
    System.out.println("Size of each slice = " + (area/slices) );
    
    
    input.close();
  }
}