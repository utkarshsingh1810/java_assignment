//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class even_odd_add_integer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int evensum=0;
        int oddsum = 0;
        while(n>0){
            int last = n%10;
            if(last%2 == 0){
                evensum = evensum+last;

            }else{
                oddsum = oddsum + last;

            }n = n/10;
        }
        System.out.println( "Even sum is  " + evensum );
        System.out.println( "Odd sum is " + oddsum);
        s.close();
    }
}

