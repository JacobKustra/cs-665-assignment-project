/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: WordGenerator.java
 * Description: The WordGenerator.java interface contains an interface for
 * classes to implement in order to generate words for the program and is implemented
 * by the WordGen.java class.
 */

package edu.bu.met.cs665.customerTouchTypingInterface;

import java.util.ArrayList;

/**
 * This is the WordGenerator.java interface contains an interface for
 * classes to implement in order to generate words for the program.
 */
public interface WordGenerator {

  /**
   * This is the generate method which sets the default layout, which
   * will be overwritten in the class that implements it.
   */
  default void generate(int wordCount, String difficulty) {
  }

  /**
   * This is the generateWords method which sets the default layout, which
   * will be overwritten in the class that implements it.
   */
  default void generateWords(int wordCount, String difficulty) {
  }

  /**
   * This is the getAllWords method which sets the default layout, which
   * will be overwritten in the class that implements it.
   */
  default ArrayList<String> getAllWords() {
    return null;
  }

  /**
   * This is the addWord method which sets the default layout, which
   * will be overwritten in the class that implements it.
   */
  default void addWord(String word) {
  }

  /**
   * This is the displayAllWords method which sets the default layout, which
   * will be overwritten in the class that implements it.
   */
  default void displayAllWords() {
  }


}
