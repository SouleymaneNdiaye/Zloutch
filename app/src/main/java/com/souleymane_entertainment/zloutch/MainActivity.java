package com.souleymane_entertainment.zloutch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.souleymane_entertainment.zloutch.model.Option;

public class MainActivity extends AppCompatActivity {

  public static final String OPTION_NUMBER_OF_PLAYER = "OPTION_NUMBER_OF_PLAYER";
  private TextView greetingTextView;
    private EditText number_of_player_edit_text;
    private Button playButton;
    private Option option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTextView = findViewById(R.id.main_textview_greeting);
        number_of_player_edit_text = findViewById(R.id.main_edittext_number_of_player);
        playButton = findViewById(R.id.main_button_play);

        playButton.setEnabled(false);

      number_of_player_edit_text.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
          // This is where we'll check the user input
          try{
            int number_of_player = Integer.parseInt(s.toString());
            playButton.setEnabled(!s.toString().isEmpty() && number_of_player>0 && number_of_player<=6);
          }catch (NumberFormatException numberFormatException){
            playButton.setEnabled(false);
          }
        }

      });
      playButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent optionActivityIntent = new Intent(MainActivity.this, OptionActivity.class);
          Option option = new Option();
          option.setNumberOfPlayer(Integer.parseInt(number_of_player_edit_text.getText().toString()));
          Log.d("number of player",Integer.toString(Integer.parseInt(number_of_player_edit_text.getText().toString())));
          optionActivityIntent.putExtra(OPTION_NUMBER_OF_PLAYER,option.getNumberOfPlayer());
          startActivity(optionActivityIntent);
        }
      });
    }
}
