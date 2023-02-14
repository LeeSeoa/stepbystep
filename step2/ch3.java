package doit.one.basic.step2;

import java.util.Scanner;
/*연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.*/
/*2753번*/
public class ch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        if((A%4==0&&A%100!=0)||A%400==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
