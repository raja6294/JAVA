//searching  an eliment in an array 
import java.util.Arrays;
import java.util.Scanner;
public class searching {
  public static void main(String[] args){
    int[] arr = {1,2,4,5,8,9,10};
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the element to be searched: ");
    int n = sc.nextInt();
    boolean flag = false; //false means the element is not found and flag means contains the value of the element to be searched
    for(int i=0;i<arr.length;i++){
      if(arr[i]==n){
        flag = true;
        break;
      }
    }
    if(flag==true){
      System.out.println("the element is found");
    }
    else{
      System.out.println("the element is not found");
    }
}
