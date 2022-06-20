import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите три числа: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number1 = 0;
            int number2 = 0;
            int number3 =0;
            int result = 0;

            try {
                number1 =  Integer.parseInt(reader.readLine());
                number2 =  Integer.parseInt(reader.readLine());
                number3 =  Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.print("Error: " + e.getMessage());
            }
            System.out.println("Введите знак операции: ");
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String sing = "";
            try {
                sing = read.readLine();
            } catch (IOException e) {
                System.out.println("Error" + e.getMessage());
            }

            switch (sing) {
                case "+": {
                    result = number1 + number2 + number3;
                    break;
                }
                case "+*": {
                    result = number1 + number2 * number3;
                    break;
                }
                case "*+": {
                    result = number1 * number2 + number3;
                    break;
                }
                case "-": {
                    result = number1 - number2 - number3;
                    break;
                }
                case "-+": {
                    result = number1 - number2 + number1;
                    break;
                }
                case "*": {
                    result = number1 * number2 * number3;
                    break;
                }
                case "*/": {
                    result = number1 * number2 / number3;
                    break;
                }
                case "/*": {
                    result = number1 / number2 * number3;
                    break;
                }
                case "/": {
                    result = number1 / number2 / number3;
                    break;
                }
                case "+-": {
                    result = number1 + number2 - number3;
                    break;
                }
                case "*-": {
                    result = number1*number2-number3;
                    break;
                }
            }
            System.out.println(result);
            System.out.println("P.S: Это все, что я сейчас умею, но хочу знать и уметь больше!");
            System.out.println("I would like to be Java developer");
        }
    }
}
