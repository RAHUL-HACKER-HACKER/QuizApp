package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    RadioGroup radioGroup1;
    RadioButton radioButton1;
    Button button1,button12;
    TextView textView11;
    TextView textView12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        radioGroup1=findViewById(R.id.radioGroup1);
        button1=findViewById(R.id.button1);
        button12=findViewById(R.id.button12);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);

        Bundle bundle=getIntent().getExtras();
        String var1=bundle.getString("newVar");
        textView11.setText(var1);
        textView12.setText("0");


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=radioGroup1.getCheckedRadioButtonId();
                radioButton1=findViewById(i);

                Bundle bundle=getIntent().getExtras();
                String var1=bundle.getString("newVar");


                Intent intent1=new Intent(getApplicationContext(),MainActivity12.class);


                //intent.putExtra("radioVar",radioButton.getText().toString());
                //intent.putExtra("Variable","Value");

                if (radioButton1.getText().toString().equals("B.main method")){

                    intent1.putExtra("strVar1","1");
                    intent1.putExtra("newVar1",var1);
                    Toast.makeText(getApplicationContext(),"RIGHT",Toast.LENGTH_LONG).show();


                }else {

                    intent1.putExtra("strVar1","0");
                    intent1.putExtra("newVar1",var1);
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_LONG).show();


                }

                startActivity(intent1);



            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quitIntent=new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(quitIntent);            }
        });



    }
}