/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.object.Account;

/**
 *
 * @author Sebas
 */
public class Accounts {

    public boolean deposit(Account account, float value) {
  
        float newBalance= account.getBalance()+value;
        account.setBalance(newBalance);
        return true;
               
       

    }

    public boolean withdraw(Account account, float value) {
  float newBalance = account.getBalance()-value;
     account.setBalance(newBalance);
        return true;

    }

    public float calculateInterest() {

        return 0.0f;

    }

    public boolean monthlyStatement() {

        return true;

    }

    public void print(Account account) {
        System.out.println("Saldo: "+ account.getBalance() );
        System.out.println("Deposito: "+account.getNumberDep());
        System.out.println("Cuota Mensual: "+ account.getMonthlyFee());
        System.out.println("Numero de retiros: "+ account.getNumberWithDrawals());
        System.out.println("Interes Mesual: "+ account.getAnualInterest());

    }
}
