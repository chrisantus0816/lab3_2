package com.example.chrisantus.lab3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.content.Intent;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button register;
    RadioGroup group;
    RadioButton man, woman;
    CheckBox sms, email;
    EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = (RadioGroup) findViewById(R.id.radiogroup_gender);
        register = (Button) findViewById(R.id.register);
        name = (EditText) findViewById(R.id.name_edit);
        man = (RadioButton) findViewById(R.id.man);
        woman = (RadioButton) findViewById(R.id.woman);
        sms = (CheckBox) findViewById(R.id.SMS);
        email = (CheckBox) findViewById(R.id.email);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_name = name.getText().toString();
                String str_sex = "";
                if (group.getCheckedRadioButtonId() == R.id.man) {
                    str_sex = man.getText().toString();
                }
                if (group.getCheckedRadioButtonId() == R.id.woman) {
                    str_sex = woman.getText().toString();
                }
                String str_msg1 = "";
                if (sms.isChecked()) {
                    str_msg1 = (String) sms.getText();
                }
                String str_msg2 = "";
                if (email.isChecked()) {
                    str_msg2 = (String) email.getText();
                }

                Intent intent = new Intent(getApplicationContext(),
                        RegisterActivity.class);
                intent.putExtra("name", str_name);
                intent.putExtra("sex", str_sex);
                intent.putExtra("msg1", str_msg1);
                intent.putExtra("msg2", str_msg2);

                startActivity(intent);
                finish();

            }
        });

    }
}
