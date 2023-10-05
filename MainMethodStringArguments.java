public class MainMethodStringArguments {
    public static void main(String[] args) {
        // 프로그램 입력 값의 길이 검증
        if(args.length != 3){
            System.out.println("프로그램 입력 값은 3개가 필요");
            System.out.println("[숫자] [숫자] [문자열] 형식으로 입력하세요");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];
        String str3 = args[2];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println("입력한 문자열: "+str3);
    }
}