import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age > 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}