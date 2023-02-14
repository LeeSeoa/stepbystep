package doit.one.basic.step2;

import java.util.Scanner;
/*흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.*/
/*14681번*/
public class ch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if (0<x){
            if(0<y) {
                System.out.println("1");
            }else{
                System.out.println("4");
            }
        } else{
            if (0<y){
                System.out.println("2");
            }else{
                System.out.println("3");
            }

        }
    }
}
