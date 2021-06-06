/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex06;

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String currentAgeS = in.nextLine();
        int currentAgeI = Integer.parseInt(currentAgeS);

        Scanner in2 = new Scanner(System.in);
        System.out.print("At what age would you like to retire? ");
        String retireAgeS = in2.nextLine();
        int retireAgeI = Integer.parseInt(retireAgeS);

        int retireTime = retireAgeI - currentAgeI;

        int year = Calendar.getInstance().get(Calendar.YEAR);

        int retireYear = year + retireTime;

        String outputString = "You have " + retireTime + " years left until you can retire.";
        System.out.println(outputString);

        String outputString2 = "It's " + year + ", so you can retire in " + retireYear + ".";
        System.out.println(outputString2);
    }
}