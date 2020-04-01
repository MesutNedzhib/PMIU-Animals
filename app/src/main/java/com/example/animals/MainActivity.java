package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Animal> animalArrayList = AnimalSource.generateItemsList();

        AnimalAdapter animalAdapter = new AnimalAdapter(this,animalArrayList);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(animalAdapter);

    }
}
