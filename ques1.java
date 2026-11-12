import java.util.*;

public class ques1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 8, -3};
        int target = 2;
        int n = arr.length;

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Pair not found");
        }
    }
}