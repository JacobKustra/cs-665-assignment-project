/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Initialization.java
 * Description: The Initialization.java class contains methods needed to initialize
 * the program and how many words the user wants to type.
 */

package edu.bu.met.cs665.separateInterface;

import java.util.Scanner;

/**
 * The Initialization.java class contains methods needed to initialize
 * the program and how many words the user wants to type.
 */
public class Initialization {

  private Integer wordCountSelected = null;
  private int minWords = 1;
  private int maxWords = 50;

  /**
   * The Initialization constructor method is used to initiate the process of
   * having the user choose their difficulty.
   */
  public Initialization() {
    Messages initializationMessages = new Messages();

    Scanner userWordSelection = new Scanner(System.in);
    System.out.println("\nPlease enter the number of words you want to type between 1 and 50 "
        + "as an integer:");


    while (true) {
      try {
        int wordAmount = Integer.parseInt(userWordSelection.nextLine());
        if ((wordAmount >= minWords) && (wordAmount <= maxWords)) {
          System.out.println("You have selected " + wordAmount + " word to type!");
          setWordCountSelected(wordAmount);
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
   * The setWordCountSelected method is used to set the word count based on the
   * Integer passed into it.
   */
  public void setWordCountSelected(Integer wordCount) {
    this.wordCountSelected = wordCount;
  }

  /**
   * The getWordCountSelected method is used to return the word count.
   */
  public Integer getWordCountSelected() {
    return this.wordCountSelected;
  }


}
