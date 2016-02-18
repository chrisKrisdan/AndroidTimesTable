package exceptions;

public class MathOperatorException extends Exception
{
    public MathOperatorException() {
        super();
    }

    public MathOperatorException(String message) {
        super("This operator is not valid. " + message);
    }

    public MathOperatorException(String message, String operator) {
        super("The " + operator + " operator is not valid. \r" +
                "Please ensure that one of the following is used instead:\r" +
                "= + - * / < > <= >=" + message);
    }
}

