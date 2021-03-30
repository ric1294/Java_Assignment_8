package com.richa;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Assignment8 {
    public static void main(String[] args) {
        JTextField temperature = new JTextField(5);
        JTextField day = new JTextField(5);
        Object[] message = {
                "Enter day of week: ", day,
                "Enter temperature: ", temperature,
        };

        JOptionPane.showMessageDialog(null,"Welcome to the system!!! ");

        JOptionPane.showMessageDialog(null,message,"Feels like temperature calculating system:",JOptionPane.PLAIN_MESSAGE);
        float temp_day = Float.parseFloat(temperature.getText());
        String name_day = day.getText().toLowerCase(); //String Method

        Weather obj = new Weather();
        if(obj.days.contains(name_day))   // String Method
        {
            double feel_temperature = obj.calculateFeelsLike(temp_day, name_day);
            JOptionPane.showMessageDialog(null, "The feels like temperature for " + name_day + "is :\n" + feel_temperature + " degree celcius");
        }
        else

        {
            JOptionPane.showMessageDialog(null, "you entered wrong day!!");
        }
    }

}
