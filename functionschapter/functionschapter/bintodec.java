//binary to decimal conversion (101)2=(5)10 
import java.util.Scanner;

public class bintodec{

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    int binary=sc.nextInt();
    int decimal = binaryToDecimal(binary);
    System.out.println("Decimal equivalent: " + decimal);

  }

  public static int binaryToDecimal(int binary) {
    int decimal = 0;
    int power = 0;

    while (binary > 0) {
      int lastDigit = binary % 10; // Get the last digit of the binary number
      
      decimal = decimal + lastDigit * (int) Math.pow(2, power); // math.pow(2, power) calculates 2 raised to the power of 'power'

      binary = binary / 10; // Remove the last digit from the binary number
      power++;
    }
    return decimal;
  }
}



