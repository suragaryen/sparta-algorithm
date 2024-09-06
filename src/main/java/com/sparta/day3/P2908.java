package com.sparta.day3;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int reversedA = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(b).reverse().toString());

        int result = Math.max(reversedA, reversedB);

        System.out.println(result);

    }
}
