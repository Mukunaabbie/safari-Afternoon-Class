package XYZ;

import java.util.Scanner;

public class FILE6 {
    public static void main(String[] args) {
        Double x,y,jibu;
        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("enter the first number");
        x = chukua.nextDouble();
        System.out.println("enter the Second Number");
        y = chukua.nextDouble();
        jibu = x+y;
        System.out.println("your answer is"+jibu);
    }
}
