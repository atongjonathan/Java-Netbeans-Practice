/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;
import java.text.NumberFormat;
import java.util.Scanner;


/**
 *
 * @author Atong Jona
 */
public class Mortgage {
   


    public static void main(String[] args) {
        final int percent= 100;
        final int months= 12;
        Scanner reader= new Scanner(System.in);
        double principal=0;
        while(principal<=1000||principal>1_000_000){
            System.out.print("Enter a number between 1K to 1M :");
            principal = reader.nextDouble();}
        Scanner reader2 = new Scanner(System.in);
        double ratepa = 0;
        while(ratepa<=0||ratepa>30){
            System.out.println("Enter the annual interest rate: "); 
            ratepa=reader2.nextDouble();}
        Scanner reader3 = new Scanner(System.in);
        double period =0;
        while(period<1||period>30){
            System.out.println("Enter the period in years: ");
            period=reader3.nextDouble();
        }
        double r= ratepa/(double)months/(double)percent;
        double numerator=r*(Math.pow((1+r), period));
        double denominator=(Math.pow((1+r), period))-1;
        double mortgage= principal*numerator/denominator;
        System.out.println(mortgage);
    }}
