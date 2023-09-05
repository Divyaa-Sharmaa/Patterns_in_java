package Patterns_in_java;

import java.util.Scanner;

public class PalinNumPyra {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int n = sc.nextInt();
        palinNumberPyramid(n);
    }

    public static void palinNumberPyramid(int n){
        for (int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            // first desc order
            for(int j = i; j>=1;j--){
                System.out.print(j);
            }
            // then asc order
            for(int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
