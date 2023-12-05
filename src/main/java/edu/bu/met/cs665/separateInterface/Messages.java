/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Messages.java
 * Description: The Messages.java class contains methods needed to send the
 * user common messages.
 */

package edu.bu.met.cs665.separateInterface;

/**
 * The Messages.java class contains methods needed to send the
 * user common messages.
 */
public class Messages {

  /**
   * The errorInputMessage method will print out the error message when the user
   * makes an incorrect input.
   */
  public void errorInputMessage() {
    System.out.println("ERROR: Please enter the number of words you want to type between 1 and 50 "
        + "as an integer.");
  }

  /**
   * The welcomeMessage method will print out the welcome message.
   */
  public void welcomeMessage() {
    System.out.println("\nWelcome to Jacob Kustra's Learn Touch Typing Application");
  }

}
