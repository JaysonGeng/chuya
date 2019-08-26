package com.rance.chatui.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rance.chatui.R;

public class MenuActivity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this, Menu2Activity.class);
                startActivity(intent);

                finish();
            }

        });
    }
}
