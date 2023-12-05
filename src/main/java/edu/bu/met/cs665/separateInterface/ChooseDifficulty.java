/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: ChooseDifficulty.java
 * Description: The ChooseDifficulty.java class contains methods needed to
 * have the user select which difficulty of words they want to type.
 */

package edu.bu.met.cs665.separateInterface;

import java.util.Scanner;

/**
 * The ChooseDifficulty.java class contains methods needed to
 * have the user select which difficulty of words they want to type.
 */
public class ChooseDifficulty {
  private String difficulty = null;

  /**
   * The initiateChooseDifficulty method is used to initiate the process of
   * having the user choose their difficulty.
   */
  public void initiateChooseDifficulty () {
    Messages initializationMessages = new Messages();

    Scanner userDifficultySelection = new Scanner(System.in);
    System.out.println("\nPlease enter 1 for EASY difficulty, 2 for MEDIUM difficulty, or 3 for "
        + "HARD difficulty ");


    while (true) {
      try {
        int difficultySelected = Integer.parseInt(userDifficultySelection.nextLine());
        if (difficultySelected == 1) {
          System.out.println("You have selected " + difficultySelected + " for the EASY "
              + "difficulty!");
          setDifficultySelected("EASY");
          break;
        } else if (difficultySelected == 2) {
          System.out.println("You have selected " + difficultySelected + " for the MEDIUM "
              + "difficulty!");
          setDifficultySelected("MEDIUM");
          break;
        } else if (difficultySelected == 3) {
          System.out.println("You have selected " + difficultySelected + " for the HARD "
              + "difficulty!");
          setDifficultySelected("HARD");
          break;
        } else {
          initializationMessages.errorInputMessage();
        }
      } catch (NumberFormatException e) {
        initializationMessages.errorInputMessage();
      }
    }
  }

  /**
   * The setDifficultySelected method is used to set the difficulty based on the
   * String passed into it.
   */
  public void setDifficultySelected(String difficulty) {
    this.difficulty = difficulty;
  }

  /**
   * The getDifficultySelected method is used to return the difficulty.
   */
  public String getDifficultySelected() {
    return this.difficulty;
  }



}
