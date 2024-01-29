package com.example.user.hihighway3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                Intent intent91 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent91);

            }

        };
        Button btnLogin = (Button) findViewById(R.id.button1);
        btnLogin.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                Intent intent92 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent92);

            }

        };
        Button btnLogin1 = (Button) findViewById(R.id.button2);
        btnLogin1.setOnClickListener(listener1);
    }

}
