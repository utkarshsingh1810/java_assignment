// Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        if(number>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    scn.close();
        
    } 
    
}
