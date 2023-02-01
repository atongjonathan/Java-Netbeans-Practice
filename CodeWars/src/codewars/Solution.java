/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewars;

/**
 *
 * @author Atong Jona
 */
public class Solution {
            public static String whoLikesIt(String...names){
             if(names.length==0&&names.equals(""))
                 System.out.println("no one likes this");
             else if(names.length==1)
                    System.out.println(names[0]+" likes this");
             else if(names.length==2)
                    System.out.println(names[0]+" and"+names[1]+" like this");    
             else if(names.length==3)
                    System.out.println(names[0]+" ,"+names[2]+" and"+names[2]+" likes this");
             else if(names.length>3)
                    System.out.println(names[0]+" ,"+names[2]+" and "+(names.length-2)+" others likes this");
             else
                    System.out.println("no one likes this");
                return "";
            }
    public static void main(String[] args) {
        Solution obj = new Solution();
obj.whoLikesIt();  
    }
}
