package Calculator;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2(); //calculator 객체 생성
        Scanner scanner = new Scanner(System.in);//스캐너 객체 생성
        boolean continueCalculator = true;

        while (continueCalculator) {
            int number1 = 0;
            boolean input1 = false;

            boolean oper = false;
            String operator;

            int number2 = 0;
            boolean input2 = false;

            // 첫번째 정수 입력받기
            while (!input1) {
                System.out.println();
                System.out.print("-> 첫번째 숫자를 입력해주세요 : ");
                // hasNextInt() : Scanner에서 정수를 입력받은 경우 true, 입력받지 않는 경우 false의 값을 반환받는 메소드.
                if (scanner.hasNextInt()) {
                    number1 = scanner.nextInt();
                    input1 = true;
                } else {
                    System.out.println("[error] 올바른 값을 입력해주세요.");
                    scanner.next();
                }
            }

            // 연산자 입력받기
            do {
                System.out.println();
                System.out.print("-> 연산자를 입력해주세요.(+, -, *, /) :");
                //char는 스캐너로 바로 입력 받는 방법이 없기 때문에, string을 통해 스캐너로 먼저 받고 charAt(0)로 char형으로 바꿔주기
                operator = scanner.next(); // 연산자 입력 받기
                char c = operator.charAt(0);

                if (number1 == 0 && operator.equals("/")) {
                    System.out.println("[error] 0으로 나눌 수 없습니다. 다른 연산자를 입력해주세요.");
                } else if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    oper = true;
                } else {
                    System.out.println("[error] 올바른 값을 입력해주세요.");
                }
            } while (!oper);


            // 두번째 정수 입력받기
            while (!input2) {
                System.out.println();
                System.out.print("-> 두번째 숫자를 입력해주세요 : ");
                // hasNextInt() : Scanner에서 정수를 입력받은 경우 true, 입력받지 않는 경우 false의 값을 반환받는 메소드.
                if (scanner.hasNextInt()) {
                    number2 = scanner.nextInt();
                    if (number2 == 0 && operator.equals("/")) {
                        System.out.println("[error] 0으로 나눌 수 없습니다. 다른 수를 입력해주세요.");
                    } else {
                        input2 = true;
                    }
                } else {
                    System.out.println("[error] 올바른 값을 입력해주세요.");
                    scanner.next();
                }
            }

            // 결과값
            System.out.println();
            System.out.println("<결과값>");

            switch (operator) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    System.out.println(number1 / number2);
                    break;
            }

            boolean response = false;

            while (!response) {
                System.out.println();
                System.out.print("계산을 더 진행하시겠습니까? (계속 진행 → 'Yes'를 입력 / 종료하기 → 'exit'을 입력) : ");
                String userinput = scanner.next();

                if (userinput.equalsIgnoreCase("exit")) {
                    continueCalculator = false;
                    response = true;
                    System.out.println("계산을 종료합니다.");
                } else if (userinput.equalsIgnoreCase("yes")) {
                    response = true;
                } else {
                    System.out.println("[error] 올바른 값을 입력해주세요.");
                }
            }

        }
        scanner.close();
    }
}
