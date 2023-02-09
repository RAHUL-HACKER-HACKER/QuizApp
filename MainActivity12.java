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

public class MainActivity12 extends AppCompatActivity {
    RadioGroup radioGroup2;
    RadioButton radioButton2;
    Button button2,button22;
    TextView textView21;
    TextView textView22;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        radioGroup2=findViewById(R.id.radioGroup2);
        button2=findViewById(R.id.button2);
        button22=findViewById(R.id.button22);
        textView21=findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);

        Bundle bundle=getIntent().getExtras();
        String str2=bundle.getString("strVar1");
        String var2=bundle.getString("newVar1");
        textView21.setText(var2);
        textView22.setText(str2);



        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int i=radioGroup2.getCheckedRadioButtonId();
                radioButton2=findViewById(i);

                Bundle bundle=getIntent().getExtras();
                String str2=bundle.getString("strVar1");

                String var2=bundle.getString("newVar1");


                Intent intent2=new Intent(getApplicationContext(), MainActivity32.class);

                if (radioButton2.getText().toString().equals("B.This")){

                    int n=Integer.parseInt(str2)+1;

                    intent2.putExtra("strVar2",String.valueOf(n));
                    intent2.putExtra("newVar2",var2);
                    Toast.makeText(getApplicationContext(),"RIGHT",Toast.LENGTH_LONG).show();



                }else {


                    intent2.putExtra("strVar2",str2);
                    intent2.putExtra("newVar2",var2);
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_LONG).show();
                }

                startActivity(intent2);



            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quitIntent=new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(quitIntent);
            }
        });



    }
}