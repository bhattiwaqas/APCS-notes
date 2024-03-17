import java.util.*;

public class ArraysIntro1{
  
  public static void prtArr(String[] arr){
    for(int i = 0; i < arr.length ;i++){
      System.out.println(arr[i] );
    }// loop to print all items in an array
  }//end prtArray
  
  //for int:
  public static void prtArr(int[] arr){
    for(int i = 0; i < arr.length ;i++){
      System.out.println(arr[i] );
    }// loop to print all items in an array
  }//end prtArray
  
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //to define an array we put [] next to the variable type
    String[] cars = {"Honda", "Jeep", "Toyota", "Nissan", "Ford", "Chevy", "Tesla", "BMW"};
    // index            0        1        2         3        4        5       6       7
    System.out.println("The amount of cars is " + cars.length );
    //Arrayname.lengthtells us the aount of items inside the array
    System.out.println("The first car is " + cars[0] );
    System.out.println("The last car is " + cars[cars.length - 1] );
    
    prtArr(cars);
    
    
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    prtArr(days);

    //int array:
    int[] nums = {3, 8, 9, 3, 2};
    // we can change the variable of the 9 to a 10 in the array:
    nums[2] = 10;
    prtArr(nums);
    
    input.close();
  }
}