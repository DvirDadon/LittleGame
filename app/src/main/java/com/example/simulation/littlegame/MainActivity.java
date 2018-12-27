package com.example.simulation.littlegame;

import android.os.TestLooperManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ImageButton ib;
    EditText et;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        ib=(ImageButton)findViewById(R.id.ib);
        et=(EditText)findViewById(R.id.et);

    }

    public void send(View view) {
        String st=et.getText().toString();
        tv.setText(st);
    }


}
