package com.example.mobileproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ClassesActivity extends AppCompatActivity {

    private String[] classes = {"والیبال", "فوتبال", "یوگا"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        ListView listView = findViewById(R.id.listview_classes);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, classes);
        listView.setAdapter(adapter);
    }
}
