package chap01.chap01_01;

import java.util.Scanner;

public class Main {
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        //System.out.println(str+" "+c);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==c) answer++;
		}*/
        for(char x : str.toCharArray()){
            if(x == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}