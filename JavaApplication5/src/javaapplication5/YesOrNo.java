/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Atong Jona
 */
public class YesOrNo {
public static String booleanword(boolean b){
    String result= true? "Yes" : "No";
    return result;
}

    public static void main(String[] args) {
        YesOrNo obj = new YesOrNo();
        obj.booleanword(false);
    }
    
}
