public class fact {
  public static int factorial(int n){
    if(n==0 || n==1){
      return 1;
    }
    else{
      int fact=1;
    for(int i=1;i<=n;i++){   // or return n*factorial(n-1);
      fact=fact*i;
    }
    return fact;
    }
  }
  public static void main(String[] args) {
    int num=5;
    int result=factorial(num);
    System.out.println("the factorial of "+num+" is "+result);
  }
  
}
