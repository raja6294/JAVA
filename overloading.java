//Function Overloading: multiple functions with same name but different parameters like for example for taking integer we call a function multiply(int a,int b) for multiply two double numbers we call a function multiply(double a,double b) and for multiply three numbers we call a function multiply(int a,int b,int c) so all these functions have same name but different parameters this is called function overloading.

public class overloading {

public static int multiply(int a,int b){
  return a*b;
}
public static float multiply(float a,float b){
  return a*b;
}
public static void main(String[] args) {
  int a=5;
  int b=10;
  float c=5.5f;
  float d=10.5f;
  int result1=multiply(a,b);
  float result2=multiply(c,d);
  System.out.println("the multiplication of "+a+" and "+b+" is "+result1);
  System.out.println("the multiplication of "+c+" and "+d+" is "+result2);
}
}