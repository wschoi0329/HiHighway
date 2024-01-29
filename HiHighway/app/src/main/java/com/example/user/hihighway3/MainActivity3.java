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

public class MainActivity3
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Intent intent92= getIntent();

        String[] items1={"덕평자연휴게소", "화성휴게소", "천안휴게소", "여주휴게소", "금강휴게소"};

        ListView listview;
        ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items1);
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter1);

        listview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String items1 = String.valueOf(parent.getItemAtPosition(position));

                        Toast.makeText(MainActivity3.this, items1, Toast.LENGTH_SHORT).show();

                        if (position == 0) {

                            Intent intent51 = new Intent(MainActivity3.this, restclass1.class);

                            startActivity(intent51);

                        }

                        if (position == 1) {

                            Intent intent52 = new Intent(MainActivity3.this, restclass2.class);

                            startActivity(intent52);

                        }

                        if (position == 2) {

                            Intent intent53 = new Intent(MainActivity3.this, restclass3.class);

                            startActivity(intent53);

                        }

                        if (position == 3) {

                            Intent intent54 = new Intent(MainActivity3.this, restclass4.class);

                            startActivity(intent54);

                        }

                        if (position == 4) {

                            Intent intent55 = new Intent(MainActivity3.this, restclass5.class);

                            startActivity(intent55);

                        }




                    }
                }
        );
    }
}

