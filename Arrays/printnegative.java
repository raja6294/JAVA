//print the -ve numbers from an array
import java.util.*;
import java.util.Scanner;

public class printnegative{
  public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.print("enter array size");
  int n= sc.nextInt();
  int[] arr =new int[n];
  System.out.print("enter array emements:");
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

  }
  //print -ve
  for(int i=0;i<n;i++){
    if(arr[i]<0){
      System.out.println("the -ve numbers are: "+arr[i]);
    }
  }
}
}