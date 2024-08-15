import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //возможность ввода своих значений
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите математическое выражение (например, 5+7): ");
        String expression = scanner.nextLine();

        // Разделяем выражение на части
        String[] parts = expression.split("");

        if (parts.length != 3) {
            System.out.println("Ошибка: Введите выражение в формате: число операция число");
            return;
        }

        try {

            double operand1 = Double.parseDouble(parts[0]);
            double operand2 = Double.parseDouble(parts[2]);
            char operation = parts[1].charAt(0);
            double result = 0;

            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Ошибка: делить на ноль нельзя.");
                        return;
                    } else {
                        result = operand1 / operand2;
                    }
                    break;
                default:
                    System.out.println("Ошибка: неверный символ операции. Пожалуйста используйте +, -, * или /");
                    return;
            }

            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введенные значения должны быть числами и операциями + - * /");
        }
    }
}
