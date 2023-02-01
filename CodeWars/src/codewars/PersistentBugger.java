/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewars;

/**
 *
 * @author Atong Jona
 */
public class PersistentBugger {

   public int persistence(int n){
       int temp,x,count=0;
       while(n>=10){
           temp=n;
           count++;
           n=1;
           while(temp>0){
              x=temp%10;
              n=n*x;
              temp=temp/10;}
           }
                  
return count;
   }
   
    public static void main(String[] args) {
     PersistentBugger obj= new PersistentBugger();
     int rs= obj.persistence(4);
        System.out.println(+rs);
    }
    
}
