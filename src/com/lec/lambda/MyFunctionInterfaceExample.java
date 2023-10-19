package com.lec.lambda;

/**
 * 다양한 함수형 인터페이스를 람다식으로 활용하기
 * 1) 매개변수와 리턴값이 없는 람다식
 * 2) 매개변수가 있는 람다식
 * 3) 리턴값이 있는 람다식
 */
@FunctionalInterface
interface MyFunctionInterface { /* 1) 매개변수와 리턴값이 없는 람다식 */
    public void method();
}
@FunctionalInterface
interface MyFunctionInterface2 { /* 2) 매개변수가 있는 람다식 */
    public void method(int x);
}
@FunctionalInterface
interface MyFunctionInterface3 { /* 3) 리턴값이 있는 람다식 */
    public int method(int x, int y);
}

public class MyFunctionInterfaceExample {
    public static void main(String[] args) {
        /**
         *   1) 매개변수와 리턴값이 없는 람다식
         */
        MyFunctionInterface fi; // 함수형 인터페이스 선언
        fi = ()->{
            String str = "method call1";
            System.out.println(str);
        };  // 람다식은 마칠 때 세미콜론;필수
        fi.method();

        fi = ()->{ System.out.println("method call2"); };
        fi.method();

        fi = ()->System.out.println("method call3"); // 실행문이 한 줄이면 중괄호 생략 가능
        fi.method();

        /**
         *   2) 매개변수가 있는 람다식
         */
        MyFunctionInterface2 fi2; // 매개변수가 1개 있는 함수가 정의된 함수형 인터페이스 선언

        fi2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi2.method(2);

        fi2 = (x)-> System.out.println(x*5); // 실행문이 한 줄이면 중괄호 생략 가능
        fi2.method(3);

        fi2 = x -> System.out.println(x*5); // 매개변수가 하나라면 매개변수 소괄호도 생략 가능
        fi2.method(4);

        /**
         *   3) 리턴값이 있는 람다식
         */
        MyFunctionInterface3 fi3; // 매개변수가 2개, 리턴값이 있는 함수가 정의된 함수형 인터페이스 선언

        fi3 = (x, y) ->{
            int result = x + y;
            return result;
        };
        System.out.println(fi3.method(2,5));

        fi3 = (x, y) -> { return x + y; }; // 지역변수 사용 없이 바로 return 사용 가능
        System.out.println(fi3.method(3,5));

        fi3 = (x, y) -> x + y; // 실행문이 return 한 줄일 경우 중괄호와 return 생략 가능
        System.out.println(fi3.method(4,5));

        fi3 = (x, y) -> sum(x, y); // 람다식 실행문에 사용자 정의 메서드 사용 가능
        System.out.println(fi3.method(5,5));
    }
    public static int sum(int x, int y){
        return (x+y);
    }
}
