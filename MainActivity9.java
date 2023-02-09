package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {
    Button button,aboutButton;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        aboutButton=findViewById(R.id.aboutButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.length()==0){

                    editText.setError("Enter name");
                    Toast.makeText(getApplicationContext(),"First Enter Your Name to Start a Quiz",Toast.LENGTH_LONG).show();

                }else {

                    Intent intent=new Intent(MainActivity9.this,MainActivity10.class);
                    String editValue=editText.getText().toString();
                    intent.putExtra("newVar","Hello "+editValue);
                    Toast.makeText(getApplicationContext(),"Submitted Successfully",Toast.LENGTH_LONG).show();

                    startActivity(intent);

                }


            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent=new Intent(getApplicationContext(), MainActivity35.class);
                startActivity(aboutIntent);
            }
        });
    }
}