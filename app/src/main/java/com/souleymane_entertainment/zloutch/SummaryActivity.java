package com.souleymane_entertainment.zloutch;

import static com.souleymane_entertainment.zloutch.OptionActivity.OPTION_FOR_GAME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.souleymane_entertainment.zloutch.model.Game;
import com.souleymane_entertainment.zloutch.model.Option;

public class SummaryActivity extends AppCompatActivity {
  private TextView summaryTextView;
  private TextView summaryTextViewPlayer1;
  private TextView summaryTextViewPlayer2;
  private TextView summaryTextViewPlayer3;
  private TextView summaryTextViewPlayer4;
  private TextView summaryTextViewPlayer5;
  private TextView summaryTextViewPlayer6;
  private Button returnButton;
  private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        game = new Game();
        Intent intent = getIntent();
        game.option = (Option)intent.getSerializableExtra(OPTION_FOR_GAME);

        summaryTextView = findViewById(R.id.summary_textView_greeting);
        summaryTextViewPlayer1 = findViewById(R.id.summary_textView_player_1);
        summaryTextViewPlayer2 = findViewById(R.id.summary_textView_player_2);
        summaryTextViewPlayer3 = findViewById(R.id.summary_textView_player_3);
        summaryTextViewPlayer4 = findViewById(R.id.summary_textView_player_4);
        summaryTextViewPlayer5 = findViewById(R.id.summary_textView_player_5);
        summaryTextViewPlayer6 = findViewById(R.id.summary_textView_player_6);
        returnButton = findViewById(R.id.summary_button_return);
        updateTextView();

      returnButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent gameActivityIntent = new Intent(SummaryActivity.this, MainActivity.class);
          startActivity(gameActivityIntent);
        }
      });

    }

  private void updateTextView() {
      switch (game.option.getNumberOfPlayer()){
        case 1:
          summaryTextViewPlayer1.setText(game.option.userList.get(0).getUsername() +" a un score de " + game.option.userList.get(0).getTotalScore());
          summaryTextViewPlayer2.setVisibility(View.GONE);
          summaryTextViewPlayer3.setVisibility(View.GONE);
          summaryTextViewPlayer4.setVisibility(View.GONE);
          summaryTextViewPlayer5.setVisibility(View.GONE);
          summaryTextViewPlayer6.setVisibility(View.GONE);
          break;
        case 2:
          summaryTextViewPlayer1.setText(game.option.userList.get(0).getUsername() +" a un score de " + game.option.userList.get(0).getTotalScore());
          summaryTextViewPlayer2.setText(game.option.userList.get(1).getUsername() +" a un score de " + game.option.userList.get(1).getTotalScore());
          summaryTextViewPlayer3.setVisibility(View.GONE);
          summaryTextViewPlayer4.setVisibility(View.GONE);
          summaryTextViewPlayer5.setVisibility(View.GONE);
          summaryTextViewPlayer6.setVisibility(View.GONE);
          break;
        case 3:
          summaryTextViewPlayer1.setText(game.option.userList.get(0).getUsername() +" a un score de " + game.option.userList.get(0).getTotalScore());
          summaryTextViewPlayer2.setText(game.option.userList.get(1).getUsername() +" a un score de " + game.option.userList.get(1).getTotalScore());
          summaryTextViewPlayer3.setText(game.option.userList.get(2).getUsername() +" a un score de " + game.option.userList.get(2).getTotalScore());
          summaryTextViewPlayer4.setVisibility(View.GONE);
          summaryTextViewPlayer5.setVisibility(View.GONE);
          summaryTextViewPlayer6.setVisibility(View.GONE);
          break;
        case 4:
          summaryTextViewPlayer1.setText(game.option.userList.get(0).getUsername() +" a un score de " + game.option.userList.get(0).getTotalScore());
          summaryTextViewPlayer2.setText(game.option.userList.get(1).getUsername() +" a un score de " + game.option.userList.get(1).getTotalScore());
          summaryTextViewPlayer3.setText(game.option.userList.get(2).getUsername() +" a un score de " + game.option.userList.get(2).getTotalScore());
          summaryTextViewPlayer4.setText(game.option.userList.get(3).getUsername() +" a un score de " + game.option.userList.get(3).getTotalScore());
          summaryTextViewPlayer5.setVisibility(View.GONE);
          summaryTextViewPlayer6.setVisibility(View.GONE);
          break;
        case 5:
          summaryTextViewPlayer1.setText(game.option.userList.get(0).getUsername() +" a un score de " + game.option.userList.get(0).getTotalScore());
          summaryTextViewPlayer2.setText(game.option.userList.get(1).getUsername() +" a un score de " + game.option.userList.get(1).getTotalScore());
          summaryTextViewPlayer3.setText(game.option.userList.get(2).getUsername() +" a un score de " + game.option.userList.get(2).getTotalScore());
          summaryTextViewPlayer4.setText(game.option.userList.get(3).getUsername() +" a un score de " + game.option.userList.get(3).getTotalScore());
          summaryTextViewPlayer5.setText(game.option.userList.get(4).getUsername() +" a un score de " + game.option.userList.get(4).getTotalScore());
          summaryTextViewPlayer6.setVisibility(View.GONE);
          break;
        case 6:
          summaryTextViewPlayer1.setText(game.option.userList.get(0).getUsername() +" a un score de " + game.option.userList.get(0).getTotalScore());
          summaryTextViewPlayer2.setText(game.option.userList.get(1).getUsername() +" a un score de " + game.option.userList.get(1).getTotalScore());
          summaryTextViewPlayer3.setText(game.option.userList.get(2).getUsername() +" a un score de " + game.option.userList.get(2).getTotalScore());
          summaryTextViewPlayer4.setText(game.option.userList.get(3).getUsername() +" a un score de " + game.option.userList.get(3).getTotalScore());
          summaryTextViewPlayer5.setText(game.option.userList.get(4).getUsername() +" a un score de " + game.option.userList.get(4).getTotalScore());
          summaryTextViewPlayer6.setText(game.option.userList.get(5).getUsername() +" a un score de " + game.option.userList.get(5).getTotalScore());
          break;
      }

  }
}
