package XYZ;

import java.util.Scanner;

public class file8 {
    public static void main(String[] args) {
        Double r,h,vol;
        Scanner take;
        take = new Scanner(System.in);
        System.out.println("enter the radius");
        r = take.nextDouble();
        System.out.println( "enter the height");
        h = take.nextDouble();
        vol= Math.PI* Math.pow(r,2)*h;
        System.out.println("the volume is"+vol);


    }

}
