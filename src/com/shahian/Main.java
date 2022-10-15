package com.shahian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, reverse = 0;
        System.out.println("enter a number to reverse");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse  * 10+remainder;
            n = n / 10;
        }
        System.out.println("reverse of entered number is : " + reverse);
    }
}
