package com.company;

import java.util.Scanner;

public class Main {

//    Create a new project in IntelliJ IDEA named ArrayPractice
//    Declare an array named dailyAverageTemp
//    Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days
//    Each time the user inputs a value, add it to your dailyAverageTemp array

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double [] dailyAverageTemp = new double [6];
        System.out.println("Please enter the daily average temperature " +
                "(in degrees Fahrenheit) for the last 7 days  ");

        double answerForTemp = reader.nextDouble();

        answerForTemp = dailyAverageTemp [0];
        System.out.println(answerForTemp);
    }
}
