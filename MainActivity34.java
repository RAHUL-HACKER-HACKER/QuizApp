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

public class MainActivity34 extends AppCompatActivity {
    RadioGroup radioGroup5;
    RadioButton radioButton5;
    Button button5,button52;
    TextView textView51;
    TextView textView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34);

        radioGroup5=findViewById(R.id.radioGroup5);
        button5=findViewById(R.id.button5);
        button52=findViewById(R.id.button52);
        textView51=findViewById(R.id.textView51);
        textView52=findViewById(R.id.textView52);

        Bundle bundle=getIntent().getExtras();
        String str5=bundle.getString("strVar4");
        String var5=bundle.getString("newVar4");
        textView51.setText(var5);
        textView52.setText(str5);



        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int i=radioGroup5.getCheckedRadioButtonId();
                radioButton5=findViewById(i);

                Bundle bundle=getIntent().getExtras();
                String str5=bundle.getString("strVar4");

                String var5=bundle.getString("newVar4");






                Intent intent5=new Intent(getApplicationContext(), MainActivity13.class);

                if (radioButton5.getText().toString().equals("D.None of the mentioned")){

                    int n=Integer.parseInt(str5)+1;

                    intent5.putExtra("strVar5",String.valueOf(n));
                    intent5.putExtra("newVar5",var5);
                    Toast.makeText(getApplicationContext(),"RIGHT",Toast.LENGTH_LONG).show();



                }else {


                    intent5.putExtra("strVar5",str5);
                    intent5.putExtra("newVar5",var5);
                    Toast.makeText(getApplicationContext(),"WRONG",Toast.LENGTH_LONG).show();
                }

                startActivity(intent5);



            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quitIntent=new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(quitIntent);
            }
        });



    }
}