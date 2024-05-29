import java.util.*;
public class avgjava{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write value of A");
        float a = scn.nextFloat();
        System.out.println("Write value of b");
        float b = scn.nextFloat();
        System.out.println("Write value of c");
        float c = scn.nextFloat();
        float sum = (a+b+c)/3;
        System.out.println("Avg of a,b,c is ");
        System.out.println(sum);
        scn.close();
        



}       
    }