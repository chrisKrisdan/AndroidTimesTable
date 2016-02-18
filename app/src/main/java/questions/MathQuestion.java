package questions;

public abstract class MathQuestion implements Question
{

    public int addition(int leftOperand, int rightOperand) {

        int answer = (leftOperand + rightOperand);

        return answer;
    }

    public int subtraction(int leftOperand, int rightOperand) {

        int answer = (leftOperand - rightOperand);

        return answer;
    }

    public int multiplication(int leftOperand, int rightOperand) {

        int answer = (leftOperand * rightOperand);

        return answer;
    }

    public int division(int leftOperand, int rightOperand) {

        int answer = (leftOperand / rightOperand);

        return answer;
    }

    public boolean greaterThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand > rightOperand);

        return answer;
    }

    public boolean lesserThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand < rightOperand);

        return answer;
    }

    public boolean equalToOrGreaterThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand >= rightOperand);

        return answer;
    }

    public boolean equalToOrLesserThan(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand <= rightOperand);

        return answer;
    }

    public boolean isEqualTo(int leftOperand, int rightOperand) {

        boolean answer = (leftOperand == rightOperand);

        return answer;
    }
}
