package chap01.chap01_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> Solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        /*for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt--;
            }
            String stmp = String.valueOf(s);
            answer.add(stmp);
        }
        return answer;
    }

    public static void main(String [] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        for (String x : T.Solution(strs)) {
            System.out.println(x);
        }
    }
}