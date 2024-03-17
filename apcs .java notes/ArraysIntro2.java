import java.util.*;

public class ArraysIntro2{
  
  public static void prtArr(String[] arr){
    for(int i = 0; i < arr.length -1;i++){
      System.out.print(arr[i] + ", " );
    }// loop to print all items in an array
    System.out.println(arr[arr.length-1]);
  }//end prtArray
  
  //for int:
  public static void prtArr(int[] arr){
    for(int i = 0; i < arr.length  ;i++){
      System.out.println(arr[i] );
    }// loop to print all items in an array
  }//end prtArray
  
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //to define an array we put [] next to the variable type

    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    prtArr(months);

    //vip party, invite list,
    System.out.print("How many people are invited to the party? ");
    int numVIP = input.nextInt();
    String[] vipList = new String[numVIP]; // make an array 5 in length
    
    for (int i = 0; i < vipList.length; i++){
      System.out.println("Please enter name " + (i+1) + ": ");
      vipList[i] = input.next();
    }
    //vipList[0] = "Lebo";
    
    prtArr(vipList);
    vipList[2] = "April";
    prtArr(vipList);
    
    input.close();
  }
}