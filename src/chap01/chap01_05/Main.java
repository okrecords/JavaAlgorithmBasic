package chap01.chap01_05;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer;
        char[] x = str.toCharArray();
        int lt = 0, rt = str.length() -1;
        while (lt < rt) {
            if (!Character.isAlphabetic(x[lt])) lt++;
            else if (!Character.isAlphabetic(x[rt])) rt--;
            else {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(x);
        return answer;
    }

    public static void main(String [] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(T.solution(sc.next()));
    }
}
