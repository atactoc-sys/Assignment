package com.emploiee;

public class Emploiee {
    long emploieeId;
    String emploieeName;
    String emploieeAddress;
    long emploieePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double Hra = 1000.50;
    Emploiee(long Id,String Name, String Address, long Phone, double basicSalary){
        this.emploieeId = Id;
        this.emploieeName = Name;
        this.emploieeAddress = Address;
        this.emploieePhone = Phone;
        this.basicSalary = basicSalary;
    }
    public void calculateTransportAllowance(){

    }
}
