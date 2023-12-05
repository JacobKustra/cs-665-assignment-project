/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: TestAge.java
 * Description: The TestAge.java class contains all of my unit tests for the program.
 */

package edu.bu.met.cs665;


import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.separateInterface.CalcScore;
import edu.bu.met.cs665.separateInterface.ChooseDifficulty;
import edu.bu.met.cs665.separateInterface.ContinueProgram;
import org.junit.Test;

/**
 * This is the TestAge Class, which contains units tests for my Touch Typing application
 * to test the functionality works as expected.
 */
public class TestAge {

    /**
     * This is the testDifficultyHard method, which will test to ensure that the difficulty
     * selected by the user, in this case HARD, is the correct one that will be assigned
     * for the program to use. In this case this choice is being mocked as if the user chose.
     */
    @Test
    public void testDifficultyHard() {
        ChooseDifficulty chooseDifficultyTestHard = new ChooseDifficulty();
        chooseDifficultyTestHard.setDifficultySelected("HARD");
        String difficulty = chooseDifficultyTestHard.getDifficultySelected();
        assertEquals(difficulty, "HARD");
    }


    /**
     * This is the testCalcScore method, which will test to ensure that once the user's
     * score is calculated/set by the application it will return the same value to then
     * present to the customer after the round.
     */
    @Test
    public void testCalcScore() {
        CalcScore calcScoreTest = new CalcScore();
        calcScoreTest.setScore(21.0);
        double score = calcScoreTest.getScore();
        if (score == 21.0) {
            assert true;
        } else {
            assert false;
        }
    }


    /**
     * This is the testContinueProgram method, which will test to ensure that the choice
     * made by the user to continue is returned correctly so the application knows to continue
     * the program with another round.
     */
    @Test
    public void testContinueProgram() {
        ContinueProgram continueProgramTest = new ContinueProgram();
        continueProgramTest.setUserContinueChoice(1);
        int continueChoice = continueProgramTest.getUserContinueChoice();
        if (continueChoice == 1) {
            assert true;
        } else {
            assert false;
        }
    }

    /**
     * This is the testStopProgram method, which will test to ensure that the choice
     * made by the user to stop is returned correctly so the application knows when to end
     * the program.
     */
    @Test
    public void testStopProgram() {
        ContinueProgram continueProgramTest = new ContinueProgram();
        continueProgramTest.setUserContinueChoice(2);
        int continueChoice = continueProgramTest.getUserContinueChoice();
        if (continueChoice == 2) {
            assert true;
        } else {
            assert false;
        }
    }

    /**
     * This is the testDifficultyEasy method, which will test to ensure that the difficulty
     * selected by the user, in this case EASY, is the correct one that will be assigned
     * for the program to use. In this case this choice is being mocked as if the user chose.
     */
    @Test
    public void testDifficultyEasy() {
        ChooseDifficulty chooseDifficultyTestEasy = new ChooseDifficulty();
        chooseDifficultyTestEasy.setDifficultySelected("EASY");
        String difficulty = chooseDifficultyTestEasy.getDifficultySelected();
        assertEquals(difficulty, "EASY");
    }



}
