package chap01.chap01_03;

import java.util.Scanner;

public class Main {
    public String Solution(String str) {
        String answer = "";

        for (String c : str.split(" ")) {
            if (answer.length() < c.length()) {
                answer = c;
            }
        }

        /* int pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            if (tmp.length() > answer.length()) {
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if (str.length() > answer.length()) {
            answer = str;
        }*/

        return answer;
    }
    public static void main(String [] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(T.Solution(sc.nextLine()));
    }
}