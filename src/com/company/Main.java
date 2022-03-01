package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1,1,2,3,5,8,13,21,34...
        Scanner scan = new Scanner(System.in);
        System.out.println("bir san jazynyz:mmm");
        int input = scan.nextInt();
        int san1 = 0;
        int san2 = 1;
        int total;
        for (int i = 0; i < input; i++) {
            total = san1+san2;
            san1 = san2;
            san2=total;
            System.out.print(san1+",");
            System.out.println();
            System.out.print(san2+",");
            System.out.println();
            System.out.print(total+",");
        }
    }
}
