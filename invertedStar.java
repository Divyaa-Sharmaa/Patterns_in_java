package Patterns_in_java;

import java.util.Scanner;

public class invertedStar {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        for(int i = 1;i<=noOfLines;i++){
            for(int j = i; j<=noOfLines;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
