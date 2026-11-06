import java.util.Arrays;
import java.util.Scanner;
public class arrsort {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter array size: ");
    int n = sc.nextInt();
    int[] x = new int[n];
    System.out.print("enter array elements: ");
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
    }
    Arrays.sort(x);
    System.out.println("the sorted array is: "+Arrays.toString(x));
  }
}