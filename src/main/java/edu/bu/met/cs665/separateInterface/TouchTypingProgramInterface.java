/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: TouchTypingProgramInterface.java
 * Description: The TouchTypingProgramInterface.java class contains the bulk of how
 * the program operates and calls other classes to do so while being able to loop
 * if selected by the user.
 */

package edu.bu.met.cs665.separateInterface;


import java.util.ArrayList;

/**
 * The TouchTypingProgramInterface.java class contains the bulk of how
 * the program operates and calls other classes to do so while being able to loop
 * if selected by the user.
 */
public class TouchTypingProgramInterface {
  private int userContinue = 1;
  private double userScore = 0;

  private static TouchTypingProgramInterface uniqueInstance;

  /**
   * The getInstance method is used to check if an instance already exists of this
   * class, and if so return but if not create it.
   */
  public static synchronized TouchTypingProgramInterface getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new TouchTypingProgramInterface();
    }
    return uniqueInstance;
  }

  /**
   * The TouchTypingProgramInterface method is used to run the application and loop
   * it appropriately.
   */
  private TouchTypingProgramInterface() {
    Messages messages = new Messages();
    messages.welcomeMessage();

    while (userContinue == 1) {

      Initialization initialization = new Initialization();
      int wordAmount = initialization.getWordCountSelected();

      ChooseDifficulty chooseDifficulty = new ChooseDifficulty();
      chooseDifficulty.initiateChooseDifficulty();
      String userDifficulty = chooseDifficulty.getDifficultySelected();

      WordGen wordGen = new WordGen();
      wordGen.generate(wordAmount, userDifficulty);
      ArrayList<String> generatedWords = wordGen.getAllWords();

      UserInputs userInputs = new UserInputs();
      ArrayList<String> userWords = userInputs.getUserWords();

      CalcScore calcScore = new CalcScore();
      calcScore.calcScoreInitiate(generatedWords, userWords);
      userScore = calcScore.getScore();

      System.out.println("\nCongrats on finishing! Here is your score: " + userScore + " "
          + "out of 100!");

      ContinueProgram continueProgram = new ContinueProgram();
      continueProgram.initiateContinueProgram();
      setUserContinueMain(continueProgram.getUserContinueChoice());
    }
  }

  /**
   * The setUserContinueMain method is used to set the user continue decision based on the
   * int passed into it.
   */
  public void setUserContinueMain(int choice) {
    this.userContinue = choice;
  }

}
