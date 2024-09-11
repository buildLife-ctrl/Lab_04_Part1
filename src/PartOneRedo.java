import java.util.Scanner;

public class PartOneRedo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intOperandA = 2;
        int intOperandB = 3;
        int intSum = 0;
        int intDifference = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 2;
        double doubleOperandB = 3;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        //integers
        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum + ".");

        intDifference = intOperandB - intOperandA;
        System.out.println("The difference of " + intOperandB + " and " + intOperandA + " is " + intDifference + ".");

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandB + " and " + intOperandA + " is " + intProduct + ".");

        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient of " + intOperandB + " and " + intOperandA + " is " + intQuotient + ".");

        intModulo = intOperandB % intOperandA;
        System.out.println("The modulo of " + intOperandB + " and " + intOperandA + " is " + intModulo + ".");

        System.out.println(" ");

        //double
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");

        doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The difference of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference + ".");

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleProduct + ".");

        doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The quotient of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient + ".");

        doubleModulo = doubleOperandB % doubleOperandA;
        System.out.println("The modulo of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleModulo + ".");
    }
}
