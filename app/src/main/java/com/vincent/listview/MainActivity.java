package com.vincent.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    Person p4 = new Person();


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView)findViewById(R.id.listviewTest);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Alexander");
        arrayList.add("Vincent");
        arrayList.add("Viktor");
        arrayList.add("Ismail");
        arrayList.add("Melissa");
        arrayList.add("Felicia");
        arrayList.add("Jonathan");
        arrayList.add("Wirawong");
        arrayList.add("Werawan");
        arrayList.add("Koffe");
        arrayList.add("Danne");
        arrayList.add("Lars");
        arrayList.add("Kanya");
        arrayList.add("Yah");
        arrayList.add("Dong");
        arrayList.add("Violett");
        arrayList.add("Eric");
        arrayList.add("Casy");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"clicked name: "+i+" "+arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });


        Button button = (Button)(findViewById(R.id.button));
        button.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            arrayAdapter.add("Hej");


        }
    });


    }
}