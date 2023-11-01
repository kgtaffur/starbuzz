package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // get the intent that initialises this activity, then extract the drinkId added as extra value
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);

        // get the specific drink to display details
        Drink drink = Drink.drinks[drinkId];

        // get ImageView -> Photo
        ImageView imageView = (ImageView) findViewById(R.id.photo);
        // populate the drink image and description
        imageView.setImageResource(drink.getImageResourceId());
        imageView.setContentDescription(drink.getName());

        // get TextView -> Name
        TextView nameTextView = (TextView) findViewById(R.id.name);
        // populate the drink name
        nameTextView.setText(drink.getName());

        // get TextView -> Description
        TextView descriptionTextView = (TextView) findViewById(R.id.description);
        // populate the drink description
        descriptionTextView.setText(drink.getDescription());
    }
}