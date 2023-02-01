/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewars;

/**
 *
 * @author Atong Jona
 */
public class ReturnNegative {

    public String MakeNegative(String n){
       
        return  n.replaceAll(" ","");
    }
    public static void main(String[] args) {
        ReturnNegative obj = new ReturnNegative();
        String negative = obj.MakeNegative("   dddd     r");
        System.out.println(negative);
    }
    
}
