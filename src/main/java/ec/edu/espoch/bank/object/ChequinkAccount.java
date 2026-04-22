/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.object;

/**
 *
 * @author Sebas
 */
public class ChequinkAccount extends Account{
        protected float overdraff = 0;

    public ChequinkAccount() {
    }

    public ChequinkAccount(float balance, float anualInterest) {
        super(balance, anualInterest);
    }

    public float getOverdraff() {
        return overdraff;
    }

    public void setOverdraff(float overdraff) {
        this.overdraff = overdraff;
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
