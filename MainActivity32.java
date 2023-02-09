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

public class MainActivity32 extends AppCompatActivity {
    RadioGroup radioGroup3;
    RadioButton radioButton3;
    Button button3,button32;
    TextView textView31;
    TextView textView32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        radioGroup3=findViewById(R.id.radioGroup3);
        button3=findViewById(R.id.button3);
        button32=findViewById(R.id.button32);
        textView31=findViewById(R.id.textView31);
        textView32=findViewById(R.id.textView32);

        Bundle bundle=getIntent().getExtras();
        String str3=bundle.getString("strVar2");
        String var3=bundle.getString("newVar2");
        textView31.setText(var3);
        textView32.setText(str3);



        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int i=radioGroup3.getCheckedRadioButtonId();
                radioButton3=findViewById(i);

                Bundle bundle=getIntent().getExtras();
                String str3=bundle.getString("strVar2");

                String var3=bundle.getString("newVar2");


                Intent intent3=new Intent(getApplicationContext(), MainActivity33.class);

                if (radioButton3.getText().toString().equals("A.public")){

                    int n=Integer.parseInt(str3)+1;

                    intent3.putExtra("strVar3",String.valueOf(n));
                    intent3.putExtra("newVar3",var3);
                    Toast.makeText(getApplicationContext(),"RIGHT",Toast.LENGTH_LONG).show();



                }else {


                    intent3.putExtra("strVar3",str3);
                    intent3.putExtra("newVar3",var3);
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_LONG).show();
                }

                startActivity(intent3);



            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quitIntent=new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(quitIntent);
            }
        });



    }
}