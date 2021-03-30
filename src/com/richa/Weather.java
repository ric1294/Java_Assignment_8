package com.richa;

import java.util.ArrayList;
import java.util.Arrays;

public class Weather {
    ArrayList<Double> winds = new ArrayList<>(Arrays.asList(0.65,0.37,0.94,0.67,0.83,0.40,0.47));
    ArrayList<String> days = new ArrayList<>(Arrays.asList("sunday","monday","tuesday","wednesday","thursday","friday","saturday"));

    //Calculate Feels Like Temprature
    public double calculateFeelsLike(double temperature,String day)
    {

        Double feel_temperature = 0.00;  //Wrapper Class
        Integer pos = days.indexOf(day); //String Method
        Double wind= winds.get(pos.intValue()); //Wrapper Class
        feel_temperature = wind.doubleValue()* temperature; //Wrapper Class
        return feel_temperature.doubleValue(); //Wrapper Class
    }


}
