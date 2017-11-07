import java.util.Scanner;

public class Calculator {
    private double firstNum;
    private double secondNum;
    private int operation;

    public void SetValue() {
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextDouble();
        secondNum = scanner.nextDouble();
    }

    public void ChooseOperation() {
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextInt();
    }

    public double CalcExpression() {
        switch (operation) {
            case 1:
                return firstNum + secondNum;
            case 2:
                return firstNum - secondNum;
            case 3:
                return firstNum * secondNum;
            case 4:
                return firstNum / secondNum;
            default:
                System.out.println("Error. Select menu item 1 to 4:");
                ChooseOperation();
                return CalcExpression();
        }
    }
}
