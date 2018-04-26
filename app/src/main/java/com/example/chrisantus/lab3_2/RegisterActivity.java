package com.example.chrisantus.lab3_2;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by chrisantus on 2018. 4. 25..
 */

public class RegisterActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent=getIntent();
        String str_name=intent.getStringExtra("name");
        String str_sex=intent.getStringExtra("sex");
        String str_msg1=intent.getStringExtra("msg1");
        String str_msg2=intent.getStringExtra("msg2");

        TextView tv_name=(TextView)findViewById(R.id.name2);
        TextView tv_gender=(TextView)findViewById(R.id.gender2);
        TextView tv_msg=(TextView)findViewById(R.id.msg);

        tv_name.append(": "+str_name);
        tv_gender.append(": "+str_sex);
        tv_msg.append(": "+str_msg1+" "+str_msg2);

        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
