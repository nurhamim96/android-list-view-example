package com.tutorial.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView productListView = findViewById(R.id.mobile_list);
        final ArrayList<String> myProducts = new ArrayList<>();
        myProducts.add("Samsung");
        myProducts.add("Lenovo");
        myProducts.add("Asus");
        myProducts.add("Xiomi");
        myProducts.add("Apple");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, myProducts);
        productListView.setAdapter(arrayAdapter);

        productListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "My Product is : " + myProducts.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}