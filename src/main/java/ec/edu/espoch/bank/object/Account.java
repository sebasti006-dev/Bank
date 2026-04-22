/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.object;

/**
 *
 * @author Sebas
 */
public class Account {
    
    protected float balance;
    protected int numberDep = 0;
    protected int numberWithDrawals = 0;
    protected float anualInterest;
    protected float monthlyFee = 0;

    public Account() {
    }

    public Account(float balance, float anualInterest) {
        this.balance = balance;
        this.anualInterest = anualInterest;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberDep() {
        return numberDep;
    }

    public void setNumberDep(int numberDep) {
        this.numberDep = numberDep;
    }

    public int getNumberWithDrawals() {
        return numberWithDrawals;
    }

    public void setNumberWithDrawals(int numberWithDrawals) {
        this.numberWithDrawals = numberWithDrawals;
    }

    public float getAnualInterest() {
        return anualInterest;
    }

    public void setAnualInterest(float anualInterest) {
        this.anualInterest = anualInterest;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    public boolean depositAmount(float value ){
        
        return false;
        
    }
public boolean updatingBalance(){
    
        return false;
    
}
public boolean withdrawAmount(float value){
    
        return false;
    
}
 public float calculateInterest(){
     
        return 0;
     
 }
public boolean monthlyStatement(){
    
        return false;
    
}
public void print(){
    
}

}

