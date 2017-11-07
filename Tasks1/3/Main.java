public class Main {
    public static void main(String[] args) {
	    Factorial factorial = new Factorial();
        System.out.println("Enter an integer decimal number:");
        factorial.SetValue();
        System.out.println("The factorial of the number " + factorial.GetValue() + " is " + factorial.CalcFactorial());
    }
}
