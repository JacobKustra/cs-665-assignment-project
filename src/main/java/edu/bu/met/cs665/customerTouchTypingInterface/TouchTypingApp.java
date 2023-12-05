/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: TouchTypingApp.java
 * Description: The TouchTypingApp.java class contains the main method, which is
 * used to start/run the program.
 */

package edu.bu.met.cs665.customerTouchTypingInterface;

import edu.bu.met.cs665.separateInterface.TouchTypingProgramInterface;


/**
 * This is the TouchTypingApp class which is used by the user to run the program.
 */
public class TouchTypingApp {

  /**
   * A main method which allows the customer to initiate the TouchTypingProgramInterface to run
   * the Touch Typing program.
   */
  public static void main(String[] args) {
    TouchTypingProgramInterface.getInstance();
  }

}
