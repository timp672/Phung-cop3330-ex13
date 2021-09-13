/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("What is the principal amount? ");
        String strPrincipal = scan.nextLine();
        System.out.print( "What is the rate? " );
        String strRate = scan.nextLine();
        System.out.print( "What is the number of years? " );
        String strYears = scan.nextLine();
        System.out.print( "What is the number of times the interest is compounded per year? " );
        String strCompound = scan.nextLine();

        //processing
        double principal = Double.parseDouble(strPrincipal);
        double rate = Double.parseDouble(strRate);
        double years = Double.parseDouble(strYears);
        double compound = Double.parseDouble(strCompound);

        double interest = rate / 100;
        double total = principal*Math.pow((1+interest/compound),(compound*years));

        //output
        BigDecimal format = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        NumberFormat dFormat = NumberFormat.getCurrencyInstance();
        System.out.println(dFormat.format(principal)+" invested at " +strRate+ "% for " +strYears+ " years compounded " +strCompound+ " times per year is " +dFormat.format(format)+ ".");
    }
}
