package chap01.chap01_06;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        /*
        for (char x : str.toCharArray()) {
            if (!answer.contains(String.valueOf(x))) answer += x;
        }*/

        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            // ksekkset
            // k 0 0
            // s 1 1
            // e 2 2
            // k 3 0
            // k 4 0
            // s 5 1
            // e 6 2
            // t 7 7
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(T.solution(sc.next()));
    }
}