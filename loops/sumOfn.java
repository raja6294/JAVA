package loops;
import java.util.*;


public class sumOfn {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number: ");
    int num =sc.nextInt();

    int sum=0;
    for( int i=0;i<num+1;i++){
      sum=sum+i;

    }
    System.out.println("the sum is"+sum);

  



  }

 
  
}
