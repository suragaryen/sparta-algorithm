package com.sparta.day2;

import java.util.Scanner;

public class P10870 {
    /*
        피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

        이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

        n=17일때 까지 피보나치 수를 써보면 다음과 같다.

        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

        n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibo(n);
        System.out.println(result);
    }

    static int fibo(int n) {

        //기저조건
        //n == 0 --> 0
        //n == 1 -->

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2); //재귀 실행
        }
    }

    /*
        int n이 4 일때
        구하고 자 하는 목표 값은 fibo(4)
        알고 있는 값 fibo(0) = 0 / fibo(1) = 1

        fibo(4)
        │
        ├── fibo(3) → fibo(2) → fibo(1) = 1
        │             fibo(1) = 1        fibo(0) = 0
        │             fibo(2) = 1
        │
        └── fibo(2) → fibo(1) = 1
                      fibo(0) = 0
     */

}
