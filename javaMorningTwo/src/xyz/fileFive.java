package xyz;


import java.util.Scanner;

public class fileFive {
    public static void main(String[] args) {
        Double x, y, answer;
        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("Enter the First Number");
        x = chukua.nextDouble();
        System.out.println("Enter the Second Number");
        y = chukua.nextDouble();
        answer = x*y;
        System.out.println("The product is "+answer);
    }
}
