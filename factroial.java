//Write a program to find the factorialof any number entered by the user.

import java.util.Scanner;

public class factroial {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int num; // To hold number 
        int fact = 1; // To hold factroial

        System.out.print("Enter a positive number: ");
        num = scn.nextInt();

        for(int i=1; i<=num; i++){
            fact = fact * i;
            
        
        }
        System.out.println("Factorial is: "  + fact);
        scn.close();
    }
}
