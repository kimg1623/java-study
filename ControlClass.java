/*
    # remind 230926
    - 조건문 : if, if~else, switch~case~default
    - 반복문 : for~, while~, do~while(조건)~
    - Scanner 클래스 사용
 */
package com.java.remind;


import java.util.Scanner;

public class ControlClass {
    public static void main(String[] args) {
        int menu = 0;
        int balance = 0;
        int tmp = 0;
        Scanner scanner = new Scanner(System.in);

        while(menu != 4){
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택>");
            String strMenu = scanner.next();
            menu = Integer.parseInt(strMenu);
            switch (menu){
                case 1:
                    System.out.println("예금액>");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.println("출금액>");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("잔고>"+balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
