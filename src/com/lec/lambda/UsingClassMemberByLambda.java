package com.lec.lambda;

/**
 * 클래스 멤버 내부에 정의된 람다식을 실행하며 접근하는 변수 알아보기
 * interface MyFunctionalInterface : 함수형 인터페이스
 * class UsingThis : 외부 클래스
 * class Inner : UsingThis 클래스의 멤버, 내부 클래스
 */
@FunctionalInterface
interface MyFunctionalInterface {
    public void method();
}

class UsingThis {
    public int outterField = 10;    // 외부 필드

    class Inner{                    // 내부 클래스
        int innerField = 20;        // 내부 필드

        void method() {
            //람다식
            MyFunctionInterface fi = () ->{
                System.out.println("outterField: " + outterField);
                System.out.println("outterField: " + UsingThis.this.outterField + "\n"); //클래스명 this를 사용

                System.out.println("innerField: " + innerField);
                System.out.println("innerField: " + this.innerField + "\n"); //람다식 내부에서 this 는 inner 객체를 참조
            };
            fi.method();
        }
    }

}

public class UsingClassMemberByLambda {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();

        inner.method();
//        ===실행 결과===
//        outterField: 10  // usingThis의 outterField
//        outterField: 10  // inner의 부모 객체에서 디폴트로 생성된 outterField
//
//        innerField: 20   // inner의 innerField
//        innerField: 20   // inner의 innerField
    }
}
