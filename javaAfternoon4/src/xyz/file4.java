package xyz;

import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {
        Scanner chukua;
        String[] watu;
        Integer num;
        chukua =new Scanner(System.in);
        System.out.println("how many names do you have");
        num = chukua.nextInt();
        watu =new String[num];
        for (int i=0; i<num; i++){
            System.out.println("enter name"+( i+1));
            watu[i] =chukua.next();
        }
        for (int i=0; i<num; i++){
            System.out.println(watu[i]);
        }

    }
}
