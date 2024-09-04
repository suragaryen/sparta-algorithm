package com.sparta.day1;

import java.util.Scanner;

public class P2445 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        // 상단 부분
        for (int i = 1; i <= n; i++) {
            // 왼쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 가운데 공백 출력
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 오른쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }

        // 하단 부분
        for (int i = n - 1; i >= 1; i--) {
            // 왼쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 가운데 공백 출력
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 오른쪽 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }

    }
}
