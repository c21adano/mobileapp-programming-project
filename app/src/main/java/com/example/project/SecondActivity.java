package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private Button buttontwo;

    //EditText name;
    SharedPreferences sp;
    String TextThing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //name = findViewById(R.id.TexteditThing);
        button = (Button) findViewById(R.id.buttonTwo);
       // buttontwo = (Button) findViewById(R.id.button);

        sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);



        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // sp = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
               // SharedPreferences.Editor editor = sp.edit();

               // EditText t1;
              //  t1 = findViewById(R.id.TexteditThing);

               // editor.putString("TextEdit", t1.getText().toString());
              //  editor.apply();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity1();
            }
        });



    }




    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
