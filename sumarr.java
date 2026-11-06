//print sum of elements of the array .
import java.util.*;
import java.util.Scanner;
public class sumarr {
  public static void main(String[] args){

    int[] arr = {-9,5,8,-1};
    int sum =0;
    int prod =1;
    for( int i=0;i<arr.length;i++){
      sum = sum+arr[i];
      prod = prod*arr[i];
    }
    System.out.println(sum);
    System.out.println(prod);


  }
}
