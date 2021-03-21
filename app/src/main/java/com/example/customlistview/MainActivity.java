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
            add("Piñata de Mickey");
            add("Piñata de Pepa");
            add("Piñata de Ben 10");
            add("Piñata de Tik Tok");
        }};

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, R.layout.list_view_item, listProducts);
        listViewItems.setAdapter(itemsAdapter);
    }


}

