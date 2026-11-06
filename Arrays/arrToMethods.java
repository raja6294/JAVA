import java.util.Arrays;
import java.util.Scanner;
public class arrToMethods {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter array size: ");
    int n = sc.nextInt();
    int[] x = new int[n];
    System.out.print("enter array elements: ");
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
    }
    System.out.println("the  element before changing is: "+x[2]);
    change(x);
    System.out.println("the  element after chenging is: "+x[2]);
  }
  public static void change(int[] y){ //it is a reference variable which is pointing to the same array in the memory 
    y[2]=100;
  }
}

  