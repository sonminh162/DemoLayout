package com.lifetime.title;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView listViewItem;
    ArrayList<Item> mangItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        listViewItem = findViewById(R.id.recycler_view);
        mangItem = new ArrayList<Item>();

        mangItem.add(new Item("Demo Fragment","Fragment activity"));
        mangItem.add(new Item("Item 2","description item 2"));
        mangItem.add(new Item("Item 3","description item 3"));
        mangItem.add(new Item("Item 4","description item 4"));
        mangItem.add(new Item("Item 5","description item 5"));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        listViewItem.setLayoutManager(layoutManager);
        ItemAdapter adapter = new ItemAdapter(mangItem,MainActivity.this);
        listViewItem.setAdapter(adapter);
    }
}
