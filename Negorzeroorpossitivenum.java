// DETERMINING THE NUMBER
//IMPORTING UTIL PACKAGE FROM JAVA
import java.util.*;
public class Negorzeroorpossitivenum {
    public static void main (String args[]){
        //SCANNER CLASS OBJECT IS CREATED
        Scanner sc = new Scanner(System.in);
        //INPUT FROM USER
        int number = sc.nextInt();
        // USING LOOP WITH LOGIC
        if(number>0){
            System.out.println("NUMBER IS POSSITIVE");
        }else if(number==0){
            System.out.println("NUMBER IS ZERO");
        }else if(number<0){
            System.out.println("NUMBER IS NEGATIVE");
        }
    }
}


