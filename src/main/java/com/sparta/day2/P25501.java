package com.sparta.day2;

import java.util.Scanner;

public class P25501 {

    public static void main(String[] args){

        //몇번 팰린드롬 테스트를 할건지? = n번

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 몇번 반복?
        scanner.nextLine();
        StringBuilder results = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            recursionCount = 0;
            results.append(isPalindrome(scanner.nextLine()) + " " + recursionCount + "\n");
        }
        System.out.println(results.toString());
    }

    static int recursionCount;

    public static int isPalindrome(String s){

        return recursion(s, 0, s.length()-1);
    }


    public static int recursion(String s, int l, int r ){
        // s = ABBA , l=0, r=3
        recursionCount++;

        if(l >= r) return 1; // 글자수가 0 일때 팰린드롬 처리
        else if(s.charAt(l) != s.charAt(r)) return 0; //맨 처음 글자와 마지막 글자가 다름 팰린드롬이 아닐때
        else return recursion(s, l+1, r-1);  // 글자수가 0 이 아니거나 첫번째, 마지막 글자가 서로 다를 경우 재귀함수 호출
    }

}
