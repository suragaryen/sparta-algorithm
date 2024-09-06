package com.sparta.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2675 {
    public static void main(String[] args) throws IOException {

        /*
            문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
            즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
            QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
       */

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // 이 프로그램을 몇번 실행 시킬건지?
            int num = Integer.parseInt(reader.readLine());

            StringBuilder results = new StringBuilder();


            for (int i = 0; i < num; i++) {

                String line = reader.readLine(); // 각 문자를 반복시킬 횟수와 해당 문자열
                String[] parts = line.split(" "); // 공백으로 분리

                //반복 횟수
                int reapeatCount = Integer.parseInt(parts[0]);
                results.append(reapeatCount + " ");
                // 반복할 문자열
                String s = parts[1];


                for (int j = 0; j < s.length(); j++) { // 문자열이 ABC이면 총 3번 루프
                    char ch = s.charAt(j); // 0번째인 A 부터 실행
                  for (int k = 0; k < reapeatCount; k++) { // reapeatCount 번 반복해서 append
                      results.append(ch);
                  }
                }
                results.append("\n");
            }

             System.out.println(results.toString());

    }
}
