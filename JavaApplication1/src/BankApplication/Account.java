/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankApplication;

/**
 *
 * @author Atong Jona
 */
public class Account {
    private String accountNumber;
    private String openDate;
    private String accountHolder;
    private double balance;
    
    public Account(String accNumber,String date,String accHolder,double bal){
        
        this.accountNumber= accNumber;
        this.accountHolder= accHolder;
        this.openDate= date;
        this.balance=bal;        
    };
          
 

    public static void main(String args[]){
        Account acc = new Account("999","Jonathan","02/21/18",1.00);
        System.out.println(acc.accountNumber);
    }
    
public void withdraw(double amount){
this.balance =this.balance-amount;
}
public void deposit( double amount){
this.balance= this.balance +amount;
}
public void transfer(Account s ,double amount){
    this.withdraw(amount);
    s.deposit(amount);
}}

