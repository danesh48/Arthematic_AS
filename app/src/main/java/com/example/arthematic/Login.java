package com.example.arthematic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText et_mail,et_pass;
    Button bt_sub;
    TextView txt_sign;
    String str_mail,str_pass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //Connect java variable to design id
        et_mail=(EditText)findViewById(R.id.log_edit_mail);
        et_pass=(EditText)findViewById(R.id.log_edit_pass);
        bt_sub=(Button)findViewById(R.id.log_bt_sub);
        txt_sign=(TextView)findViewById(R.id.log_txt_sign);

        bt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_mail=et_mail.getText().toString();
                str_pass=et_pass.getText().toString();

                if(str_mail.isEmpty()){
                    Toast.makeText(Login.this, "Please Enter mobile Number", Toast.LENGTH_SHORT).show();
                    et_mail.setError("Enter mobile number");

                } else if (str_mail.length()<10) {
                    et_mail.setError("Mobile number must be 10 digit");

                } else if (str_pass.isEmpty()) {
                    Toast.makeText(Login.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    et_pass.setError("Enter Password");
                } else{

                    Toast.makeText(Login.this, "Entered my Details are "+str_mail+" "+str_pass, Toast.LENGTH_SHORT).show();
                    et_mail.setText("");
                    et_pass.setText("");
                    Intent i=new Intent(getApplication(), Home.class);
                    startActivity(i);
                    finish();
                }
            }
        });
        txt_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplication(),Signup.class);
                startActivity(i);
                finish();
            }
        });

    }
}
