import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // This will take one word only
        System.out.println(input);

        String inputLine = sc.nextLine(); // This will take full sentence
        System.out.println(inputLine); 

        int number = sc.nextInt(); // Takes int value
        System.out.println(number);
    }    
}
