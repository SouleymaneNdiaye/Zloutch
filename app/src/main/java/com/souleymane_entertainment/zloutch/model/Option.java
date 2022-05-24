package com.souleymane_entertainment.zloutch.model;

import java.io.Serializable;
import java.util.List;

public class Option implements Serializable {

  private int numberOfPlayer;

  public List<User> userList;

  public User currentUser;

  public User getUserByUsername(String username) {
    if (username != null) {
      for (User user : userList) {
        if (user.getUsername().equals(username)) {
          return user;
        }
      }
    }
    return null;
  }

  public int getNumberOfPlayer() {
    return numberOfPlayer;
  }

  public void setNumberOfPlayer(int numberOfPlayer){
    this.numberOfPlayer = numberOfPlayer;
  }
}
