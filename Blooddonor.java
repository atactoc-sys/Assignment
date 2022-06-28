// DETERMINING IF THE PERSON IS ELIGIBLE FOR DONATING BLOOD

//IMPORTING UTIL PACKAGE FROM JAVA
import java.util.*;

public class Blooddonor {
    public static void main (String args[]){
        // CREATING NW SCANNER CLASS OBJECT FOR AGE
        Scanner sc = new Scanner(System.in);
        //INPUT OF AGE
        System.out.println("PLEASE ENTER AGE");
        int age = sc.nextInt();
        //LOOP WITH LOGIC
        if(age<18){
            System.out.println("YOUR AGE NEED TO BE ATLEAST 18");
        }else{
            System.out.println("WAIT FOR YOUR WEIGHT MEASUREMENT\nPLEASE ENTER WEIGHT");

            Scanner ab = new Scanner(System.in);
            int weight = ab.nextInt();

            if(weight<48){
                System.out.println("SORRY AT FIRST YOU NEED TO GAIN SOME WEIGHT");
            }else{
                System.out.println("YOU ARE ELIGIBLE");
            }
        }
    }
    
}
