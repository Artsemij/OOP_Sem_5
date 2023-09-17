import java.util.Scanner;

public class CalculatorView {
private Scanner scanner;

public CalculatorView() {
scanner = new Scanner(System.in);
}

public void displayMenu() {
System.out.println("=== Калькулятор комплексных чисел ===");
System.out.println("Выберите операцию:");
System.out.println("1. Сложение");
System.out.println("2. Вычитание");
System.out.println("3. Умножение");
System.out.println("4. Деление");
System.out.println("0. Выйти");
}

public int getOperationChoice() {
System.out.print("Ваш выбор: ");
return scanner.nextInt();
}

public ComplexNumber readComplexNumber() {
System.out.print("Действительная часть: ");
double real = scanner.nextDouble();
System.out.print("Мнимая часть: ");
double imaginary = scanner.nextDouble();
return new ComplexNumber(real, imaginary);
}

public void displayResult(ComplexNumber result) {
System.out.println("Результат: " + result);
}

public void displayErrorMessage(String message) {
System.out.println("Ошибка: " + message);
}
}
