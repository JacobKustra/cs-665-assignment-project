/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/5/2023
 * File Name: CalcScore.java
 * Description: The CalcScore.java class contains methods needed to calculate
 * the user's score.
 */

package edu.bu.met.cs665.separateInterface;

import java.util.ArrayList;

/**
 * The CalcScore.java class contains methods needed to calculate
 * the user's score, and has private variables points and score.
 */
public class CalcScore {
  private int points = 0;
  private double score = 0;

  /**
   * The calcScoreInitiate method is used to initiate the process of
   * calculating the user's score based on how many words they spelled correctly
   * from the list of generated words.
   */
  public void calcScoreInitiate(ArrayList<String> generatedWords, ArrayList<String> userWords) {
    int tempPoints = 0;
    int sizeGen = generatedWords.size();
    int sizeUser = userWords.size();

    if (sizeGen > sizeUser) {
      for (int i = 0; i < sizeUser; i++) {
        if (generatedWords.get(i).equals(userWords.get(i))) {
          tempPoints += 1;
        }
      }
    } else {
      for (int i = 0; i < sizeGen; i++) {
        if (generatedWords.get(i).equals(userWords.get(i))) {
          tempPoints += 1;
        }
      }
    }
    setPoints(tempPoints);
    int tempScore = (int) (((double) points / (double) sizeGen) * 100);
    setScore(tempScore);
  }

  /**
   * The setScore method is used to set the score based on the
   * double passed into it.
   */
  public void setScore(double score) {
    this.score = score;
  }

  /**
   * The setPoints method is used to set the points based on the
   * int passed into it.
   */
  public void setPoints(int points) {
    this.points = points;
  }

  /**
   * The getScore method is used to return the score.
   */
  public double getScore() {
    return score;
  }

}
