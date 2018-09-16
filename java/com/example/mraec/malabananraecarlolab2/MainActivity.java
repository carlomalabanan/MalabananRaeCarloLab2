package com.example.mraec.malabananraecarlolab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        button1 = (Button) findViewById(R.id.linear);
        button2 = (Button) findViewById(R.id.constraint);
        button3 = (Button) findViewById(R.id.relative);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinearLayout();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConstraintLayout();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRelativeLayout();
            }
        });

    }

    public void openLinearLayout(){
        Intent intent = new Intent(MainActivity.this, linearLayoutAct.class);
        startActivity(intent);
    }
    public void openConstraintLayout(){
        Intent intent = new Intent(MainActivity.this, constraintLayoutact.class);
        startActivity(intent);
    }
    public void openRelativeLayout(){
        Intent intent = new Intent(MainActivity.this, relativeLayoutAct.class);
        startActivity(intent);
    }
}


