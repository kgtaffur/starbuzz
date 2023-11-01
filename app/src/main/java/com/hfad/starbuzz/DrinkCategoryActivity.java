package com.hfad.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        // Array adapter to put the data in the list view
        // Drink.drinks is an array
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Drink.drinks);

        // get list view
        ListView listView = (ListView) findViewById(R.id.list_drinks);

        // set the adapter to the list view
        listView.setAdapter(listAdapter);

        // create list view listener
        // listener to listen for clicks
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            // this one is for clicks on an specific item
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // create the intent from DrinkCategoryActivity to DrinkActivity
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                // put the id the user clicks
                intent.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                // start the activity using the intent
                startActivity(intent);
            }
        };
        // assign the listener to the list view
        listView.setOnItemClickListener(itemClickListener);
    }
}