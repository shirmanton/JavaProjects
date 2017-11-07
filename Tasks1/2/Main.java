public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enter 2 numbers:");
        calculator.SetValue();
        System.out.println("Select arithmetic operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        calculator.ChooseOperation();
        System.out.println("Result is " + calculator.CalcExpression());
    }
}
