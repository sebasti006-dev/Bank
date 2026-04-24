/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.object;

/**
 *
 * @author Sebas
 */
public class SavingAccount extends Account {
      protected boolean status= false;

    public SavingAccount() {
    }

    public SavingAccount(float balance, float anualInterest) {
        super(balance, anualInterest);
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

 

}


