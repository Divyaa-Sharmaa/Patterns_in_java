package Patterns_in_java;

import java.util.Scanner;

public class FLOYD_Triangle {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        int k = 1;  
        for(int i = 1;i<=noOfLines;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(k);   
                k++;
            }
            System.out.println();
        }
    }
    
}
