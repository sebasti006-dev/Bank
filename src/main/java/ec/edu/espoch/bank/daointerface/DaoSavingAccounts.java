/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.bank.daointerface;

/**
 *
 * @author Sebas
 */
public interface DaoSavingAccounts {

    public boolean deposit(float value);

    public boolean withdraw(float value);

    public boolean monthlyStatement();

    public void print();
}
