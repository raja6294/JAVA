
//prime number is a number which is divisible by 1 and itself only

public class primenonprime {
  public static boolean isPrime(int n){  //boolean means it will return true or false , and isPrime is the name of the function and int n is the parameter of the function
    if(n<=1){  
      return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){  //Math.sqrt(n) means square root of n, we are using this because if a number is not prime then it will have a factor less than or equal to its square root , like 7=root 7 * root 7.  

      if(n%i==0){  
        return false;  
      }  
    }
    return true;
  }

  public static void main(String[] args) {
    int n=7;
    boolean result=isPrime(n);
    if(result==true){
      System.out.println(n+" is a prime number");
    }
    else{
      System.out.println(n+" is not a prime number");
    }
  }
}

