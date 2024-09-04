package com.sparta.day1;

import java.util.Scanner;

public class P11945 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 세로 줄 수를 입력받는다 = N
        int N = scanner.nextInt();

        // 가로 줄 수를 입력 받는다 = M
        int M = scanner.nextInt();
        scanner.nextLine(); // 이 줄을 추가하여 남아 있는 줄바꿈 문자를 소비

        // 2차원 배열로 정의한다
        int[][] array = new int[N][M]; // N행 M열

        // 배열에 값을 한 줄씩 입력받아 할당
        for (int i = 0; i < array.length; i++) { // N 번 반복 (행의 길이를 뜻 함)
            String line = scanner.nextLine(); // 한 줄 통째로 입력받음


            // 문자열을 역순으로 저장
            for (int j = 0; j < array[i].length; j++) { // M 번 반복
                array[i][j] = Character.getNumericValue(line.charAt(M - j - 1)); // 각 문자를 역순으로 변환하여 배열에 저장
            }
        }

        // 배열 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
