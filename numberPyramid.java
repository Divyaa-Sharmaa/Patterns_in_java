package Patterns_in_java;

import java.util.Scanner;

public class numberPyramid {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int n = sc.nextInt();
        numPyramid(n);
    }

    public static void numPyramid(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // numbers
            for(int j = 1; j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
