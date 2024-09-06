package com.sparta.day2;

import java.util.Scanner;


public class P10994 {

    public static void printPattern(int n) {
        int size = 4 * n - 3; // 패턴 크기는 4n - 3
        char[][] pattern = new char[size][size]; // 9x9

        // 배열 초기화 모든 값에 공백을 넣음
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = ' ';
            }
        }

        //가장 큰 변부터 시작 layer가 0일때 가장 큰변의 테두리를 그린다.
        for (int layer = 0; layer < n; layer++) {
            int start = 2 * layer;
            int end = size - 2 * layer - 1;
            for (int i = start; i <= end; i++) {


                pattern[start][i] = '*'; // [0],[0~8] 가장 윗변
                pattern[end][i] = '*';   // [8],[0~8] 가장 밑변
                pattern[i][start] = '*'; // [0~8],[0] 왼쪽변
                pattern[i][end] = '*';   // [0~8], [8] 오른쪽변
            }
        }

        //2차원 배열 프린트
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            printPattern(n);
        sc.close();
    }
}

