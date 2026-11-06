//odd index mmultiply by 2 , and even index add 10
import java.util.Arrays;
import java.util.Scanner;

public class oddeven {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter array size: ");
    int n = sc.nextInt();
    int[] x = new int[n];
    System.out.print("enter array elements: ");
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(i%2==0){
        x[i]=x[i]+10;
      }
      else{
        x[i]=x[i]*2;
      }
      }
    
   System.out.println("the changed array is: "+Arrays.toString(x));
  }
}
  
