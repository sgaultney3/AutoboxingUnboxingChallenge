package com.SamuelGaultney;

public class Main {

    public static void main(String[] args) {



        Bank bank = new Bank("National United States Bank");

        bank.addBranch("Atlanta");

        bank.addCustomer("Atlanta", "Sam", 657.56 );
        bank.addCustomer("Atlanta", "Sally", 40.00);
        bank.addCustomer("Atlanta", "Steve", 3.00);

        bank.addBranch("Athens");
        bank.addCustomer("Athens", "Bill", 2000.56);

        bank.addCustomerTransaction("Atlanta", "Sam", 1_000_000);
        bank.addCustomerTransaction("Athens", "Bill", 2_000_000);
        bank.addCustomerTransaction("Athens", "Bill", 5.56);

        bank.listCustomers("Atlanta", true);
        bank.listCustomers("Athens", true);

        if(!bank.addCustomer("Melbourne", "Brian", 5.35)) {
            System.out.println("Error Melbourne branch DNE");
        }


    }
}
