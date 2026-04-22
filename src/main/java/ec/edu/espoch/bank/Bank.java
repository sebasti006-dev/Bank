/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.bank;

import ec.edu.espoch.bank.datasource.Accounts;
import ec.edu.espoch.bank.object.Account;

/**
 *
 * @author Sebas
 */
public class Bank {

    public static void main(String[] args) {
       Accounts accounts= new Accounts();
       Account account= new Account(10, 5);
       accounts.print(account);
    }
}
