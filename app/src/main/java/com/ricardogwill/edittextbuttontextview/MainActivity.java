package com.ricardogwill.edittextbuttontextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText enterAWordEditText = (EditText) findViewById(R.id.enter_a_word_editText);
        Button pressToShowTextButton = (Button) findViewById(R.id.press_to_show_text_button);
        final TextView yourWordHereTextView = (TextView) findViewById(R.id.your_word_here_textView);

        pressToShowTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yourWordHereTextView.setText(enterAWordEditText.getText().toString());
            }
        });

    }

}
