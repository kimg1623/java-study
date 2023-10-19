package com.lec.lambda;

/**
 * 람다식 활용1: 사용자 정의 메소드와 함수형 인터페이스를 람다식으로 사용하기
 * @FunctionalInterface interface Calculable
 */
public class LambdaExample {
    public static void main(String[] args) {
        action((x,y)->{
           int result = x+y;
            System.out.println("result: "+result);
        });
        action((x,y)->{
            int result = x-y;
            System.out.println("result: "+result);
        });
    }
    /* 사용자 정의 메소드: 매개 변수로 함수형 인터페이스를 사용함 */
    public static void action(Calculable calculable){
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}
