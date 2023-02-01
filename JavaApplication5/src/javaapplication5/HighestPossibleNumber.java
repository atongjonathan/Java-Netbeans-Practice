/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.Arrays;
import java.util.Collections;

public class HighestPossibleNumber {
   public static int sortDesc(final int num){
     String arr[] = String.valueOf(num).split("");
     Arrays.sort(arr, Collections.reverseOrder());
     System.out.println(Integer.valueOf(String.join("", arr)));
      return Integer.valueOf(String.join("", arr));
         
}
  
   public static void main (String[] args){
       HighestPossibleNumber obj= new HighestPossibleNumber();
       obj.sortDesc(4787);
   }
}
