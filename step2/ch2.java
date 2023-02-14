package doit.one.basic.step2;

import java.util.Scanner;

/*9498번 시험성적*/
public class ch2 {
    /*첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        if (90 <= A && A<=100){
            System.out.println("A");
        } else if (80 <= A) {
            System.out.println("B");
        } else if (70 <= A) {
            System.out.println("C");
        } else if (60 <= A) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
