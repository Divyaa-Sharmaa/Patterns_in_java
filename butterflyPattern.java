package Patterns_in_java;

import java.util.Scanner;

public class butterflyPattern {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        butterFlyPattern(noOfLines);
    }

    public static void butterFlyPattern(int n){
        // 1st half
        for (int i = 1; i <=n; i++) {
            for(int j = 1;j<=i;j++){
               System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
               System.out.print("*");
            }
           System.out.println();           
        }

        // 2nd half
         for (int i = n; i >=1; i--) {
            for(int j = 1;j<=i;j++){
               System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
               System.out.print("*");
            }
           System.out.println();           
        }
    }
    
}
