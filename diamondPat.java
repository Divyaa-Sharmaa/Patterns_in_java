package Patterns_in_java;

import java.util.Scanner;

public class diamondPat {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int n = sc.nextInt();
        diamondPattern(n);
    }
    
    public static void diamondPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
