/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewars;

import java.util.Arrays;


public class Disemvowel {
    public  int disemvowel(int words) {
        int count=0;
  String number=  Integer.toBinaryString(words);
  int number2 = Integer.parseInt(number);
  String[]arr=String.valueOf(number2).split("");
  for(int i=0;i<arr.length;i++)
      if(arr[i].equals("1")){
        count++;  
  }
        System.out.println(count);
 return number2;
            }
                    
    public static void main(String[] args) {
        Disemvowel obj = new Disemvowel();
  int result=  obj.disemvowel(789);  
        System.out.println(result);
    }
    
}
