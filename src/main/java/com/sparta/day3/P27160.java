package com.sparta.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        //과일 카드 카운팅
        int p = 0;
        int s = 0;
        int b = 0;
        int l = 0;

        for (int i = 0; i < num; i++) {

             String card[] = br.readLine().split(" "); //카드의 정보를 num번 입력 받는다 공백 분리 PLUM 4

             String fruit = card[0];
             int cardNum = Integer.parseInt(card[1]);


             switch(fruit) {
                 case "STRAWBERRY":
                     s+=cardNum;
                    break;
                 case "BANANA":
                     b+=cardNum;
                     break;
                 case "LIME":
                     l+=cardNum;
                     break;
                 case "PLUM":
                     p+=cardNum;
                     break;
                 default:
                    return;
             }
        }

        if(p==5 || b==5 || l==5 || s==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }//main end
}
