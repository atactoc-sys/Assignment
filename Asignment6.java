//Write a java class to accept five string name..


import java.util.Scanner; //Importing Scanner class

public class Asignment6 {//class
    public static void main(String args[]){
        System.out.println("CHOSE FROM THE REST\nArin\nSuman\nKoushik\nSaikat\nDaku");

        String name;

        //Scanner class object created
        //taking userinput
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        //Switch case
        switch (name) {
            case "Arin" :
                System.out.println("99");
                break;//break the floe
            case "Suman" :
                System.out.println("100");
                break;//break the floe
            case "Koushik" :
                System.out.println("101");
                break;//break the floe
            case "Saikat" :
                System.out.println("102");
                break;//break the floe
            case "Daku" :
                System.out.println("103");
                break;//break the floe
            default :
                System.out.println("405 error...");
        }
    }
}
