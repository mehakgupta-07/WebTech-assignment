
import java.util.*;

public class Q4 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int firstcopy = num1;
        int secondcopy = num2;

        System.out.println("With Temporary Variable:");
        int aux = firstcopy;
        firstcopy = secondcopy;
        secondcopy = aux;
        System.out.println("First Number: " + firstcopy);
        System.out.println("Second Number: " + secondcopy);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("With Temporary Variable:");
        System.out.println("First Number= " + num1);
        System.out.println("Second Number= " + num2);

        input.close();

    }

}
