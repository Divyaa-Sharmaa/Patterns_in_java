package Patterns_in_java;

import java.util.Scanner;

public class solidRhombus {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        solid_Rhombus(noOfLines);
    }
    
    public static void solid_Rhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
