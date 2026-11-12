//print the second maximum element in the array 
// approach - find largest element (max), now find largest element except max.
import java.util.*;
public class ques2{
  public static void main(String[] args){
    int[] arr={4,10,18,6,38};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;

    //calculate max
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max) max=arr[i];

    }
    //calculate smax
    for(int i=0;i<arr.length;i++){
      if(arr[i]>smax && arr[i]!=max) smax=arr[i];
    }
    System.out.println(max);
    System.out.println(smax);

  }


}