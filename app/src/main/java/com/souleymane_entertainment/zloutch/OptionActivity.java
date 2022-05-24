package com.souleymane_entertainment.zloutch;

import static com.souleymane_entertainment.zloutch.MainActivity.OPTION_NUMBER_OF_PLAYER;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.souleymane_entertainment.zloutch.model.Option;
import com.souleymane_entertainment.zloutch.model.User;

import java.util.ArrayList;

public class OptionActivity extends AppCompatActivity {


  public static final String OPTION_FOR_GAME = "OPTION_FOR_GAME";
  private Option option;
    private TextView optionTextView;
    private EditText name_player_1;
    private EditText name_player_2;
    private EditText name_player_3;
    private EditText name_player_4;
    private EditText name_player_5;
    private EditText name_player_6;
    private LinearLayout parentLayout;
    private Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

      optionTextView = findViewById(R.id.option_textview_greeting);
      name_player_1 = findViewById(R.id.option_edittext_name_player_1);
      name_player_2 = findViewById(R.id.option_edittext_name_player_2);
      name_player_3 = findViewById(R.id.option_edittext_name_player_3);
      name_player_4 = findViewById(R.id.option_edittext_name_player_4);
      name_player_5 = findViewById(R.id.option_edittext_name_player_5);
      name_player_6 = findViewById(R.id.option_edittext_name_player_6);
      parentLayout = findViewById(R.id.option_parent_layout);
      playButton = findViewById(R.id.option_button_play);
      Intent intent = getIntent();
      int numberOfPlayer = intent.getIntExtra(OPTION_NUMBER_OF_PLAYER,1);
      updateNumberOfUser(numberOfPlayer);




      playButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          boolean canChangeActivity = canChangeActivity(numberOfPlayer);
          if(canChangeActivity){
            Intent gameActivityIntent = new Intent(OptionActivity.this, GameActivity.class);
            Option option = setOption(numberOfPlayer);
            gameActivityIntent.putExtra(OPTION_FOR_GAME,option);
            startActivity(gameActivityIntent);
          }
          else{
            makeFillFieldToast();
          }
        }
      });
    }

  private void makeFillFieldToast() {
    Toast.makeText(this,"Remplissez tous les champs!",Toast.LENGTH_SHORT).show();
  }

  private Option setOption(int numberOfPlayer) {
      Option option = new Option();
      option.setNumberOfPlayer(numberOfPlayer);
      option.userList = new ArrayList<>();
      switch (numberOfPlayer){
        case 1:
          User user = new User();
          user.setUsername(name_player_1.getText().toString());
          user.setTurnScore(0);
          user.setTotalScore(0);
          option.userList.add(user);
          break;
        case 2:
          User user2 = new User();
          user2.setUsername(name_player_1.getText().toString());
          user2.setTurnScore(0);
          user2.setTotalScore(0);
          option.userList.add(user2);

          User user3 = new User();
          user3.setUsername(name_player_2.getText().toString());
          user3.setTurnScore(0);
          user3.setTotalScore(0);
          option.userList.add(user3);
          break;

        case 3:
          User user4 = new User();
          user4.setUsername(name_player_1.getText().toString());
          user4.setTurnScore(0);
          user4.setTotalScore(0);
          option.userList.add(user4);
          User user5 = new User();
          user5.setUsername(name_player_2.getText().toString());
          user5.setTurnScore(0);
          user5.setTotalScore(0);
          option.userList.add(user5);
          User user6 = new User();
          user6.setUsername(name_player_3.getText().toString());
          user6.setTurnScore(0);
          user6.setTotalScore(0);
          option.userList.add(user6);
          break;

        case 4:
          User user7 = new User();
          user7.setUsername(name_player_1.getText().toString());
          user7.setTurnScore(0);
          user7.setTotalScore(0);
          option.userList.add(user7);
          User user8 = new User();
          user8.setUsername(name_player_2.getText().toString());
          user8.setTurnScore(0);
          user8.setTotalScore(0);
          option.userList.add(user8);
          User user9 = new User();
          user9.setUsername(name_player_3.getText().toString());
          user9.setTurnScore(0);
          user9.setTotalScore(0);
          option.userList.add(user9);
          User user10 = new User();
          user10.setUsername(name_player_4.getText().toString());
          user10.setTurnScore(0);
          user10.setTotalScore(0);
          option.userList.add(user10);
          break;

        case 5:
          User user11 = new User();
          user11.setUsername(name_player_1.getText().toString());
          user11.setTurnScore(0);
          user11.setTotalScore(0);
          option.userList.add(user11);
          User user12 = new User();
          user12.setUsername(name_player_2.getText().toString());
          user12.setTurnScore(0);
          user12.setTotalScore(0);
          option.userList.add(user12);
          User user13 = new User();
          user13.setUsername(name_player_3.getText().toString());
          user13.setTurnScore(0);
          user13.setTotalScore(0);
          option.userList.add(user13);
          User user14 = new User();
          user14.setUsername(name_player_4.getText().toString());
          user14.setTurnScore(0);
          user14.setTotalScore(0);
          option.userList.add(user14);
          User user15 = new User();
          user15.setUsername(name_player_5.getText().toString());
          user15.setTurnScore(0);
          user15.setTotalScore(0);
          option.userList.add(user15);
          break;

        case 6:
          User user16 = new User();
          user16.setUsername(name_player_1.getText().toString());
          user16.setTurnScore(0);
          user16.setTotalScore(0);
          option.userList.add(user16);
          User user17 = new User();
          user17.setUsername(name_player_2.getText().toString());
          user17.setTurnScore(0);
          user17.setTotalScore(0);
          option.userList.add(user17);
          User user18 = new User();
          user18.setUsername(name_player_3.getText().toString());
          user18.setTurnScore(0);
          user18.setTotalScore(0);
          option.userList.add(user18);
          User user19 = new User();
          user19.setUsername(name_player_4.getText().toString());
          user19.setTurnScore(0);
          user19.setTotalScore(0);
          option.userList.add(user19);
          User user20 = new User();
          user20.setUsername(name_player_5.getText().toString());
          user20.setTurnScore(0);
          user20.setTotalScore(0);
          option.userList.add(user20);
          User user21 = new User();
          user21.setUsername(name_player_6.getText().toString());
          user21.setTurnScore(0);
          user21.setTotalScore(0);
          option.userList.add(user21);
          break;

      }
      return option;
  }

  private boolean canChangeActivity(int numberOfPlayer) {
     switch (numberOfPlayer){
       case 1:
         return name_player_1.getText()!=null && name_player_1.getText().toString()!=null
           && !name_player_1.getText().toString().isEmpty();
       case 2:
         return (name_player_1.getText()!=null && name_player_1.getText().toString()!=null
           && !name_player_1.getText().toString().isEmpty())
       && (name_player_2.getText()!=null && name_player_2.getText().toString()!=null
         && !name_player_2.getText().toString().isEmpty());
       case 3:
         return (name_player_1.getText()!=null && name_player_1.getText().toString()!=null
           && !name_player_1.getText().toString().isEmpty())
       && (name_player_2.getText()!=null && name_player_2.getText().toString()!=null
         && !name_player_2.getText().toString().isEmpty())
       && (name_player_3.getText()!=null && name_player_3.getText().toString()!=null
         && !name_player_3.getText().toString().isEmpty());
       case 4:
         return (name_player_1.getText()!=null && name_player_1.getText().toString()!=null
           && !name_player_1.getText().toString().isEmpty())
       && (name_player_2.getText()!=null && name_player_2.getText().toString()!=null
         && !name_player_2.getText().toString().isEmpty())
       && (name_player_3.getText()!=null && name_player_3.getText().toString()!=null
         && !name_player_3.getText().toString().isEmpty())
       && (name_player_4.getText()!=null && name_player_4.getText().toString()!=null
         && !name_player_4.getText().toString().isEmpty());
       case 5:
         return (name_player_1.getText()!=null && name_player_1.getText().toString()!=null
           && !name_player_1.getText().toString().isEmpty())
       && (name_player_2.getText()!=null && name_player_2.getText().toString()!=null
         && !name_player_2.getText().toString().isEmpty())
       && ( name_player_3.getText()!=null && name_player_3.getText().toString()!=null
         && !name_player_3.getText().toString().isEmpty())
       && (name_player_4.getText()!=null && name_player_4.getText().toString()!=null
         && !name_player_4.getText().toString().isEmpty())
       && (name_player_5.getText()!=null && name_player_5.getText().toString()!=null
         && !name_player_5.getText().toString().isEmpty());
       case 6:
         return (name_player_1.getText()!=null && name_player_1.getText().toString()!=null
           && !name_player_1.getText().toString().isEmpty())
           && (name_player_2.getText()!=null && name_player_2.getText().toString()!=null
           && !name_player_2.getText().toString().isEmpty())
           && ( name_player_3.getText()!=null && name_player_3.getText().toString()!=null
           && !name_player_3.getText().toString().isEmpty())
           && (name_player_4.getText()!=null && name_player_4.getText().toString()!=null
           && !name_player_4.getText().toString().isEmpty())
           && (name_player_5.getText()!=null && name_player_5.getText().toString()!=null
           && !name_player_5.getText().toString().isEmpty())
           && (name_player_6.getText()!=null && name_player_6.getText().toString()!=null
           && !name_player_6.getText().toString().isEmpty());
     }
    return false;
  }

  private void updateNumberOfUser(int numberOfPlayer) {
      switch(numberOfPlayer){
        case 1:
          parentLayout.removeView(name_player_2);
          parentLayout.removeView(name_player_3);
          parentLayout.removeView(name_player_4);
          parentLayout.removeView(name_player_5);
          parentLayout.removeView(name_player_6);
          break;
        case 2:
          parentLayout.removeView(name_player_3);
          parentLayout.removeView(name_player_4);
          parentLayout.removeView(name_player_5);
          parentLayout.removeView(name_player_6);
          break;
        case 3:
          parentLayout.removeView(name_player_4);
          parentLayout.removeView(name_player_5);
          parentLayout.removeView(name_player_6);
          break;
        case 4:
          parentLayout.removeView(name_player_5);
          parentLayout.removeView(name_player_6);
          break;
        case 5:
          parentLayout.removeView(name_player_6);
          break;
        case 6:
          break;
      }
  }
}
