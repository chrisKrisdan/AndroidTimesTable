import java.util.Set;

        import exceptions.MathOperatorException;
        import questions.SimpleMathQuestion;

/**
 * Created by Chris on 17/02/2016.
 */
public interface TimesTable {

    int getMultiplier();

    int getNumQuestions();

    Set<SimpleMathQuestion> getQuestions();


    Set<SimpleMathQuestion> generateQuestions() throws MathOperatorException;

    int[] getMultiples();
}
