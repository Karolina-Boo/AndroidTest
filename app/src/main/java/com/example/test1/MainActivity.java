package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private Button secondactivity;
    private EditText content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = (EditText)findViewById(R.id.et);
        //secondactivity = (Button)findViewById(R.id.btn);
        /*secondactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,second_activity.class);
                startActivity(intent);
            }
        });*/
    }
    public void btn_click(View view){

        startActivity(new Intent(this, ActivityTwo.class));

        Toast.makeText(this,gettext(),Toast.LENGTH_SHORT).show();
    }
    public String gettext(){
        String text;
        text = content.getText().toString();
        return text;
    }

}
