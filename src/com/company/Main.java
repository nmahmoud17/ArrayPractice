package com.company;

import java.util.Scanner;

public class Main {

//    Create a new project in IntelliJ IDEA named ArrayPractice
//    Declare an array named dailyAverageTemp
//    Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days
//    Each time the user inputs a value, add it to your dailyAverageTemp array
//    Next, your program should print out the weekly average temperature
//    (e.g., the average of the averages)
//Your program should convert each daily average temperature to Celsius,
// and should store the Celsius values in a new array named dailyAverageTempCelsius
//    Your program should print out the daily and weekly averages in Fahrenheit and Celsius

    public static void main(String[] args) {
        int averageTempFArraySize = 7;
        int averageTempCArraySize =7;

        Scanner reader = new Scanner(System.in);

        double [] dailyAverageTempF = new double [averageTempFArraySize];


        for (int i=0; i< averageTempFArraySize; i++){
            System.out.println("Please enter the daily average temperature " +
                    "(in degrees Fahrenheit) for the last 7 days  ");
            double userInput = reader.nextDouble();
            dailyAverageTempF[i]=userInput;

        }

        double input = 7;
        double sum = 0;
        double sum2= 0;
        double weeklyAverageF=0;
        double weeklyAverageC=0;
        double tempFtoC=0;


        for (int i=0; i<dailyAverageTempF.length; i++){
            System.out.println(dailyAverageTempF [i]);
            sum = sum + dailyAverageTempF [i];
            weeklyAverageF = sum/input;
        }
        System.out.println("Above is the average F Temp for 7 days " + "\n");

        //converting temperature from F to C
        for (double j: dailyAverageTempF) {
             tempFtoC = (j-32)/ 1.8;
             System.out.println(tempFtoC);
        }
        System.out.println("Above is the average C Temp for 7 days " + "\n");
        System.out.println("\n");

        //creating Array that holds conversions from last section
        double[] dailyAverageTempC = {tempFtoC};

        for (int i=0; i<dailyAverageTempC.length; i++){
            sum2 = sum2 + dailyAverageTempC [i];
            weeklyAverageC = sum2/input;
        }

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------");

        System.out.println ("The sum of all Fahrenheit temps is  " + sum);
        System.out.println ("The sum of all Celsius temps is  " + sum2);
        System.out.println ("The weekly average of Fahrenheit temps is " + weeklyAverageF);
        System.out.println ("The weekly average of Celsius temps is " + weeklyAverageC);


    }


}
