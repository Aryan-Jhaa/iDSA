import java.util.*;

public class Sum {
    public static void main(String args[]){
        
        // sum of two numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of second number: ");
        int b = sc.nextInt();
        
        int sum = a+b;

        System.out.print("Sum of the two numbers: " + sum);
    }
}
