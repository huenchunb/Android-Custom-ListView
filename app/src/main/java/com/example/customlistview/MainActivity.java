package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listProducts;
    ListView listViewItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewItems = findViewById(R.id.listViewItems);

        listProducts = new ArrayList<String>() {{
            add("Item #1");
            add("Item #2");
            add("Item #3");
            add("Item #4");
            add("Item #5");
            add("Item #6");
            add("Item #7");
            add("Item #8");
            add("Item #9");
            add("Item #10");
        }};

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, listProducts);
        listViewItems.setAdapter(itemsAdapter);
    }


}

