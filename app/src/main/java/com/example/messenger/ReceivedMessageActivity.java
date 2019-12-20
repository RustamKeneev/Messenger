package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {
    private TextView received_message_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        initAndBuildViews();
    }

    private void initAndBuildViews() {
        received_message_text_view = findViewById(R.id.received_message_text_view);
        getIntentMessage();
    }

    private void getIntentMessage() {
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        received_message_text_view.setText(message);
    }
}
