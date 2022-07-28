package com.example.parecelabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    ListView listView;
    ArrayAdapter adapter;
    List<Person> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");

        String name = person.getName();
        textView = findViewById(R.id.textView);
        listView = findViewById(R.id.list);
        textView.setText(name);
//        adapter = new ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, mList);
//        listView.setAdapter(adapter);

    }
}