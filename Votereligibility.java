// VOTER ELIGIBILITY TRACKING

//IMPORTING UTIL PACKAGE FROM JAVA
import java.util.*;

public class Votereligibility {
    public static void main(String args[]){
        // SCANNER CLASS OBJECT FOR TAKING INPUT FROM USER
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // IF ELSE STATEMENT 
        if(age>=18){//LOGIC STATEMENT
            System.out.println("HE OR SHE IS ELIGIBLE TO VOTE");
        }
        else{
            System.out.println("HE OR SHE IS NOT ELIGIBLE TO VOTE");
        }
    }

    
}
