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

package com.emploiee;

public class Manager extends Emploiee{
     Manager (long Id, String Name, String Address, long Phone, double basicSalary){
          super(Id, Name, Address, Phone, basicSalary);

     }
     public void calculateTransportsAllowance(){
          double transportAllowance = 15*basicSalary/100;
          System.out.println("Transport allowance for Manager  :  "+transportAllowance);
     }
     public void calculateSalary(){

     }


}

package com.emploiee;

public class Trainee extends Emploiee {



    Trainee(long Id, String Name, String Address, long Phone, double basicSalary) {
        super(Id, Name, Address, Phone, basicSalary);
    }
    public void calculateTransportAllowance(){
        double transportAllowance = 10*basicSalary/100;
        System.out.println("Transport allowance for Manager  :  "+transportAllowance);
    }
    public void calculateSalary(){

    }
}

package com.emploiee;


public class InheritanceActivity {
    public static void main(String args[]){
        System.out.println("Manager :- ");
        Manager obj1 = new Manager(126534,"Peter","Chennai India",237544,65000);
        obj1.calculateSalary();
        obj1.calculateTransportsAllowance();

        System.out.println("Trainee :- ");
        Trainee obj2 = new Trainee(29846,"Jack","Mumbai India",442085,45000);
        obj2.calculateSalary();
        obj2.calculateTransportAllowance();
    }

}
