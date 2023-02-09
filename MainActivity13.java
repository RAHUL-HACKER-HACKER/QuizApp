package com.example.unitconverter;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
    TextView value1,value2,value3,value4;
    Button restartButton;
    int n,m;
    double p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        value1=findViewById(R.id.value1);
        value2=findViewById(R.id.value2);
        value3=findViewById(R.id.value3);
        value4=findViewById(R.id.value4);
        restartButton=findViewById(R.id.restartButton);



        Bundle bundle=getIntent().getExtras();
        String endStr=bundle.getString("strVar5");
        //right ans
        n=Integer.parseInt(endStr);
        //wrong ans
        m=5-n;
        //percentage
        p=(n*100)/5;




        value1.setText("Right Answer : "+String.valueOf(n));
        value2.setText("Wrong Answer : "+String.valueOf(m));
        value3.setText("Percentage : "+(String.valueOf(p))+"%");
        value4.setText("Final Value : "+String.valueOf(n));



        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restartIntent=new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(restartIntent);

            }
        });




    }
}