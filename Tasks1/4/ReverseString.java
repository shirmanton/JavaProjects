import java.util.Scanner;

public class ReverseString {
    private String str;
    public void setStr(){
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
    }
    public String getStr() {
        return str;
    }
    public String reverse(String str) {
        String leftPart, rightPart;
        int length = str.length();
        if (length<=1) return str;
        leftPart = str.substring(0, length/2);
        rightPart = str.substring(length/2, length);
        return reverse(rightPart) + reverse(leftPart);
    }
}
