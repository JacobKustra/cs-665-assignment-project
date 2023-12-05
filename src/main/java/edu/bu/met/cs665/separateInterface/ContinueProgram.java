/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: ContinueProgram.java
 * Description: The ContinueProgram.java class contains methods needed to
 * have the user select whether or not they want to continue the program.
 */

package edu.bu.met.cs665.separateInterface;

import java.util.Scanner;

/**
 * The ContinueProgram.java class contains methods needed to
 * have the user select whether or not they want to continue the program.
 */
public class ContinueProgram {

  private int userContinueChoice = 1;

  /**
   * The initiateContinueProgram method is used to initiate the process of
   * having the user choose whether they will continue the program or not.
   */
  public void initiateContinueProgram() {
    Messages messages = new Messages();
    System.out.println("\nSelect 1 to try again, "
        + "or select 2 to stop Touch Typing.");

    Scanner userContinueInput = new Scanner(System.in);
    while (true) {
      while (!userContinueInput.hasNextInt()) {
        messages.errorInputMessage();
        userContinueInput.nextLine();
      }
      int input2 = userContinueInput.nextInt();
      if (input2 == 1) {
        System.out.println("You have selected " + input2 + " continue Touch Typing.");
        break;
      } else if (input2 == 2) {
        System.out.println("You have selected " + input2 + " to end the program.");
        System.out.println("Shutting down now. Thanks for Touch Typing!");
        setUserContinueChoice(2);
        break;
      } else {
        messages.errorInputMessage();
      }
    }
  }

  /**
   * The setUserContinueChoice method is used to set the user's continue choice
   * based on the int passed into it.
   */
  public void setUserContinueChoice(int choice) {
    this.userContinueChoice = choice;
  }

  /**
   * The getUserContinueChoice method is used to return the user's choice to continue
   * or not.
   */
  public Integer getUserContinueChoice() {
    return this.userContinueChoice;
  }

}
