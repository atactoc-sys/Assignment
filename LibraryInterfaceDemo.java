package in.interf;

public class LibraryInterfaceDemo {
    public static void main(String args[]){


        System.out.println(" KidUser :- ");
        KidUser obj1 = new KidUser(10,"Kids");
        KidUser obj2 = new KidUser(18,"Fiction");
        obj1.registerAccount();
        obj1.requestBook();
        obj2.registerAccount();
        obj2.requestBook();

        System.out.println(" AdultUser :- ");
        AdultUser obj3 = new AdultUser(5,"Kids");
        AdultUser obj4 = new AdultUser(23,"Fiction");
        obj3.registerAccount();
        obj3.requestBook();
        obj4.registerAccount();
        obj4.requestBook();
    }
}
