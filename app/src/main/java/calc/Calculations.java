package calc;

public abstract class Calculations
{
    public abstract boolean calculate();

    public abstract boolean calculate(int leftOperand, String operator, int rightOperand);

    public static int addition(int leftOperand, int rightOperand) {

        int answer = (leftOperand + rightOperand);

        return answer;
    }

    public static int subtraction(int leftOperand, int rightOperand) {

        int answer = (leftOperand - rightOperand);

        return answer;
    }

    public static int multiplication(int leftOperand, int rightOperand) {

        int answer = (leftOperand * rightOperand);

        return answer;
    }

    public static int division(int leftOperand, int rightOperand) {

        int answer = (leftOperand / rightOperand);

        return answer;
    }

    public static boolean greaterThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand > rightOperand);

        return answer;
    }

    public static boolean lesserThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand < rightOperand);

        return answer;
    }

    public static boolean equalToOrGreaterThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand >= rightOperand);

        return answer;
    }

    public static boolean equalToOrLesserThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand <= rightOperand);

        return answer;
    }

    public static boolean isEqualTo(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand == rightOperand);

        return answer;
    }
}

