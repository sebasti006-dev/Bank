/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoSavingAccounts;
import ec.edu.espoch.bank.object.Account;

/**
 *
 * @author Sebas
 */
public class SavingAccounts extends Account implements DaoSavingAccounts{
    @Override
    public boolean deposit(float value){
        
        return false;
        
    }

    @Override
    public boolean withdraw(float value){
        
        return false;
        
    }

    @Override
    public boolean monthlyStatement(){
        
        return false;
        
    }

    @Override
    public void print(){
        
    }
}
