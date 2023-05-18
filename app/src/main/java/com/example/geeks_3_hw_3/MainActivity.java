package com.example.geeks_3_hw_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.geeks_3_hw_3.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListNames = new ArrayList<>();

    ContactAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newElements();

        addName();

        recyclerView.setAdapter(adapter);

    }
    public void addName(){
        arrayListNames.add("Madina Akpaeva");
        arrayListNames.add("Omurbek Avalbekov");
        arrayListNames.add("Chyngyz Abdygulov");
        arrayListNames.add("Bahtiyar Dikanaliev");
        arrayListNames.add("Kamaljon Musaev");
        arrayListNames.add("Iskender Kerimbaev");
        arrayListNames.add("Almanbet Abdykulov");
        arrayListNames.add("Yuriy Semenov");
        arrayListNames.add("Radmir Zalilov");
        arrayListNames.add("Eltai Urmatov");
        arrayListNames.add("Almazbek Salkynbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
        arrayListNames.add("Jakshylyk Zamirbek");
    }

    public void newElements(){
        adapter = new ContactAdapter(arrayListNames);
        recyclerView = findViewById(R.id.recyclerView);
    }
}