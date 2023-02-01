/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewars;

import java.util.Arrays;

/**
 Accept user input
 replace digits in array to #
 Repeat 2 until max of 4 characters
 * @author Atong Jona
 */
public class CreditCardMask {

public String maskify(String num){
    int size = num.length();
    char arr[]= new char[num.length()];
    for(int i=0;i<num.length();i++){
        arr[i]=num.charAt(i);
    }
    for(int i=0;i<size-4;i++){
                arr[i]='#';
    }
    String string = new String(arr);
        return string;
}
    public static void main(String[] args) {
      CreditCardMask obj= new CreditCardMask();
      obj.maskify("4556364607935616");
    }
    
}
