package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Addition extends AppCompatActivity {

    EditText ed1,ed2;
    Button add,sub,mul,div,zero;
    TextView frst,scnd,ans;
     int ans1,num1,num2;
     double n1,n2,ans2;


//Addition
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        ans = (TextView) findViewById(R.id.ans);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        zero = (Button) findViewById(R.id.zero);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((ed1.getText().length() == 0) && (ed2.getText().length() == 0)) {

                    Toast t = Toast.makeText(getApplicationContext(), "There is no value availaible", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else if((ed1.getText().length()!=0) && (ed2.getText().length()
                        ==0))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "One value is Missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else if((ed1.getText().length()==0) && (ed2.getText().length()
                        !=0))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "One value is Missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else {
                    String m1 = ed1.getText().toString().trim();
                    String m2 = ed2.getText().toString().trim();
                    num1 = Integer.parseInt(m1);
                    num2 = Integer.parseInt(m2);
                    ans1 = num1 + num2;
                    ans.setText(String.valueOf(ans1));
                }

            }
        });

     //Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((ed1.getText().length() == 0) && (ed2.getText().length() == 0)) {

                    Toast t=Toast.makeText(getApplicationContext(),"There is no value in string",Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                }

                else if ((ed1.getText().length()!=0) && (ed2.getText().length()==0))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "One value is Missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else if ((ed1.getText().length()==0) && (ed2.getText().length()!=0))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "One value is Missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }

                else {

                    String m1 = ed1.getText().toString().trim();
                    String m2 = ed2.getText().toString().trim();
                    num1 = Integer.parseInt(m1);
                    num2 = Integer.parseInt(m2);
                    ans1 = num1 - num2;
                    ans.setText(String.valueOf(ans1));
                }
            }
        });

        //Multiplication

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((ed1.getText().length()==0)&&(ed2.getText().length()==0))
                {

                    Toast t=Toast.makeText(getApplicationContext(),"There is no value",Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
                    t.show();

                }

                    else if ((ed1.getText().length() != 0) && (ed2.getText().length() == 0)) {
                    Toast t = Toast.makeText(getApplicationContext(), "One value is Missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();

                }
                else if ((ed1.getText().length() == 0) && (ed2.getText().length() != 0)) {
                    Toast t = Toast.makeText(getApplicationContext(), "One value is Missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else {
                    String m1 = ed1.getText().toString().trim();

                    String m2 = ed2.getText().toString().trim();
                    num1 = Integer.parseInt(m1);
                    num2 = Integer.parseInt(m2);
                    ans1 = num1 * num2;

                    ans.setText(String.valueOf(ans1));
                }
            }
        });

    // Dividation
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((ed1.getText().length()==0) && (ed2.getText().length()==0))
                {

                    Toast t = Toast.makeText(getApplicationContext(), "There is no value ", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else if((ed1.getText().length()!=0) && (ed2.getText().length()==0))
                {

                    Toast t = Toast.makeText(getApplicationContext(), "One value is missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else if ((ed1.getText().length()==0) && (ed2.getText().length()!=0))
                {

                    Toast t = Toast.makeText(getApplicationContext(), "One value is missing", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                }
                else {
                    String m1 = ed1.getText().toString().trim();
                    String m2 = ed2.getText().toString().trim();
                    n1 = Double.parseDouble(m1);
                    n2 = Double.parseDouble(m2);

                    ans2 = n1 / n2;
                    ans.setText(String.valueOf(ans2));
                }

            }


        });
        //for zero
        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((ed1.getText().length() == 0) && (ed2.getText().length() == 0)) {
                    Toast t = Toast.makeText(getApplicationContext(), "There is no value", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0, 0);
                    t.show();
                } else {
                    ans2=0;
                    ans.setText(String.valueOf(ans2));
                    Toast t=Toast.makeText(getApplicationContext(),"Clear to 0",Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                    t.show();
                }
            }
            });

    }}