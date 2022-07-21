package Array;

//creat a jagged array by user input and clone the array and find name.

import java.util.Scanner;

public class ArrayProblame {

    static int[][] cline (int arr[][]){//method to clone
        int[][] clone = new int[arr.length][];
        for (int o = 0;o < arr.length; o++){
            clone [o] = (arr[o] == null)? null : arr[o].clone();
        }
       return clone;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lngth");
        int arrLength = sc.nextInt();
        //to get the length
        
        int arr[][] = new int [arrLength][];
        
        //initialization of column im each row
        System.out.println("enter numbers for each row");

        for (int i = 0; i < arrLength; i++){
            arr[i] = new int[sc.nextInt()];
        }
        
         //initialization array
        System.out.println("enter elements");
        for (int i = 0;i<arr.length;i++){//row
            for (int j = 0;j<arr[i].length;j++){//column
                arr [i][j] = sc.nextInt();
            }
        }

        System.out.println("display");

        for (int i = 0;i<arr.length;i++){//row
            for (int j = 0;j<arr[i].length;j++){//column
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("clone result");
        int[][]  a= arr.clone();
        System.out.println(arr[0] == a[0]);

        a=cline(arr);

        System.out.println("class name ");

        Class c = arr.getClass();//getting th class name
        String name = c.getName();
        System.out.println(name);//print the class name;

    }
}
