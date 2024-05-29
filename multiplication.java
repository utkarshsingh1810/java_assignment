//Write a program to print the multiplication table of a number N,entered by the user

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        for(int i=1; i<=10 ; i++){
                

         System.out.println(num + "*" + i + "=" + num*i);
        }
         
        scn.close();

    }
}
