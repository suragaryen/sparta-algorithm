package com.sparta.day1;

import java.util.Scanner;

public class P2475 {
    public static void main(String[] args) {

        int a = 0;
        Scanner sc = new Scanner(System.in); // 수를 입력하고 띄어쓰기 해도 알아서 처리 됌

        for(int i = 0; i<=4; i++){

            int temp = sc.nextInt();
            a += temp * temp;
        }

        System.out.println(a%10);

    }
}
