package Calculator;
import java.util.ArrayList;

public class Calculator2 {
    // list 생성 + 선언
    private ArrayList<Integer> results = new ArrayList<Integer>();

    //생성자
    public Calculator2() {
        this.results = results;
    }

    //사칙연산 수행
    public void calculator(int number1, String operator, int number2) {

        int result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("[error] 0으로 나눌 수 없습니다. 다른 수를 입력해주세요.");
                }
                break;
        }

    }
    //결과값을 반환하는 메서드p
}     // 연산결과를 저장하는 컬렉션

