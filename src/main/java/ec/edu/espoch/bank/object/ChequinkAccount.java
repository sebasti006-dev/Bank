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
    

    public float getOverdraff() {
        return overdraff;
    }

    public void setOverdraff(float overdraff) {
        this.overdraff = overdraff;
    }

    public boolean depositAmount(float value) {
        return false;
    }

    public boolean updatingBalance() {

        return false;

    }

    public boolean withdrawAmount() {

        return false;

    }
}
