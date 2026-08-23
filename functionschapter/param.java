import java.util.Scanner;

public class param {
  public static int calculateSum(int num1,int num2){ //parameters or formal parameters, write when defining the function
    int sum=num1+num2;
    return sum;
  }


  public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.print("Enter the first number: ");
    int a=sc.nextInt();
    System.out.print("Enter the second number: ");
    int b=sc.nextInt();
    int result=calculateSum(a,b); //arguments or actual parameters , write when calling the function
    System.out.println("the sum is "+result);
  }
  
  
}
