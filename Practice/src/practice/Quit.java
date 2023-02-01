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
public class Quit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Enter input: ");
            input = reader.next().toLowerCase();
            System.out.println(input);
 }
    }
}
