/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: Main.java
 * Description: The Main.java class contains the main method, which is
 * used to start/run an example of the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.separateInterface.TouchTypingProgramInterface;


/**
 * This is the Main class which is used to show an example of how the program can
 * be used.
 */
public class Main {

  /**
   * A main method which initiates the TouchTypingProgramInterface to run
   * the Touch Typing program.
   */
  public static void main(String[] args) {

    TouchTypingProgramInterface touchTypingProgram = TouchTypingProgramInterface.getInstance();

  }



}
