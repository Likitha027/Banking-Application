package org.example;

public class CustomerDetails {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setCustomerName("Jagan");
        c.setAge(30);
        c.setGender("Male");
        c.setAddress("Bangalore");

        Account a = new Account();
        a.setAccountType("Savings");
        a.setAccountBalance(2000.0);
        a.setAccountId("SER02135985");

        System.out.println("Customer name:" +c.getCustomerName());
        System.out.println("Customer age:" +c.getAge());
        System.out.println("Customer Gender" +c.getGender());
        System.out.println("Customer address:" +c.getAddress());
        System.out.println("Customer Account Type:" +a.getAccountType());
        System.out.println("Customer Account Balance:" +a.getAccountBalance());
        System.out.println("Customer AccountId:" +a.getAccountId());
    }
}