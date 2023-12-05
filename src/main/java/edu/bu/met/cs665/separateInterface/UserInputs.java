/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: UserInputs.java
 * Description: The UserInputs.java class contains the methods needed to handle
 * the user's inputs of their actual words.
 */

package edu.bu.met.cs665.separateInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The UserInputs.java class contains the methods needed to handle
 * the user's inputs of their actual words.
 */
public class UserInputs {

  private final ArrayList<String> userWords = new ArrayList<>();

  /**
   * The UserInputs constructor method is needed to handle
   * the user's inputs of their actual words and splitting it up word by word.
   */
  public UserInputs() {
    System.out.println("Type the phrase below:");
    Scanner userInput = new Scanner(System.in);

    String userPhrase = userInput.nextLine();
    splitPhrase(userPhrase);
  }

  /**
   * The splitPhrase method contains the method needed to handle
   * splitting the the user's inputs up by spaces.
   */
  public void splitPhrase(String userPhrase) {
    String[] userWords = userPhrase.split("\\s+");
    ArrayList<String> strList = new ArrayList<>(Arrays.asList(userWords));
    this.userWords.addAll(strList);
  }

  /**
   * The getUserWords method returns the user's words.
   */
  public ArrayList<String> getUserWords() {
    return userWords;
  }

}
