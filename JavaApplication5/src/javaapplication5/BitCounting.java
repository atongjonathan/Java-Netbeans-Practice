/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Atong Jona
 */
public class BitCounting {

    	public static int countBits(int n){
        int rem,i=0;
	while(n>0){
            rem=n%2;
            n=n/2;
            if(rem==1)
                i++;
        }System.out.println(i);
        return i;
	}
        /*Better solution
        	public static int countBits(int number){
		int res = 0;
    String[] digits = Integer.toBinaryString(number).split("");
    for (String digit : digits)
      if (digit.equals("1"))
        res++;
    return res;
	}
	
}*/
    public static void main(String[] args) {
         BitCounting obj= new BitCounting();
       obj.countBits(1234);
}
}
