import java.util.Scanner;

/** @author Anastasiya Dolgova
 * @see #getOperation() 
 * @see #calc(double, double, char) 
 */

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.printf("Результат операции: "+ "%.4f", result);
    }

    public static char getOperation(){
        // This method get operation for calculator
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Операция некорректная. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

/** @param num1,num2 input numbers
* @return result of operation
*/
    public static double calc(double num1, double num2, char operation){
    //This method get result of calculator operation
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}