import java.util.*;

public class SwitchExample {
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter your choice[1/2/3]: ");
    int button=sc.nextInt();
    

    switch(button) {

      case 1:System.out.println("hello");
      break;

      case 2:System.out.println("nameste");
      break;

      case 3:System.out.println("bonjur");
      break;

      default: System.out.println("invaid Button");


    }



  }

  
}
