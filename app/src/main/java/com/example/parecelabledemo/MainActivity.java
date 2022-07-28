package com.example.parecelabledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName = findViewById(R.id.editName);
    }

    public void nextActiivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String name = eName.getText().toString();
        Person person = new Person(name);
        intent.putExtra("person",person);
        startActivity(intent);


    }
}