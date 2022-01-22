package com.example.jaxadev7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        ArrayList<Item> items=new ArrayList<>();

        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));
        items.add(new Item("Shaxzod","O`sha gap", R.drawable.ic_launcher_background));

        recyclerViewAdapter=new RecyclerViewAdapter(items);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}