// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;

public class calculator_03 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        double previousResult = 0;
        char previousOperator = ' ';

        while (true) {

            double num1;
            if (previousResult == 0) {
                System.out.println("Введите первое число:");
                num1 = iScanner.nextDouble();
            } else {
                System.out.println("Введите первое число или оставьте поле пустым для использования предыдущего результата " + previousResult + ":");
                String input = iScanner.nextLine();
                if (input.isEmpty()) {
                    num1 = previousResult;
                } else {
                    num1 = Double.parseDouble(input);
                }
            }

            System.out.println("Введите второе число:");
            double num2 = iScanner.nextDouble();

            System.out.println("Выберите операцию (+, -, *, /):");
            char operator = iScanner.next().charAt(0);

            double result;
            iScanner.close();

            if (operator == 'c') {
                // отмена предыдущей операции
                operator = previousOperator;
                num2 = previousResult;
                previousResult = num1;
            } else {
                switch(operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Неверный оператор!");
                        return;
                }

                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

                previousResult = result;
                previousOperator = operator;
            }
        }
    }
}