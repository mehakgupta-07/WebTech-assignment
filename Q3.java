
import java.util.*;

public class Q3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int dividend = input.nextInt();
        System.out.println("Enter divisor:");
        int divisor = input.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        input.close();

    }

}
