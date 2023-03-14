package chap01.chap01_07;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        /*
        String answer = "";
        str = str.toUpperCase();
        char[] x = str.toCharArray();
        int lt = 0, rt = str.length() -1;
        while (lt < rt) {
            if (x[lt] == x[rt]) {
                answer = "YES";
                lt++;
                rt--;
            }
            else {
                answer = "NO";
                break;
            }
        }*/

        /*
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }*/

        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String [] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(T.solution(sc.next()));
    }
}