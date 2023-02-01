/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Atong Jona
 */
public class practice {
    public int HighNo(int n){
         String arr[]= String.valueOf(n).split("");
         Arrays.sort(arr,Collections.reverseOrder());
         return Integer.valueOf(String.join("", arr));
    }
    public static void main(String[] args) {
      practice obj = new practice();
      int result =obj.HighNo(789);
        System.out.println(result);
    }
    
}
