package com.example.uts_no_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rvMagazine;
ArrayList<List> listMagazine;
MagazineAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMagazine = findViewById(R.id.rvMagazine);
        listMagazine = new ArrayList<>();

        List list1 = new List();
        list1.tittle = "Halo";
        list1.desc = "author Halo";
        list1.price = 20000;
        list1.image = R.drawable.business;

        List list2 = new List();
        list2.tittle = "Halo";
        list2.desc = "author Halo";
        list2.price = 50000;
        list2.image = R.drawable.sandi;

        for (int i = 0; i<20;i++)
        {
            listMagazine.add(list1);
            listMagazine.add(list2);
        }

        rvMagazine.setLayoutManager(new LinearLayoutManager(this ));
        adapter = new MagazineAdapter(this , listMagazine);
        rvMagazine.setAdapter(adapter);

    }
}