package com.shivangirai;
import javax.swing.*;
import java.util.Scanner;
public class assignment8 {
    public static void main(String[] args) {
        String day_of_week, name;
        double temp, speed_of_wind;
        Temperature test = new Temperature();
        Scanner scan = new Scanner(System.in);

//        name = JOptionPane.showInputDialog("Enter Your Name ");
        test.setName();


        day_of_week = JOptionPane.showInputDialog("Enter the day of the week: ");
        test.setDayOfWeek(day_of_week);

        temp = Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature "+test.getDayOfWeek()+" : "));
        test.setTempOfDay(temp);

        speed_of_wind = Double.parseDouble(JOptionPane.showInputDialog("Enter wind speed " + test.getDayOfWeek()+" : "));
        test.setWindSpeed(speed_of_wind);

        JOptionPane.showMessageDialog(null,"The feels-like temperature on "+test.getDayOfWeek()+" is: " + test.temperature(temp, speed_of_wind));
        

    }
}


