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
      protected boolean status;

    public SavingAccount() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean depositAmount(float value) {

        return false;
    }

    public boolean withdrawAmount(float value) {
        return false;
    }

    public boolean monthlyStatement() {
        return false;
    }

    public void print() {

    }
}


