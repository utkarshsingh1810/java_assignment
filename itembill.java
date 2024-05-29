import java.util.*;
public class itembill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Price of pencil");
        float a = scn.nextFloat();
        System.out.println("Price of pen");
        float b = scn.nextFloat();
        System.out.println("Price of eraser");
        float c = scn.nextFloat();
        System.out.println("Total cost is");
        float d = a+b+c;
        System.out.println(d);
        //System.out.println("18 % GST will be");
        float z = d*0.18f;
        System.out.println("18 % GST will be "   + z);

        scn.close();
    // Now add gst
        

    }
    
}
