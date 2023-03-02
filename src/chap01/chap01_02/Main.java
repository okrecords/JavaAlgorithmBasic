package chap01.chap01_02;

import java.util.Scanner;

public class Main {
    public String Solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        /*for (char x : str.toCharArray()) {
            // 대문자 ASCII 65~90
            // 소문자 ASCII 97~122
            if (x >= 65 && x <= 90) answer += (char)(x+32);
            else answer += (char)(x-32);
        }*/

        return answer;
    }
    public static void main(String [] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}