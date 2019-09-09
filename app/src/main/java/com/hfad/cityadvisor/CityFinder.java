package com.hfad.cityadvisor;

import java.util.ArrayList;
import java.util.List;

public class CityFinder {

    /* province parameter refers to the value passed from the spinner
    * a generated string list is returned according to the province */
    public List<String> getCitiesByProvince(String province){

        List<String> listCities = new ArrayList<String>();

        if (province.equalsIgnoreCase("western")){
            listCities.add("Colombo");
            listCities.add("Gampaha");
            listCities.add("Kalutara");
        }
        else if (province.equalsIgnoreCase("eastern")){
            listCities.add("Ampara");
            listCities.add("Batticloa");
            listCities.add("Trincomalee");
        }

        return listCities;
    }

}
