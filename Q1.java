
import java.util.*;

public class Q1 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Difference of numbers: " + diff);
        input.close();

    }

}
