//conversion decimal to binary (5)10=(101)2
import java.util.Scanner;

public class dectobin{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int decimal=sc.nextInt();
    String binary = decimalToBinary(decimal);
    System.out.println("Binary equivalent: " + binary);

  }

  public static String decimalToBinary(int decimal) {
    StringBuilder binary = new StringBuilder();

    while (decimal > 0) {
      int remainder = decimal % 2; // Get the remainder when dividing by 2
      binary.insert(0, remainder); // Insert the remainder at the beginning of the string
      decimal = decimal / 2; // Divide the decimal number by 2 for the next iteration
    }
    return binary.toString();
  }

  
}
