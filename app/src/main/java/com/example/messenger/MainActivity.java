package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edit_text_message;
    private Button send_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAndBuildViews();
    }

    private void initAndBuildViews() {
        edit_text_message = findViewById(R.id.edit_text_message);
        send_button = findViewById(R.id.send_button);
    }

    public void sendMessage(View view) {
        String message = edit_text_message.getText().toString().trim();

        // начало неявного интента
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        Intent chooseIntent;
        chooseIntent = Intent.createChooser(intent,getString(R.string.chooser_title));
        startActivity(chooseIntent);
        // конец неявного интента

        // начало явного интента
//        Intent intent = new Intent(this,ReceivedMessageActivity.class);
//        intent.putExtra("message",message);
//        startActivity(intent);
        // конец неявного интента
    }
}
