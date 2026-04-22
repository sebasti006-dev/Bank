/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoCheckingAccounts;

/**
 *
 * @author Sebas
 */
public class ChequinkAccounts extends Acounts implements DaoCheckingAccounts{
    public boolean deposit(float value){
        
        return false;
        
    }

    public boolean withdraw(float value){
        
        return false;
        
    }

    public boolean montlyStatement(){
        
        return false;
        
    }

    public void print(){
        
    }

}
