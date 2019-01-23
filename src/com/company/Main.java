package com.company;

import java.util.Scanner;

public class Main {

//    Create a new project in IntelliJ IDEA named ArrayPractice
//    Declare an array named dailyAverageTemp
//    Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days
//    Each time the user inputs a value, add it to your dailyAverageTemp array

    public static void main(String[] args) {
        int averageTempArraySize = 7;

        Scanner reader = new Scanner(System.in);

        double [] dailyAverageTemp = new double [averageTempArraySize];


        for (int i=0; i< averageTempArraySize; i++){
            System.out.println("Please enter the daily average temperature " +
                    "(in degrees Fahrenheit) for the last 7 days  ");
            double userInput = reader.nextDouble();
            dailyAverageTemp[i]=userInput;

        }

        for (int i=0; i<dailyAverageTemp.length; i++){
            System.out.println(dailyAverageTemp [i]);

        }

    }


}
