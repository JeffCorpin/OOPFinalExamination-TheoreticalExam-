/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RegularCustomer extends Customer {
    public RegularCustomer(String name, double amount) {
		super(name, amount);
	}

	@Override
	public double calculateBill() {
		return amount;
	} 
}
