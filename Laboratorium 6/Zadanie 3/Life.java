/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author Maciej Falkiewicz, Aleksander Ostasz
 */
public class Life extends Insurance {

    public Life(String insuranceType) {
        super(insuranceType);
        setCost();
    }

    public void setCost() {
        this.monthlyPrice = 36;
    }

    public void display() {
        System.out.println("InsuranceType: " + getInsuranceType() + "\nMonthly Price: " + getMonthlyPrice());
    }
}
