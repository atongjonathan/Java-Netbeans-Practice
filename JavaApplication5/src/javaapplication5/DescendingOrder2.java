/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Atong Jona
 */


public class DescendingOrder2 {
    public static int sortDesc(final int num) {
 String [] array = String.valueOf(num).split("");//placing indexes of the array with the values of the integer number after splitting
 Arrays.sort(array,Collections.reverseOrder());//sort them and putting in reverse order
          System.out.println(Arrays.toString(array));//New sorted array in reverse order
          return Integer.valueOf(String.join("", array));

    }
public static void main (String[]args){
DescendingOrder2.sortDesc(89345);
}
}