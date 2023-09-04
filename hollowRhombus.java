package Patterns_in_java;

import java.util.Scanner;

public class hollowRhombus {
     public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args){
        int noOfLines = sc.nextInt();
        hollow_Rhombus(noOfLines);
    }
    
    public static void hollow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // hollow rectangle
            for(int j=1;j<=n;j++){
                if(i==1|| i==n || j==n || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
