// write a java method to compute  the sum of digits in an intiger

public class sum{
  public static  void main(String[] args){
    int number=12345;
    int result=sumOfDigits(number);
    System.out.println("The sum of digits in " + number + " is: " + result);
  }
  public static int sumOfDigits(int number){
    int sum =0;
    while(number>0){
      sum = sum + number%10; // Get the last digit and add it to sum
      number = number/10; // Remove the last digit from the number

    }
    return sum;
  }
}