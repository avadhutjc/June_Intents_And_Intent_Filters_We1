package com.masai.a530june_intents_and_intent_filters_we1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mTvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTvUserName = findViewById(R.id.tvUserName);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        mTvUserName.setText(userName);
    }
}