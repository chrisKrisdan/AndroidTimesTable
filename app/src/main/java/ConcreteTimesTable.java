import java.util.HashSet;
import java.util.Set;

import exceptions.MathOperatorException;
import questions.SimpleMathQuestion;

/**
 * Created by Daniel on 11/02/2016.
 */
public class ConcreteTimesTable implements TimesTable {

    int multiplier;

    int numQuestions;

    Set<SimpleMathQuestion> questions;

    /**
     * @param multiplier
     * @param numQuestions
     */
    public ConcreteTimesTable(int multiplier, int numQuestions) {

        this.setMultiplier(multiplier);

        this.setNumQuestions(numQuestions);

        try {

            Set<SimpleMathQuestion> questions = this.generateQuestions();

            this.setQuestions(questions);

        } catch (MathOperatorException e) {

            e.getMessage();
            //exit;
        }

    }

    /**
     * ------- HELPER METHODS -------
     *
     */

    @Override
    public int getMultiplier() {
        return multiplier;
    }

    private void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public int getNumQuestions() {
        return numQuestions;
    }

    private void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    @Override
    public Set<SimpleMathQuestion> getQuestions() {
        return questions;
    }

    private void setQuestions(Set<SimpleMathQuestion> questions) {
        this.questions = questions;
    }

    /**
     * ------- PROTOCOL METHODS -------
     *
     */


    @Override
    public Set<SimpleMathQuestion> generateQuestions() throws MathOperatorException {

        int numQs = this.getNumQuestions();
        int multiplier = this.getMultiplier();

        Set<SimpleMathQuestion> questions = ConcreteTimesTable.generateQuestions(numQs, multiplier);

        return questions;
    }

    public static final Set<SimpleMathQuestion> generateQuestions(int numQs, int multiplier) throws MathOperatorException {

        HashSet<SimpleMathQuestion> questions = new HashSet<SimpleMathQuestion>();

        for (int i = 1; i <= numQs; i++) {

            questions.add(new SimpleMathQuestion(i, "*", multiplier));
        }

        return questions;
    }

    /** getMultiples()
     *
     * Returns an array of integers that represent each of
     * the multples by which the multiplier for this
     * times table will be multiplied.
     *
     * @return int[]
     */
    @Override
    public int[] getMultiples() {

        Set<SimpleMathQuestion> questions = this.getQuestions();

        int[] multiples = null;

        int i = 0;

        for (SimpleMathQuestion q : questions) {

            multiples[i] = q.getLeftOperand();

            i++;
        }
        return multiples;
    }

}

