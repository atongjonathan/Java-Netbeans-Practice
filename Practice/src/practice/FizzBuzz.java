/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;
import java.util.Scanner;

/**
 *
 * @author Atong Jona
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner reader = new Scanner(System.in);
        double number= reader.nextInt();
         if(number%3==0&&number%5==0){
            System.out.println("FizzBuzz");
        }
        else if(number%3==0){
            System.out.println("|Buzz");
        }
        else if(number%5==0){
            System.out.println("Fizz");
        }
        else if(number%3!=0&&number%5!=0){
            System.out.println(number);
    }
    }
    
}
