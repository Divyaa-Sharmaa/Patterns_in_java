package Patterns_in_java;

import java.util.Scanner;

public class squarePattern {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        for(int i = 1;i<=noOfLines;i++){
            for(int j = 1; j<=noOfLines;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
