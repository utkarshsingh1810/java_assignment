import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scn.nextInt();

        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100==0) && (year%400==0));

        if(x && (y||z)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leapyear");
        }
        scn.close();

        


        

        


    }
    
}
