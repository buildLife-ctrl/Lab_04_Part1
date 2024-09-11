import java.util.Scanner;

import static java.lang.System.*;

public class PartOneRedo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int intOperandA = 2;
        int intOperandB = 3;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 2;
        double doubleOperandB = 3;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        //integers
        intSum = intOperandA + intOperandB;
        out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum + ".");

        intDifference = intOperandB - intOperandA;
        out.println("The difference of " + intOperandB + " and " + intOperandA + " is " + intDifference + ".");

        intProduct = intOperandA * intOperandB;
        out.println("The product of " + intOperandB + " and " + intOperandA + " is " + intProduct + ".");

        intQuotient = intOperandB / intOperandA;
        out.println("The quotient of " + intOperandB + " and " + intOperandA + " is " + intQuotient + ".");

        intModulo = intOperandB % intOperandA;
        out.println("The modulo of " + intOperandB + " and " + intOperandA + " is " + intModulo + ".");

        out.println(" ");

        //double
        doubleSum = doubleOperandA + doubleOperandB;
        out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");

        doubleDifference = doubleOperandB - doubleOperandA;
        out.println("The difference of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference + ".");

        doubleProduct = doubleOperandA * doubleOperandB;
        out.println("The product of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleProduct + ".");

        doubleQuotient = doubleOperandB / doubleOperandA;
        out.println("The quotient of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient + ".");

        doubleModulo = doubleOperandB % doubleOperandA;
        out.println("The modulo of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleModulo + ".");
    }
}
