/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Atong Jona
 */
public class GreaterNo {
public int CompareNum()   
    {   
        int x = 3;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  }
  public static String greater(int x,int y){
      String greater = x>y? "X is the greater number":"Y is the greater number";
      return greater;
  }
    public static void main(String[] args) {
    GreaterNo obj = new GreaterNo();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    }  
    
}
