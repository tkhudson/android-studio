package edu.txstate.sl20.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URI;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends ListActivity {
    ArrayList<Attraction> attractions = new ArrayList<Attraction>();
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        //Find the selected attraction object (bean)
        Attraction selectedAttraction = attractions.get(position);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        Toast.makeText(MainActivity.this, "The cost is: " +
                currency.format(selectedAttraction.getCost()), Toast.LENGTH_LONG).show();

        String url = selectedAttraction.getUrl();
        if (url != null){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        }

        //Homework
        //Use Shared Preference to pass data to the second activity
        //....
        //Switch to the second activity

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //*****
        //setContentView(R.layout.activity_main);

        //We will provide data from a database
        //String[] attractions = {"Art Institute of Chicago", "Magnificent Mile", "Willis Tower"};
        Attraction attraction1 = new Attraction();
        attraction1.setId(101);
        attraction1.setName("Art Institute of Chicago");
        attraction1.setPhone("888-888-8888");
        attraction1.setCost(12.9);
        attractions.add(attraction1);


        Attraction attraction2 = new Attraction();
        attraction2.setId(102);
        attraction2.setName("Magnificent Mile");
        attraction2.setPhone("888-999-8888");
        attraction2.setCost(16.9);
        attractions.add(attraction2);
        attraction2.setUrl("http://themagnificentmile.com");

        Attraction attraction3 = new Attraction();
        attraction3.setId(103);
        attraction3.setName("Navy Pier");
        attraction3.setPhone("777-999-8888");
        attraction3.setCost(9.9);
        attractions.add(attraction3);



        //1. Display attraction names without any images
        //setListAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, attractions));

        //2. Display attraction names using the same image for all the attractions
        //setListAdapter(new ArrayAdapter<String>(MainActivity.this, R.layout.layout_attraction, R.id.txtTravel , attractions));

        //3. Display attraction objects using the same image for all the attractions
        setListAdapter(new ArrayAdapter<Attraction>(MainActivity.this, R.layout.layout_attraction, R.id.txtTravel , attractions));

    }
}