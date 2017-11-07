import java.util.Scanner;

public class MyString {
    private String str;
    public void SetString(){
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
    }
    public double getStringAsDouble(){
        return Double.parseDouble(str);
    }
    public boolean Validation(){
        for(int i =0; i<str.length(); i++){
            if (str.charAt(i)<46 ||str.charAt(i)==47||str.charAt(i)>57) return false;
            else if(i==0) if (str.charAt(0)==46||str.charAt(0)==48) return false;
        }
        return true;
    }
}
