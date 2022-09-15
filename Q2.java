
import java.util.*;

public class Q2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = input.nextFloat();
        System.out.println("Enter second number:");
        float num2 = input.nextFloat();
        float product = num1 * num2;
        System.out.println("Product of numbers: " + product);
        input.close();

    }

}
