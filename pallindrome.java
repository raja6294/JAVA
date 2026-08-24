//WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321.

public class pallindrome{
  public static void main(String[] srgs){
    int number=121;
    if(isPalindrome(number)){
      System.out.println(number + " is a palindrome.");
    }else{
      System.out.println(number + " is not a palindrome.");
    }

  }

  public static boolean isPalindrome(int number){
    int originalNumber = number;
    int reversedNumber = 0;

    while(number>0){
      int lastDigit = number%10; // Get the last digit of the number
      reversedNumber = reversedNumber*10 + lastDigit; // Build the reversed number
      number = number/10; // Remove the last digit from the original number
    }

    return originalNumber == reversedNumber; // Check if the original number is equal to the reversed number
  }
}