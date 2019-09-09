package com.hfad.cityadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnCities(View view){

        //Get reference to the spinner element in the layout
        Spinner selectedProvince = (Spinner) findViewById(R.id.spinnerSelector);
        //Get reference to the TextView element in the layout
        TextView displayText = (TextView) findViewById(R.id.txtDisplay);
        //Get selected item of the spinner to a string variable.
        String selectedItem = String.valueOf(selectedProvince.getSelectedItem());

        //create an object for the city finder class
        CityFinder cityFinder = new CityFinder();

        //Pass selected item (province) of the spinner to the method in the city finder class and generate a list of cities
        List<String> listCities = cityFinder.getCitiesByProvince(selectedItem);

        //Use a string bulder to format the text (extracted from the above string list)
        StringBuilder formattedText = new StringBuilder();

        for (String city:listCities){
            formattedText.append(city).append("\n"); //format the strings in the list to the string builder variable.
        }

        //Set formatted text in to the TextView
        displayText.setText(formattedText);

    }


}
