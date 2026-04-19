package patterns;
import java.util.*;


public class rectangle {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows:");

    int r = sc.nextInt();

    System.out.println("enter culomns:");
    
    int c = sc.nextInt();


    for(int i=1;i<=r;i++){
      for(int j=1;j<=c;j++){
        System.out.print("*");

      }
      System.out.println();
    }
    sc.close();
  }
  
}
