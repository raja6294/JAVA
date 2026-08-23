public class callbyv {
  public static void change(int a) {
    a = 20;
  }
  public static void main(String[] args) {
    int a = 10;
    System.out.println("before changing a=" + a);
    change(a);
    System.out.println("after changing a=" + a);
  }
  
}
// after changing a=10 because the value of a is not changed in the main method. The change method only changes the value of the local variable a, which is a copy of the original variable a in the main method.

// In Java, when you pass a primitive it alaways a call by value. This means that a copy of the original variable is passed to the method, and any changes made to the parameter inside the method do not affect the original variable outside the method.

// in call by reference, when you pass an object to a method, a reference to the original object is passed. This means that any changes made to the object inside the method will affect the original object outside the method.

//reference -> original object 
//value -> copy of the original variable
