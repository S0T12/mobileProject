package com.example.mobileproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class TeachersActivity extends AppCompatActivity {

    private String[] teachers = {"John Doe", "Jane Smith", "Jim Brown"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        ListView listView = findViewById(R.id.listview_teachers);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, teachers);
        listView.setAdapter(adapter);
    }
}
