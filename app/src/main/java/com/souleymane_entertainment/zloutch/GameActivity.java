package com.souleymane_entertainment.zloutch;

import static com.souleymane_entertainment.zloutch.OptionActivity.OPTION_FOR_GAME;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.souleymane_entertainment.zloutch.model.Dice;
import com.souleymane_entertainment.zloutch.model.Game;
import com.souleymane_entertainment.zloutch.model.Option;
import com.souleymane_entertainment.zloutch.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
  private TextView gameTextView;
  private TextView gameTextViewWhoPlay;
  private Button gameButtonOption;

  private RelativeLayout linearLayoutUnplayableDice1;
  private RelativeLayout linearLayoutUnplayableDice2;
  private RelativeLayout linearLayoutUnplayableDice3;
  private RelativeLayout linearLayoutUnplayableDice4;
  private RelativeLayout linearLayoutUnplayableDice5;

  private RelativeLayout linearLayoutPlayableDice1;
  private RelativeLayout linearLayoutPlayableDice2;
  private RelativeLayout linearLayoutPlayableDice3;
  private RelativeLayout linearLayoutPlayableDice4;
  private RelativeLayout linearLayoutPlayableDice5;

  private Button unplayableDice1;
  private Button unplayableDice2;
  private Button unplayableDice3;
  private Button unplayableDice4;
  private Button unplayableDice5;
  private Button playableDice1;
  private Button playableDice2;
  private Button playableDice3;
  private Button playableDice4;
  private Button playableDice5;

  private Button throwButton;
  private Button keepButton;
  private Button endLapButton;
  private Game game;

  private ImageView dice1PictureDice1;
  private ImageView dice1PictureDice2;
  private ImageView dice1PictureDice3;
  private ImageView dice1PictureDice4;
  private ImageView dice1PictureDice5;
  private ImageView dice1PictureDice6;


  private ImageView dice2PictureDice1;
  private ImageView dice2PictureDice2;
  private ImageView dice2PictureDice3;
  private ImageView dice2PictureDice4;
  private ImageView dice2PictureDice5;
  private ImageView dice2PictureDice6;

  private ImageView dice3PictureDice1;
  private ImageView dice3PictureDice2;
  private ImageView dice3PictureDice3;
  private ImageView dice3PictureDice4;
  private ImageView dice3PictureDice5;
  private ImageView dice3PictureDice6;

  private ImageView dice4PictureDice1;
  private ImageView dice4PictureDice2;
  private ImageView dice4PictureDice3;
  private ImageView dice4PictureDice4;
  private ImageView dice4PictureDice5;
  private ImageView dice4PictureDice6;

  private ImageView dice5PictureDice1;
  private ImageView dice5PictureDice2;
  private ImageView dice5PictureDice3;
  private ImageView dice5PictureDice4;
  private ImageView dice5PictureDice5;
  private ImageView dice5PictureDice6;

  private ImageView unplayableDice1PictureDice1;
  private ImageView unplayableDice1PictureDice2;
  private ImageView unplayableDice1PictureDice3;
  private ImageView unplayableDice1PictureDice4;
  private ImageView unplayableDice1PictureDice5;
  private ImageView unplayableDice1PictureDice6;


  private ImageView unplayableDice2PictureDice1;
  private ImageView unplayableDice2PictureDice2;
  private ImageView unplayableDice2PictureDice3;
  private ImageView unplayableDice2PictureDice4;
  private ImageView unplayableDice2PictureDice5;
  private ImageView unplayableDice2PictureDice6;

  private ImageView unplayableDice3PictureDice1;
  private ImageView unplayableDice3PictureDice2;
  private ImageView unplayableDice3PictureDice3;
  private ImageView unplayableDice3PictureDice4;
  private ImageView unplayableDice3PictureDice5;
  private ImageView unplayableDice3PictureDice6;

  private ImageView unplayableDice4PictureDice1;
  private ImageView unplayableDice4PictureDice2;
  private ImageView unplayableDice4PictureDice3;
  private ImageView unplayableDice4PictureDice4;
  private ImageView unplayableDice4PictureDice5;
  private ImageView unplayableDice4PictureDice6;

  private ImageView unplayableDice5PictureDice1;
  private ImageView unplayableDice5PictureDice2;
  private ImageView unplayableDice5PictureDice3;
  private ImageView unplayableDice5PictureDice4;
  private ImageView unplayableDice5PictureDice5;
  private ImageView unplayableDice5PictureDice6;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

      gameTextView = findViewById(R.id.game_textview_greeting);
      gameTextViewWhoPlay = findViewById(R.id.game_textview_who_play);
      gameButtonOption = findViewById(R.id.game_button_option);
      linearLayoutUnplayableDice1 = findViewById(R.id.option_parent_horizontal_unplayable_layout_1);
      linearLayoutUnplayableDice2 = findViewById(R.id.option_parent_horizontal_unplayable_layout_2);
      linearLayoutUnplayableDice3 = findViewById(R.id.option_parent_horizontal_unplayable_layout_3);
      linearLayoutUnplayableDice4 = findViewById(R.id.option_parent_horizontal_unplayable_layout_4);
      linearLayoutUnplayableDice5 = findViewById(R.id.option_parent_horizontal_unplayable_layout_5);
      linearLayoutPlayableDice1 = findViewById(R.id.option_parent_horizontal_playable_layout_1);
      linearLayoutPlayableDice2 = findViewById(R.id.option_parent_horizontal_playable_layout_2);
      linearLayoutPlayableDice3 = findViewById(R.id.option_parent_horizontal_playable_layout_3);
      linearLayoutPlayableDice4 = findViewById(R.id.option_parent_horizontal_playable_layout_4);
      linearLayoutPlayableDice5 = findViewById(R.id.option_parent_horizontal_playable_layout_5);

      throwButton = findViewById(R.id.game_button_throw);
      keepButton = findViewById(R.id.game_button_keep);
      endLapButton = findViewById(R.id.game_button_end_lap);

      unplayableDice1 = findViewById(R.id.game_unplayable_dice1);
      unplayableDice2 = findViewById(R.id.game_unplayable_dice2);
      unplayableDice3 = findViewById(R.id.game_unplayable_dice3);
      unplayableDice4 = findViewById(R.id.game_unplayable_dice4);
      unplayableDice5 = findViewById(R.id.game_unplayable_dice5);
      playableDice1 = findViewById(R.id.game_playable_dice1);
      playableDice2 = findViewById(R.id.game_playable_dice2);
      playableDice3 = findViewById(R.id.game_playable_dice3);
      playableDice4 = findViewById(R.id.game_playable_dice4);
      playableDice5 = findViewById(R.id.game_playable_dice5);

      dice1PictureDice1 = findViewById(R.id.dice1PictureDice1);
      dice1PictureDice2 = findViewById(R.id.dice1PictureDice2);
      dice1PictureDice3 = findViewById(R.id.dice1PictureDice3);
      dice1PictureDice4 = findViewById(R.id.dice1PictureDice4);
      dice1PictureDice5 = findViewById(R.id.dice1PictureDice5);
      dice1PictureDice6 = findViewById(R.id.dice1PictureDice6);


    dice2PictureDice1 = findViewById(R.id.dice2PictureDice1);
    dice2PictureDice2 = findViewById(R.id.dice2PictureDice2);
    dice2PictureDice3 = findViewById(R.id.dice2PictureDice3);
    dice2PictureDice4 = findViewById(R.id.dice2PictureDice4);
    dice2PictureDice5 = findViewById(R.id.dice2PictureDice5);
    dice2PictureDice6 = findViewById(R.id.dice2PictureDice6);

    dice3PictureDice1 = findViewById(R.id.dice3PictureDice1);
    dice3PictureDice2 = findViewById(R.id.dice3PictureDice2);
    dice3PictureDice3 = findViewById(R.id.dice3PictureDice3);
    dice3PictureDice4 = findViewById(R.id.dice3PictureDice4);
    dice3PictureDice5 = findViewById(R.id.dice3PictureDice5);
    dice3PictureDice6 = findViewById(R.id.dice3PictureDice6);

      dice4PictureDice1 = findViewById(R.id.dice4PictureDice1);
      dice4PictureDice2 = findViewById(R.id.dice4PictureDice2);
      dice4PictureDice3 = findViewById(R.id.dice4PictureDice3);
      dice4PictureDice4 = findViewById(R.id.dice4PictureDice4);
      dice4PictureDice5 = findViewById(R.id.dice4PictureDice5);
      dice4PictureDice6 = findViewById(R.id.dice4PictureDice6);


    dice5PictureDice1 = findViewById(R.id.dice5PictureDice1);
    dice5PictureDice2 = findViewById(R.id.dice5PictureDice2);
    dice5PictureDice3 = findViewById(R.id.dice5PictureDice3);
    dice5PictureDice4 = findViewById(R.id.dice5PictureDice4);
    dice5PictureDice5 = findViewById(R.id.dice5PictureDice5);
    dice5PictureDice6 = findViewById(R.id.dice5PictureDice6);


    unplayableDice1PictureDice1 = findViewById(R.id.unplayableDice1PictureDice1);
    unplayableDice1PictureDice2 = findViewById(R.id.unplayableDice1PictureDice2);
    unplayableDice1PictureDice3 = findViewById(R.id.unplayableDice1PictureDice3);
    unplayableDice1PictureDice4 = findViewById(R.id.unplayableDice1PictureDice4);
    unplayableDice1PictureDice5 = findViewById(R.id.unplayableDice1PictureDice5);
    unplayableDice1PictureDice6 = findViewById(R.id.unplayableDice1PictureDice6);


    unplayableDice2PictureDice1 = findViewById(R.id.unplayableDice2PictureDice1);
    unplayableDice2PictureDice2 = findViewById(R.id.unplayableDice2PictureDice2);
    unplayableDice2PictureDice3 = findViewById(R.id.unplayableDice2PictureDice3);
    unplayableDice2PictureDice4 = findViewById(R.id.unplayableDice2PictureDice4);
    unplayableDice2PictureDice5 = findViewById(R.id.unplayableDice2PictureDice5);
    unplayableDice2PictureDice6 = findViewById(R.id.unplayableDice2PictureDice6);

    unplayableDice3PictureDice1 = findViewById(R.id.unplayableDice3PictureDice1);
    unplayableDice3PictureDice2 = findViewById(R.id.unplayableDice3PictureDice2);
    unplayableDice3PictureDice3 = findViewById(R.id.unplayableDice3PictureDice3);
    unplayableDice3PictureDice4 = findViewById(R.id.unplayableDice3PictureDice4);
    unplayableDice3PictureDice5 = findViewById(R.id.unplayableDice3PictureDice5);
    unplayableDice3PictureDice6 = findViewById(R.id.unplayableDice3PictureDice6);

    unplayableDice4PictureDice1 = findViewById(R.id.unplayableDice4PictureDice1);
    unplayableDice4PictureDice2 = findViewById(R.id.unplayableDice4PictureDice2);
    unplayableDice4PictureDice3 = findViewById(R.id.unplayableDice4PictureDice3);
    unplayableDice4PictureDice4 = findViewById(R.id.unplayableDice4PictureDice4);
    unplayableDice4PictureDice5 = findViewById(R.id.unplayableDice4PictureDice5);
    unplayableDice4PictureDice6 = findViewById(R.id.unplayableDice4PictureDice6);


    unplayableDice5PictureDice1 = findViewById(R.id.unplayableDice5PictureDice1);
    unplayableDice5PictureDice2 = findViewById(R.id.unplayableDice5PictureDice2);
    unplayableDice5PictureDice3 = findViewById(R.id.unplayableDice5PictureDice3);
    unplayableDice5PictureDice4 = findViewById(R.id.unplayableDice5PictureDice4);
    unplayableDice5PictureDice5 = findViewById(R.id.unplayableDice5PictureDice5);
    unplayableDice5PictureDice6 = findViewById(R.id.unplayableDice5PictureDice6);


      game = new Game();
      game.playableDice1 = new Dice();
      game.playableDice2 = new Dice();
      game.playableDice3 = new Dice();
      game.playableDice4 = new Dice();
      game.playableDice5 = new Dice();

      Intent intent = getIntent();
      game.option = (Option)intent.getSerializableExtra(OPTION_FOR_GAME);
      Log.d("Option number player",Integer.toString(game.option.getNumberOfPlayer()));

      gameButtonOption.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          createOptionModale();
        }
      });

      hideUnplayableDice();

  }



  @Override
  protected void onResume() {
    super.onResume();

    hideButtonDice();
    updateCurrentUser();
    updatePlayableDice();
    updateScoreText();
    throwButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if(thereIsNoFiveOrOne()){
          updatePlayableDice();
          setZloutch();
        }
        else{
          makeKeepFiveAndOneToast();
        }
      }
    });
    keepButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        keepTriplet();
        keepFivesAndOnes();
        updateUnplayableDicePicture();
        updateScoreText();
        releaseDiceIfNecessary();
        hideButtonDice();
        if(game.option.currentUser.getTotalScore() + game.option.currentUser.getTurnScore()>=5000){
          updateTotalScore();
          Intent gameActivityIntent = new Intent(GameActivity.this, SummaryActivity.class);
          gameActivityIntent.putExtra(OPTION_FOR_GAME,game.option);
          startActivity(gameActivityIntent);
        }
      }
    });
    endLapButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if(game.option!=null && game.option.currentUser!=null && game.option.currentUser.hasVerifiedLapScore()){
          endLap();
          hideButtonDice();
        }
        else{
          makeUnverifiedLapScoreToast();
        }
      }
    });
  }

  private void hideButtonDice() {
    playableDice1.setVisibility(View.GONE);
    playableDice2.setVisibility(View.GONE);
    playableDice3.setVisibility(View.GONE);
    playableDice4.setVisibility(View.GONE);
    playableDice5.setVisibility(View.GONE);
    unplayableDice1.setVisibility(View.GONE);
    unplayableDice2.setVisibility(View.GONE);
    unplayableDice3.setVisibility(View.GONE);
    unplayableDice4.setVisibility(View.GONE);
    unplayableDice5.setVisibility(View.GONE);
  }


  private void makeUnverifiedLapScoreToast() {
    Toast.makeText(this,"Vous ne pouvez pas finir le tour car votre score n'est pas un multiple de 100 ou celui ci est inférieur à 200!",Toast.LENGTH_LONG).show();

  }

  private void keepTriplet() {
    if(gameTriplet()!=null && gameTripletIsAvailable()){
      int suppress = 0 ;
      Integer diceValueView1 = Integer.parseInt(playableDice1.getText().toString());
      Integer diceValueView2 = Integer.parseInt(playableDice2.getText().toString());
      Integer diceValueView3 = Integer.parseInt(playableDice3.getText().toString());
      Integer diceValueView4 = Integer.parseInt(playableDice4.getText().toString());
      Integer diceValueView5 = Integer.parseInt(playableDice5.getText().toString());

      if(diceValueView1.intValue()==gameTriplet().intValue() && game.playableDice1.isAvailable()) {
        suppress = suppress + 1;
        game.playableDice1.setValue(diceValueView1);
        game.playableDice1.setAvailable(false);
        linearLayoutPlayableDice1.setVisibility(View.GONE);
        linearLayoutUnplayableDice1.setVisibility(View.VISIBLE);
        unplayableDice1.setText(Integer.toString(diceValueView1));
      }
      if(diceValueView2.intValue() == gameTriplet().intValue() && game.playableDice2.isAvailable()) {
        suppress = suppress + 1;
        game.playableDice2.setValue(diceValueView1);
        game.playableDice2.setAvailable(false);
        linearLayoutPlayableDice2.setVisibility(View.GONE);
        linearLayoutUnplayableDice2.setVisibility(View.VISIBLE);
        unplayableDice2.setText(Integer.toString(diceValueView2));

      }
      if(diceValueView3.intValue() == gameTriplet().intValue() && game.playableDice3.isAvailable()) {
        suppress = suppress + 1;
        game.playableDice3.setValue(diceValueView1);
        game.playableDice3.setAvailable(false);
        linearLayoutPlayableDice3.setVisibility(View.GONE);
        linearLayoutUnplayableDice3.setVisibility(View.VISIBLE);
        unplayableDice3.setText(Integer.toString(diceValueView3));

      }
      if(diceValueView4.intValue() == gameTriplet().intValue() && game.playableDice4.isAvailable() && suppress<3) {
        suppress = suppress + 1;
        game.playableDice4.setValue(diceValueView1);
        game.playableDice4.setAvailable(false);
        linearLayoutPlayableDice4.setVisibility(View.GONE);
        linearLayoutUnplayableDice4.setVisibility(View.VISIBLE);
        unplayableDice4.setText(Integer.toString(diceValueView4));

      }
      if(diceValueView5.intValue() == gameTriplet().intValue() && game.playableDice5.isAvailable() && suppress<3) {
        suppress = suppress + 1;
        game.playableDice5.setValue(diceValueView1);
        game.playableDice5.setAvailable(false);
        linearLayoutPlayableDice5.setVisibility(View.GONE);
        linearLayoutUnplayableDice5.setVisibility(View.VISIBLE);
        unplayableDice5.setText(Integer.toString(diceValueView5));

      }
      if(suppress==3){
        game.option.currentUser.addTripletLapScore(gameTriplet().intValue());
      }

    }
  }


  private Integer gameTriplet() {
    Integer diceValueView1 = Integer.parseInt(playableDice1.getText().toString());
    Integer diceValueView2 = Integer.parseInt(playableDice2.getText().toString());
    Integer diceValueView3 = Integer.parseInt(playableDice3.getText().toString());
    Integer diceValueView4 = Integer.parseInt(playableDice4.getText().toString());
    Integer diceValueView5 = Integer.parseInt(playableDice5.getText().toString());

    List<Integer> diceValueList = new ArrayList<>();
    diceValueList.add(diceValueView1);
    diceValueList.add(diceValueView2);
    diceValueList.add(diceValueView3);
    diceValueList.add(diceValueView4);
    diceValueList.add(diceValueView5);

    for(int i = 0; i< diceValueList.size(); i++){
      for(int j = 0; j< diceValueList.size(); j++){
        for(int k = 0; k< diceValueList.size(); k++){
          if(diceValueList.get(i).intValue()==diceValueList.get(j).intValue() && diceValueList.get(j).intValue()==diceValueList.get(k).intValue()
          && i!=j && j!=k && i!= k){
            return diceValueList.get(i);
          }
        }
      }
    }

    return null;
  }



  private void makeKeepFiveAndOneToast() {
    Toast.makeText(this,"Gardez les 1 et les 5 pour continuer à jouer!",Toast.LENGTH_LONG).show();
  }
  private boolean thereIsNoFiveOrOne() {
    if(((playableDice1.getText().toString().equals("1")||playableDice1.getText().toString().equals("5")
    )&&(linearLayoutPlayableDice1.getVisibility() == View.VISIBLE))
    ||((playableDice2.getText().toString().equals("1")||playableDice2.getText().toString().equals("5")
    )&&(linearLayoutPlayableDice2.getVisibility() == View.VISIBLE))
    ||((playableDice3.getText().toString().equals("1")||playableDice3.getText().toString().equals("5")
    )&&(linearLayoutPlayableDice3.getVisibility() == View.VISIBLE))
    ||((playableDice4.getText().toString().equals("1")||playableDice4.getText().toString().equals("5")
    )&&(linearLayoutPlayableDice4.getVisibility() == View.VISIBLE))
    ||((playableDice5.getText().toString().equals("1")||playableDice5.getText().toString().equals("5")
    )&&(linearLayoutPlayableDice5.getVisibility() == View.VISIBLE))
    ){
      return false;
    }
    else return true;
  }

  private void releaseDiceIfNecessary() {
    if(!game.playableDice1.isAvailable()
      && !game.playableDice2.isAvailable()
      && !game.playableDice3.isAvailable()
      && !game.playableDice4.isAvailable()
      && !game.playableDice5.isAvailable()){

      updatePlayableAndUnplayableDice();
      updatePlayableDice();
    }
  }

  private void setZloutch() {
    boolean noZloutch = false;
    if(game.playableDice1.isAvailable()){
      if(playableDice1.getText().toString().equals("1")||playableDice1.getText().toString().equals("5")){
        noZloutch = true;
      }
    }
    if(game.playableDice2.isAvailable()){
      if(playableDice2.getText().toString().equals("1")||playableDice2.getText().toString().equals("5")){
        noZloutch = true;
      }
    }
    if(game.playableDice3.isAvailable()){
      if(playableDice3.getText().toString().equals("1")||playableDice3.getText().toString().equals("5")){
        noZloutch = true;
      }
    }
    if(game.playableDice4.isAvailable()){
      if(playableDice4.getText().toString().equals("1")||playableDice4.getText().toString().equals("5")){
        noZloutch = true;
      }
    }
    if(game.playableDice5.isAvailable()){
      if(playableDice5.getText().toString().equals("1")||playableDice5.getText().toString().equals("5")){
        noZloutch = true;
      }
    }
    if(gameTriplet()!=null && gameTripletIsAvailable()){
      noZloutch = true;
    }
    if(!noZloutch){
      AlertDialog.Builder builder = new AlertDialog.Builder(this);

      builder.setTitle("Zloutch")
        .setMessage(setZloutchMessage())
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
            builder.setCancelable(true);
          }
        })
        .create()
        .show();
    }
  }

  private String setZloutchMessage() {
    String message="";
    User user = game.option.getUserByUsername(game.option.currentUser.getUsername());
    updateCurrentUser();
    user.setZloutch(user.getZloutch()+1);
    updateScoreText();
    updatePlayableAndUnplayableDice();
    updatePlayableDice();
    if(user.getZloutch()<3){
      message = "Vous n'avez obtenu aucun 1, 5 ou triple sur cette main. Vous obtenez donc un Zloutch. Au tour de "+game.option.currentUser.getUsername()+" de jouer.";
    }else{
      message = "Vous n'avez obtenu aucun 1, 5 ou triple sur cette main. Cela fait trois zloutch vous perdez donc 200 points. Au tour de "+game.option.currentUser.getUsername()+" de jouer.";
      user.addTotalScore(-200);
      user.setZloutch(0);
    }
    return message;
  }

  private void endLap() {
    updateTotalScore();
    updateCurrentUser();
    updateScoreText();
    updatePlayableAndUnplayableDice();
    updatePlayableDice();
  }

  private void updatePlayableAndUnplayableDice() {
    game.playableDice1.setAvailable(true);
    game.playableDice2.setAvailable(true);
    game.playableDice3.setAvailable(true);
    game.playableDice4.setAvailable(true);
    game.playableDice5.setAvailable(true);
    hideUnplayableDice();
    showPlayableDice();
  }


  private void updateTotalScore() {
    User currentUser = game.option.getUserByUsername(game.option.currentUser.getUsername());
    currentUser.addTotalScore(game.option.currentUser.getTurnScore());
    currentUser.setTurnScore(0);
  }

  private void updateCurrentUser() {
    String currentUsername = game.option.currentUser != null ? game.option.currentUser.getUsername():null;
    game.option.currentUser = getNextUser(currentUsername);
    game.option.currentUser.setTurnScore(0);
    Log.d("Next User: ", game.option.currentUser.getUsername());
  }

  private void updateScoreText(){
    gameTextViewWhoPlay.setText("A vous de jouer "+game.option.currentUser.getUsername()+ ", votre score pour le tour est de " + game.option.currentUser.getTurnScore());

  }

  private User getNextUser(String currentUsername) {
    User nextUser= null;
    if(game.option.currentUser==null || currentUsername == null){
      nextUser = game.option.userList.get(0);
    }
    else{
      User currentUser = game.option.getUserByUsername(currentUsername);
      int indexOfCurrentUser = game.option.userList.indexOf(currentUser);
      if(indexOfCurrentUser < game.option.getNumberOfPlayer()-1){
        nextUser = game.option.userList.get(indexOfCurrentUser+1);
      }
      else{
        nextUser = game.option.userList.get(0);
      }
    }
    return nextUser;
  }

  private void keepFivesAndOnes() {
    Integer diceValueView1 = Integer.parseInt(playableDice1.getText().toString());
    Integer diceValueView2 = Integer.parseInt(playableDice2.getText().toString());
    Integer diceValueView3 = Integer.parseInt(playableDice3.getText().toString());
    Integer diceValueView4 = Integer.parseInt(playableDice4.getText().toString());
    Integer diceValueView5 = Integer.parseInt(playableDice5.getText().toString());

    if(thereIsNoTripletOfFiveOrOne()){
      if(diceValueView1 == 1 || diceValueView1 == 5) {
        if(game.playableDice1.isAvailable()) game.option.currentUser.addLapScore(diceValueView1);
        game.playableDice1.setValue(diceValueView1);
        game.playableDice1.setAvailable(false);
        linearLayoutPlayableDice1.setVisibility(View.GONE);
        linearLayoutUnplayableDice1.setVisibility(View.VISIBLE);
        unplayableDice1.setText(Integer.toString(diceValueView1));
        updateUnplayableDicePicture1(diceValueView1);
      }
      if(diceValueView2 == 1 || diceValueView2 == 5) {
        if(game.playableDice2.isAvailable()) game.option.currentUser.addLapScore(diceValueView2);
        game.playableDice2.setValue(diceValueView2);
        game.playableDice2.setAvailable(false);
        linearLayoutPlayableDice2.setVisibility(View.GONE);
        linearLayoutUnplayableDice2.setVisibility(View.VISIBLE);
        unplayableDice2.setText(Integer.toString(diceValueView2));
        updateUnplayableDicePicture2(diceValueView1);

      }
      if(diceValueView3 == 1 || diceValueView3 == 5) {
        if(game.playableDice3.isAvailable()) game.option.currentUser.addLapScore(diceValueView3);
        game.playableDice3.setValue(diceValueView3);
        game.playableDice3.setAvailable(false);
        linearLayoutPlayableDice3.setVisibility(View.GONE);
        linearLayoutUnplayableDice3.setVisibility(View.VISIBLE);
        unplayableDice3.setText(Integer.toString(diceValueView3));
        updateUnplayableDicePicture3(diceValueView1);

      }
      if(diceValueView4 == 1 || diceValueView4 == 5) {
        if(game.playableDice4.isAvailable()) game.option.currentUser.addLapScore(diceValueView4);
        game.playableDice4.setValue(diceValueView4);
        game.playableDice4.setAvailable(false);
        linearLayoutPlayableDice4.setVisibility(View.GONE);
        linearLayoutUnplayableDice4.setVisibility(View.VISIBLE);
        unplayableDice4.setText(Integer.toString(diceValueView4));
        updateUnplayableDicePicture4(diceValueView1);

      }
      if(diceValueView5 == 1 || diceValueView5 == 5) {
        if(game.playableDice5.isAvailable()) game.option.currentUser.addLapScore(diceValueView5);
        game.playableDice5.setValue(diceValueView5);
        game.playableDice5.setAvailable(false);
        linearLayoutPlayableDice5.setVisibility(View.GONE);
        linearLayoutUnplayableDice5.setVisibility(View.VISIBLE);
        unplayableDice5.setText(Integer.toString(diceValueView5));
        updateUnplayableDicePicture5(diceValueView1);

      }
    }
  }

  private void makeUnseenUnplayableDice() {
    unplayableDice1PictureDice1.setVisibility(View.GONE);
    unplayableDice1PictureDice2.setVisibility(View.GONE);
    unplayableDice1PictureDice3.setVisibility(View.GONE);
    unplayableDice1PictureDice4.setVisibility(View.GONE);
    unplayableDice1PictureDice5.setVisibility(View.GONE);
    unplayableDice1PictureDice6.setVisibility(View.GONE);


    unplayableDice2PictureDice1.setVisibility(View.GONE);
    unplayableDice2PictureDice2.setVisibility(View.GONE);
    unplayableDice2PictureDice3.setVisibility(View.GONE);
    unplayableDice2PictureDice4.setVisibility(View.GONE);
    unplayableDice2PictureDice5.setVisibility(View.GONE);
    unplayableDice2PictureDice6.setVisibility(View.GONE);

    unplayableDice3PictureDice1.setVisibility(View.GONE);
    unplayableDice3PictureDice2.setVisibility(View.GONE);
    unplayableDice3PictureDice3.setVisibility(View.GONE);
    unplayableDice3PictureDice4.setVisibility(View.GONE);
    unplayableDice3PictureDice5.setVisibility(View.GONE);
    unplayableDice3PictureDice6.setVisibility(View.GONE);

    unplayableDice4PictureDice1.setVisibility(View.GONE);
    unplayableDice4PictureDice2.setVisibility(View.GONE);
    unplayableDice4PictureDice3.setVisibility(View.GONE);
    unplayableDice4PictureDice4.setVisibility(View.GONE);
    unplayableDice4PictureDice5.setVisibility(View.GONE);
    unplayableDice4PictureDice6.setVisibility(View.GONE);


    unplayableDice5PictureDice1.setVisibility(View.GONE);
    unplayableDice5PictureDice2.setVisibility(View.GONE);
    unplayableDice5PictureDice3.setVisibility(View.GONE);
    unplayableDice5PictureDice4.setVisibility(View.GONE);
    unplayableDice5PictureDice5.setVisibility(View.GONE);
    unplayableDice5PictureDice6.setVisibility(View.GONE);

  }

  private boolean thereIsNoTripletOfFiveOrOne() {
    if(gameTriplet()!=null && (gameTriplet().intValue()==1 || gameTriplet() == 5) && gameTripletIsAvailable()){
      return false;
    }else return true;
  }

  private boolean gameTripletIsAvailable() {
    int numberOfDiceTripletAvailable=0;
    if(gameTriplet()!=null && game.playableDice1.isAvailable()
      && game.playableDice1.getValue()==gameTriplet().intValue()){
      numberOfDiceTripletAvailable = numberOfDiceTripletAvailable +1;
    }
    if(gameTriplet()!=null && game.playableDice2.isAvailable()
      && game.playableDice2.getValue()==gameTriplet().intValue()){
      numberOfDiceTripletAvailable = numberOfDiceTripletAvailable +1;
    }
    if(gameTriplet()!=null && game.playableDice3.isAvailable()
      && game.playableDice3.getValue()==gameTriplet().intValue()){
      numberOfDiceTripletAvailable = numberOfDiceTripletAvailable +1;
    }
    if(gameTriplet()!=null && game.playableDice4.isAvailable()
      && game.playableDice4.getValue()==gameTriplet().intValue()){
      numberOfDiceTripletAvailable = numberOfDiceTripletAvailable +1;
    }
    if(gameTriplet()!=null && game.playableDice5.isAvailable()
      && game.playableDice5.getValue()==gameTriplet().intValue()){
      numberOfDiceTripletAvailable = numberOfDiceTripletAvailable +1;
    }
    return numberOfDiceTripletAvailable>=3;
  }

  private void updatePlayableDice() {
    makeUnseenPlayableDice();
    if(game.playableDice1.isAvailable()){
      Random rand1 = new Random();
      int randomNum1 = 1 + rand1.nextInt(6);
      Log.d("playableDice1:",Integer.toString(randomNum1));
      playableDice1.setText(Integer.toString(randomNum1));
      game.playableDice1.setValue(randomNum1);
      updateDicePicture1(randomNum1);
    }
    if(game.playableDice2.isAvailable()){
      Random rand2 = new Random();
      int randomNum2 = 1 + rand2.nextInt(6);
      Log.d("playableDice2:",Integer.toString(randomNum2));
      playableDice2.setText(Integer.toString(randomNum2));
      game.playableDice2.setValue(randomNum2);
      updateDicePicture2(randomNum2);
    }
    if(game.playableDice3.isAvailable()) {
      Random rand3 = new Random();
      int randomNum3 = 1 + rand3.nextInt(6);
      Log.d("playableDice3:",Integer.toString(randomNum3));
      playableDice3.setText(Integer.toString(randomNum3));
      game.playableDice3.setValue(randomNum3);
      updateDicePicture3(randomNum3);

    }
    if(game.playableDice4.isAvailable()) {
      Random rand4 = new Random();
      int randomNum4 = 1 + rand4.nextInt(6);
      Log.d("playableDice4:",Integer.toString(randomNum4));
      playableDice4.setText(Integer.toString(randomNum4));
      game.playableDice4.setValue(randomNum4);
      updateDicePicture4(randomNum4);

    }
    if(game.playableDice5.isAvailable()) {
      Random rand5 = new Random();
      int randomNum5 = 1 +  rand5.nextInt(6);
      Log.d("playableDice5:",Integer.toString(randomNum5));
      playableDice5.setText(Integer.toString(randomNum5));
      game.playableDice5.setValue(randomNum5);
      updateDicePicture5(randomNum5);

    }
  }

  private void makeUnseenPlayableDice() {
    dice1PictureDice1.setVisibility(View.GONE);
    dice1PictureDice2.setVisibility(View.GONE);
    dice1PictureDice3.setVisibility(View.GONE);
    dice1PictureDice4.setVisibility(View.GONE);
    dice1PictureDice5.setVisibility(View.GONE);
    dice1PictureDice6.setVisibility(View.GONE);


    dice2PictureDice1.setVisibility(View.GONE);
    dice2PictureDice2.setVisibility(View.GONE);
    dice2PictureDice3.setVisibility(View.GONE);
    dice2PictureDice4.setVisibility(View.GONE);
    dice2PictureDice5.setVisibility(View.GONE);
    dice2PictureDice6.setVisibility(View.GONE);

    dice3PictureDice1.setVisibility(View.GONE);
    dice3PictureDice2.setVisibility(View.GONE);
    dice3PictureDice3.setVisibility(View.GONE);
    dice3PictureDice4.setVisibility(View.GONE);
    dice3PictureDice5.setVisibility(View.GONE);
    dice3PictureDice6.setVisibility(View.GONE);

    dice4PictureDice1.setVisibility(View.GONE);
    dice4PictureDice2.setVisibility(View.GONE);
    dice4PictureDice3.setVisibility(View.GONE);
    dice4PictureDice4.setVisibility(View.GONE);
    dice4PictureDice5.setVisibility(View.GONE);
    dice4PictureDice6.setVisibility(View.GONE);


    dice5PictureDice1.setVisibility(View.GONE);
    dice5PictureDice2.setVisibility(View.GONE);
    dice5PictureDice3.setVisibility(View.GONE);
    dice5PictureDice4.setVisibility(View.GONE);
    dice5PictureDice5.setVisibility(View.GONE);
    dice5PictureDice6.setVisibility(View.GONE);

  }

  private void updateDicePicture1(int randomNum1) {
    switch(randomNum1){
      case 1:
        dice1PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        dice1PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        dice1PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        dice1PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        dice1PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        dice1PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }
  private void updateDicePicture2(int randomNum1) {
    switch(randomNum1){
      case 1:
        dice2PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        dice2PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        dice2PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        dice2PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        dice2PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        dice2PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }
  private void updateDicePicture3(int randomNum1) {
    switch(randomNum1){
      case 1:
        dice3PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        dice3PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        dice3PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        dice3PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        dice3PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        dice3PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }
  private void updateDicePicture4(int randomNum1) {
    switch(randomNum1){
      case 1:
        dice4PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        dice4PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        dice4PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        dice4PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        dice4PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        dice4PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }
  private void updateDicePicture5(int randomNum1) {
    switch(randomNum1){
      case 1:
        dice5PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        dice5PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        dice5PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        dice5PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        dice5PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        dice5PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }

  private void updateUnplayableDicePicture() {
    makeUnseenUnplayableDice();
    if(!game.playableDice1.isAvailable()){
      updateUnplayableDicePicture1(game.playableDice1.getValue());
    }
    if(!game.playableDice2.isAvailable()){
      updateUnplayableDicePicture2(game.playableDice2.getValue());
    }
    if(!game.playableDice3.isAvailable()){
      updateUnplayableDicePicture3(game.playableDice3.getValue());
    }
    if(!game.playableDice4.isAvailable()){
      updateUnplayableDicePicture4(game.playableDice4.getValue());
    }
    if(!game.playableDice5.isAvailable()){
      updateUnplayableDicePicture5(game.playableDice5.getValue());
    }
  }
  private void updateUnplayableDicePicture1(int randomNum1){
    switch(randomNum1){
      case 1:
        unplayableDice1PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        unplayableDice1PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        unplayableDice1PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        unplayableDice1PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        unplayableDice1PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        unplayableDice1PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }
  private void updateUnplayableDicePicture2(int randomNum1){
    switch(randomNum1){
      case 1:
        unplayableDice2PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        unplayableDice2PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        unplayableDice2PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        unplayableDice2PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        unplayableDice2PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        unplayableDice2PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }

  private void updateUnplayableDicePicture3(int randomNum1){
    switch(randomNum1){
      case 1:
        unplayableDice3PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        unplayableDice3PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        unplayableDice3PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        unplayableDice3PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        unplayableDice3PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        unplayableDice3PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }
  private void updateUnplayableDicePicture4(int randomNum1){
    switch(randomNum1){
      case 1:
        unplayableDice4PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        unplayableDice4PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        unplayableDice4PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        unplayableDice4PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        unplayableDice4PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        unplayableDice4PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }

  private void updateUnplayableDicePicture5(int randomNum1){
    switch(randomNum1){
      case 1:
        unplayableDice5PictureDice1.setVisibility(View.VISIBLE);
        break;
      case 2:
        unplayableDice5PictureDice2.setVisibility(View.VISIBLE);
        break;
      case 3:
        unplayableDice5PictureDice3.setVisibility(View.VISIBLE);
        break;
      case 4:
        unplayableDice5PictureDice4.setVisibility(View.VISIBLE);
        break;
      case 5:
        unplayableDice5PictureDice5.setVisibility(View.VISIBLE);
        break;
      case 6:
        unplayableDice5PictureDice6.setVisibility(View.VISIBLE);
        break;
    }
  }

  private void hideUnplayableDice() {
    linearLayoutUnplayableDice1.setVisibility(View.GONE);
    linearLayoutUnplayableDice2.setVisibility(View.GONE);
    linearLayoutUnplayableDice3.setVisibility(View.GONE);
    linearLayoutUnplayableDice4.setVisibility(View.GONE);
    linearLayoutUnplayableDice5.setVisibility(View.GONE);
  }

  private void showPlayableDice(){
    linearLayoutPlayableDice1.setVisibility(View.VISIBLE);
    linearLayoutPlayableDice2.setVisibility(View.VISIBLE);
    linearLayoutPlayableDice3.setVisibility(View.VISIBLE);
    linearLayoutPlayableDice4.setVisibility(View.VISIBLE);
    linearLayoutPlayableDice5.setVisibility(View.VISIBLE);
  }

  private void createOptionModale(){
    AlertDialog.Builder builder = new AlertDialog.Builder(this);

    builder.setTitle("Option du jeu")
      .setMessage(createOptionMessage())
      .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
          builder.setCancelable(true);
        }
      })
      .create()
      .show();
  }

  private String createOptionMessage(){
      String message="";
      int i = 0;
      for(User user: game.option.userList){
        if(i>0) {
          message = message + "\n" + user.getUsername() + ": " + user.getTotalScore() + " points et "+ user.getZloutch() +" zloutch";
        }
        else{
          message = message + user.getUsername() + ": "+ user.getTotalScore()+" points et "+ user.getZloutch() +" zloutch ";
        }
        i++;
      }
    Log.d("Option player info",message);

    return message;
  }
}
