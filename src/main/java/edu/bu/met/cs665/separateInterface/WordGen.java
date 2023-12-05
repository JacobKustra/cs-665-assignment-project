/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: WordGen.java
 * Description: The WordGen.java class contains how the program generates which words
 * it will use and implements the WordGenerator.java interface.
 */

package edu.bu.met.cs665.separateInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * The WordGen.java class contains how the program generates which words
 * it will use and implements the WordGenerator.java interface.
 */
public class WordGen implements edu.bu.met.cs665.customerTouchTypingInterface.WordGenerator {
  private final ArrayList<String> allWords = new ArrayList<>();
  private int wordAmountDone = 0;
  private int easy = 5;
  private int hard = 11;

  /**
   * The generate method overrides the interface and is used to generate the words
   * based on the difficulty selected and word amount while displaying a great interface
   * for the user.
   */
  @Override
  public void generate(int wordCount, String difficulty) {
    System.out.println("\nGenerating Touch Typing Phrase Now With " + wordCount + " Words...");
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    generateWords(wordCount, difficulty);
  }

  /**
   * The generateWords method overrides the interface and is used to generate the words
   * based on the difficulty selected and word amount.
   */
  @Override
  public void generateWords(int wordCount, String difficulty) {
    List<String> words = new ArrayList<>();
    // word list was pulled from https://web.stanford.edu/class/archive/cs/cs106l/cs106l.1102/assignments/dictionary.txt
    try (BufferedReader textFileReader = new BufferedReader(new FileReader("src/dictionary.txt"))) {
      String line;
      while ((line = textFileReader.readLine()) != null) {
        words.add(line);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    Random random = new Random();
    while (wordAmountDone < wordCount) {
      int randomInt = random.nextInt(words.size());
      String word = words.get(randomInt);
      if (difficulty.equals("EASY")) {
        if (word.length() <= easy) {
          addWord(word);
          wordAmountDone += 1;
        }
      } else if (difficulty.equals("MEDIUM")) {
        if (word.length() > easy && word.length() < hard) {
          addWord(word);
          wordAmountDone += 1;
        }
      } else if (difficulty.equals("HARD")) {
        if (word.length() >= hard) {
          addWord(word);
          wordAmountDone += 1;
        }
      }
    }
    displayAllWords();
  }

  /**
   * The getAllWords method overrides the interface and returns the
   * allWords ArrayList.
   */
  @Override
  public ArrayList<String> getAllWords() {
    return allWords;
  }

  /**
   * The addWord method overrides the interface and adds the String word
   * to the allWords ArrayList.
   */
  @Override
  public void addWord(String word) {
    this.allWords.add(word);
  }

  /**
   * The displayAllWords method overrides the interface and prints out
   * all of the words.
   */
  @Override
  public void displayAllWords() {
    System.out.println();
    for (String word: allWords){
      System.out.print(word + " ");
    }
    System.out.println();
  }

}
