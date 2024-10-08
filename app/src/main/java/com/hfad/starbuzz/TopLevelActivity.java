package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        // create onItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    // intent to launch the other activity
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        // add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.options);
        listView.setOnItemClickListener(itemClickListener);
    }
}