package XYZ;

import java.util.Scanner;

public class file7 {
    public static void main(String[] args) {
        Double p,r,t,i;
        Scanner ingiza;
        ingiza = new Scanner(System.in);
        System.out.println("Enter the principle");
        p = ingiza.nextDouble();
        System.out.println("Enter the rate per year");
        r = ingiza.nextDouble();
        System.out.println("Enter time in years");
        t=ingiza.nextDouble();
        i=(p*r*t)/100.0;
        System.out.println("ypu interest is"+1);

    }
}
