package com.sparta.day1;


import java.util.Scanner;

public class P1330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String result;

        if(a>b) result = ">";
        else if(a<b) result = "<";
        else result = "=";

        System.out.println(result);

        sc.close();

    }
}
