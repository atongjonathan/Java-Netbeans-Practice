/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author Atong Jona
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int count=0,newnum= num;
        while(newnum!=0){
       newnum=newnum/10;
       count++;
    }
       int digit[]=new int[count];
       int i;
       for(i=0;i<count;i++){
           digit[i]=num%10;
           num=num/10;
       }
        int mul=1;
       for(i=0;i<count;i++){
           mul=mul*digit[i];
       }
       int digitsofMul=0,iteration=1;
               while(mul!=0){
       mul=mul/10;
       digitsofMul++;
    }
               System.out.println(digitsofMul);
               
               if (digitsofMul!=1){
                   int mularray[]=new int[digitsofMul];
       int index;
                   while(iteration>1){
       for(index=0;index<digitsofMul;index++){
           mularray[index]=mul%10;
           mul=mul/10;
       }
        int multiply=1;
       for(index=0;index<count;index++){
           multiply=multiply*digit[index];
       }   
       int digitsofMultiply=0;
               while(multiply!=0){
       multiply=multiply/10;
       digitsofMultiply++;
               }
                  iteration++;
}
                              
    }
               else{
                        System.out.println(iteration);   
                           } 
}
}
