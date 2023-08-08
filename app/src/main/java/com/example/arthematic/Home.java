package com.example.arthematic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    EditText et_num1,et_num2;
    Button bt_add,bt_sub,bt_mult,bt_div;
    String num1,num2,res;
    TextView txt_result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        //Connect java variable to design id
        et_num1=(EditText)findViewById(R.id.home_edit_first);
        et_num2=(EditText)findViewById(R.id.home_edit_sec);
        bt_add=(Button) findViewById(R.id.home_edit_bt_add);
        bt_sub=(Button)findViewById(R.id.home_edit_bt_sub);
        bt_mult=(Button) findViewById(R.id.home_edit_bt_mult);
        bt_div=(Button) findViewById(R.id.home_edit_bt_div);
        txt_result=(TextView)findViewById(R.id.home_txt_result_sum);





        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et_num1.getText().toString();
                num2 = et_num2.getText().toString();
                if (num1.isEmpty()) {
                    et_num1.setError("Enter the Number");
                } else if (num2.isEmpty()) {
                    et_num2.setError("Enter the number");
                } else {
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);

                    float num = n1 + n2;
                    res = "The Addition is: " + num;
                    txt_result.setText(res);
                    Toast.makeText(Home.this, "Addition of number is " + num, Toast.LENGTH_SHORT).show();

                }

            }
        });

        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et_num1.getText().toString();
                num2 = et_num2.getText().toString();
                if (num1.isEmpty()) {
                    et_num1.setError("Enter the Number");
                } else if (num2.isEmpty()) {
                    et_num2.setError("Enter the number");
                } else {
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);

                    float num = n1 - n2;

                    res = "The Subtraction is: " + num;
                    txt_result.setText(res);
                    Toast.makeText(Home.this, "Subtraction of number is " + num, Toast.LENGTH_SHORT).show();

                }

            }
        });

        bt_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et_num1.getText().toString();
                num2 = et_num2.getText().toString();
                if (num1.isEmpty()) {
                    et_num1.setError("Enter the Number");
                } else if (num2.isEmpty()) {
                    et_num2.setError("Enter the number");
                } else {
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);

                    float num = n1 * n2;

                    res = "The Multiplication is: " + num;
                    txt_result.setText(res);
                    Toast.makeText(Home.this, "Multiplication of number is " + num, Toast.LENGTH_SHORT).show();

                }
            }
        });

        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et_num1.getText().toString();
                num2 = et_num2.getText().toString();
                if (num1.isEmpty()) {
                    et_num1.setError("Enter the Number");
                } else if (num2.isEmpty()) {
                    et_num2.setError("Enter the number");
                } else {
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);

                    float num = n1 / n2;

                    res = "The Division is: " + num;
                    txt_result.setText(res);
                    Toast.makeText(Home.this, "Division of numbers is " + num, Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
