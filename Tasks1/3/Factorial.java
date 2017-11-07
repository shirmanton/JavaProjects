import java.util.Scanner;

public class Factorial {
    private int num;
    private int result =1;
    public void SetValue(){
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num<0){
            System.out.println("Error. The number must be positive.");
            SetValue();
        }
    }
    public int GetValue(){
        return num;
    }
    public int CalcFactorial(){
        if (num==0) return result;
        result *= num;
        num--;
        return CalcFactorial();
    }
}
