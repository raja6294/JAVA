package patterns;

import  java.util.*;

public class hollowrec{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows:");

    int r = sc.nextInt();

    System.out.println("enter culomns:");
    
    int c = sc.nextInt();

    for(int i=1;i<=r;i++){
      for(int j=1;j<=c;j++){
       

        if(i==1 || j==1 || i==r || j==c){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
          
      }
      System.out.println();
    }
    

  }
}

// in terminal we should run--> PS C:\Users\Raja Banerjee\Desktop\JAVA> java patterns.hollowrec

