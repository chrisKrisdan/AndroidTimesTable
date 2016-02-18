package questions;

import java.util.ArrayList;
import java.util.List;

import exceptions.MathOperatorException;
import calc.Calculations;

public class SimpleMathQuestion extends MathQuestion
{
    int leftOperand = 0;

    int rightOperand = 0;

    String operator = null;

    Object answer = null;

    public SimpleMathQuestion(int leftOperand, String operator, int rightOperand) throws MathOperatorException {

        this.setLeftOperand(leftOperand);

        if(!this.setOperator(operator)) { throw new MathOperatorException(); }

        this.setRightOperand(rightOperand);

        this.setAnswer(leftOperand, operator, rightOperand);
    }

    public boolean setLeftOperand(int leftOperand)
    {
        boolean success = false;

        this.leftOperand = leftOperand;

        int setVal = this.getLeftOperand();

        if(leftOperand == setVal) { success = true;}

        return success;
    }

    public int getLeftOperand()
    {
        return leftOperand;
    }

    public boolean setRightOperand(int rightOperand)
    {
        boolean success = false;

        this.rightOperand = rightOperand;

        int setVal = this.getRightOperand();

        if (rightOperand == setVal) {success = true;}

        return success;
    }

    public int getRightOperand()
    {
        return rightOperand;
    }

    public boolean setOperator(String operator)
    {
        boolean success = false;

        boolean valid = this.validateOperator(operator);

        if (valid) {

            this.operator = operator;
        }

        String setVal = this.getOperator();

        success = (setVal == operator);

        return success;
    }

    public String getOperator()
    {
        return operator;
    }

    public boolean setAnswer(int leftOperand, String operator, int rightOperand)
    {
        boolean success = false;

        this.answer = this.calculate(leftOperand, operator, rightOperand);

        if (this.getAnswer() != null) {success = true;}

        return success;
    }

    protected Object getAnswer()
    {
        return answer;
    }

    @Override
    public Object answer( )
    {
        Object answer = null;

        answer = this.getAnswer();

        return answer;
    }

    private Object calculate(int left, String operator, int right)
    {
        Object answer;

        switch (operator) {

            case "+":  answer = new Integer(Calculations.addition(left, right));
                break;

            case "-":  answer = new Integer(Calculations.subtraction(left, right));
                break;

            case "*":  answer = new Integer(Calculations.multiplication(left, right));
                break;

            case "/":  answer = new Integer(Calculations.division(left, right));
                break;

            case ">":  	answer = new Boolean(Calculations.greaterThan(left, right));
                break;

            case "<": 	answer = new Boolean(Calculations.lesserThan(left, right));
                break;

            case ">=": 	answer = new Boolean(Calculations.equalToOrGreaterThan(left, right));
                break;

            case "<=":  answer = new Boolean(Calculations.equalToOrLesserThan(left, right));
                break;

            case "==":  answer = new Boolean(Calculations.isEqualTo(left, right));
                break;

            default : answer = null;
        }

        return answer;
    }

    private boolean validateOperator(String operator) {

        boolean valid = false;

        List<String> operators = new ArrayList();

        operators.add("=");

        operators.add("+");

        operators.add("-");

        operators.add("*");

        operators.add("/");

        operators.add(">");

        operators.add("<");

        operators.add(">=");

        operators.add("<=");

        operators.add("==");

        valid = (operators.contains(operator));

        return valid;
    }

    public boolean validate(int leftOperand, String operator, int rightOperand)
    {
        boolean isValid = false;

        boolean leftValid = (leftOperand == this.getLeftOperand());

        boolean operatorValid = (operator == this.getOperator());

        boolean rightOperandValid = (rightOperand == this.getRightOperand());

        isValid = (leftValid && operatorValid && rightOperandValid);

        return isValid;
    }

}

