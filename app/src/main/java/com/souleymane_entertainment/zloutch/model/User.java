package com.souleymane_entertainment.zloutch.model;

import java.io.Serializable;

public class User implements Serializable {

  private String username;

  private int turnScore;

  private int totalScore;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getTurnScore() {
    return turnScore;
  }

  public void setTurnScore(int turnScore) {
    this.turnScore = turnScore;
  }

  public int getTotalScore() {
    return totalScore;
  }

  public void setTotalScore(int totalScore) {
    this.totalScore = totalScore;
  }

  public void addLapScore(int diceValueView1) {
    if(diceValueView1 == 1){
      turnScore = turnScore +100;
    }
    else if(diceValueView1 == 5){
      turnScore = turnScore +50;
    }
  }

  public void addTotalScore(int turnScore) {
    this.totalScore = totalScore + turnScore;
  }
}
