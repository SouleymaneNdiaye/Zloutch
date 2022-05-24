package com.souleymane_entertainment.zloutch.model;

public class Dice {

  private int value;
  private boolean available=true;



  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    if(value<1 || value>6){
      throw new NumberFormatException("Dice value must be between 1 and 6");
    }
    else{
      this.value = value;
    }
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
}
