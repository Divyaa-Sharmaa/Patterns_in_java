package Patterns_in_java;

import java.util.Scanner;

public class charPattern {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        char ch = 'A';  
        for(int i = 1;i<=noOfLines;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(ch);   
                ch++;
            }
            System.out.println();
        }
    }
}
