package com.souleymane_entertainment.zloutch.model;

import android.util.Log;

import java.io.Serializable;

public class User implements Serializable {

  private String username;

  private int turnScore;

  private int totalScore;

  private int zloutch;

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

  public void addLapScore(int diceValue) {
    if(diceValue == 1){
      turnScore = turnScore +100;
    }
    else if(diceValue == 5){
      turnScore = turnScore +50;
    }
  }

  public void addTripletLapScore(int diceValue){
    switch (diceValue){
      case 1:
        Log.d("dice value triplet", Integer.toString(diceValue));
        turnScore = turnScore + 1000;
        break;
      case 2:
        Log.d("dice value triplet", Integer.toString(diceValue));

        turnScore = turnScore + 200;
        break;
      case 3:
        Log.d("dice value triplet", Integer.toString(diceValue));

        turnScore = turnScore + 300;
        break;
      case 4:
        Log.d("dice value triplet", Integer.toString(diceValue));

        turnScore = turnScore + 400;
        break;
      case 5:
        Log.d("dice value triplet", Integer.toString(diceValue));

        turnScore = turnScore + 500;
        break;
      case 6:
        Log.d("dice value triplet", Integer.toString(diceValue));

        turnScore = turnScore + 600;
        break;
    }
  }

  public void addTotalScore(int turnScore) {
    this.totalScore = totalScore + turnScore;
  }

  public int getZloutch() {
    return zloutch;
  }

  public void setZloutch(int zloutch) {
    this.zloutch = zloutch;
  }

  public boolean hasVerifiedLapScore() {
    return this.turnScore % 100 == 0 && this.turnScore>=200;
  }
}
