/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoSavingAccounts;
import ec.edu.espoch.bank.object.SavingAccount;

/**
 *
 * @author Sebas
 */
public class SavingAccounts extends Accounts implements DaoSavingAccounts {

    public SavingAccounts(SavingAccount savingAccount) {
        if (savingAccount.getBalance() > 1000) {
            savingAccount.setStatus(true);
        }

    }

    @Override
    public boolean deposit(SavingAccount savingAccount, float value) {
        boolean resp = false;
        if (savingAccount.isStatus()) {
            resp = super.deposit(savingAccount, value);
        }
        return resp;

    }

    @Override
    public boolean withdraw(SavingAccount savingAccount, float value) {
       boolean resp = false;
        if (savingAccount.isStatus()) {
            resp = super.withdraw(savingAccount, value);
        }
        return resp;

    }

    @Override
    public boolean monthlyStatement() {

        return false;

    }

    @Override
    public void print() {

    }
}
