package com.rance.chatui.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rance.chatui.R;

public class SocreActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socre);

        btn1 = (Button) findViewById(R.id.button1_score);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SocreActivity.this, AnsActivity.class);
                startActivity(intent);

                finish();
            }

        });


        btn2 = (Button) findViewById(R.id.button2_score);

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocreActivity.this, OldActivity.class);
                startActivity(intent);


                finish();
            }

        });


        btn3 = (Button) findViewById(R.id.button3_score);

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SocreActivity.this, "收藏成功", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                finish();
            }

        });

        btn4 = (Button) findViewById(R.id.button4_score);

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocreActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
