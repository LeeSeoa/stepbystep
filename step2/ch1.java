package doit.one.basic.step2;

import java.util.Scanner;

/*두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.*/
public class ch1{
    public static void main(String[] args) {
        /*1 2*/
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if (A>B){
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");
        }else{
            System.out.println("==");
        }

    }
}
