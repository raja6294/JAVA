import java.util.Scanner;

public class largest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter two numbers: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      if (num1>num2){
         System.out.println("largest number is " +num1);


      }
      else if (num2>num1){
        System.out.println("largest number is " + num2);
      }
      else{
        System.out.println("Both numbers are equal");
      }
   }
}
