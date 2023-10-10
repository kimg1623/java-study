import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
	/***
	* [요구명세]
	* 1. 계산기 클래스를 만들고(가감승제)
	* 2. 입력값: 부호, 첫번째 값, 두번째 값을 입력하면 출력되는 PG
	* 3. 입력형식 + 35 27
	* 4. 출력형식 35 + 27 = 62
	*/ 

        Calculator myCalc = new Calculator();

        System.out.println("-------------------------------------------------");
        System.out.println("계산기 프로그램 입력형식 : [부호] [첫번째 정수] [두번째 정수]");
        System.out.println("-------------------------------------------------");
        System.out.print("입력 >> ");

        Scanner scanner = new Scanner(System.in);
        String Operator = scanner.next();
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int result = 0;
        double resultDouble = 0.0;

        if(Operator.equals("/")) {
            resultDouble = myCalc.divide(x, y);
            System.out.printf("%d / %d = %.2f", x, y, resultDouble);
        }
        else {
            if (Operator.equals("+"))
                result = myCalc.plus(x,y);
            else if(Operator.equals("-"))
                result = myCalc.subtract(x,y);
            else if(Operator.equals("*"))
                result = myCalc.multiple(x,y);
            else { // 부호 4가지가 아닐 경우 프로그램 종료
                System.out.println("입력 형식이 맞지 않습니다. 프로그램 종료.");
                System.exit(1);
            }
            System.out.println(x+" "+Operator+" "+y+" = "+result);
        }
    }
}
