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

public class MainActivity33 extends AppCompatActivity {
    RadioGroup radioGroup4;
    RadioButton radioButton4;
    Button button4,button42;
    TextView textView41;
    TextView textView42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);

        radioGroup4=findViewById(R.id.radioGroup4);
        button4=findViewById(R.id.button4);
        button42=findViewById(R.id.button42);
        textView41=findViewById(R.id.textView41);
        textView42=findViewById(R.id.textView42);

        Bundle bundle=getIntent().getExtras();
        String str4=bundle.getString("strVar3");
        String var4=bundle.getString("newVar3");
        textView41.setText(var4);
        textView42.setText(str4);



        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int i=radioGroup4.getCheckedRadioButtonId();
                radioButton4=findViewById(i);

                Bundle bundle=getIntent().getExtras();
                String str4=bundle.getString("strVar3");

                String var4=bundle.getString("newVar3");


                Intent intent4=new Intent(getApplicationContext(), MainActivity34.class);

                if (radioButton4.getText().toString().equals("B.import pkg.*")){

                    int n=Integer.parseInt(str4)+1;

                    intent4.putExtra("strVar4",String.valueOf(n));
                    intent4.putExtra("newVar4",var4);
                    Toast.makeText(getApplicationContext(),"RIGHT",Toast.LENGTH_LONG).show();



                }else {


                    intent4.putExtra("strVar4",str4);
                    intent4.putExtra("newVar4",var4);
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_LONG).show();
                }

                startActivity(intent4);



            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quitIntent=new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(quitIntent);
            }
        });



    }
}