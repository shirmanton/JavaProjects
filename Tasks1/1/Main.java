public class Main {
    public static void main(String[] args) {
        MyString[] str=new  MyString[2];
        str[0]=new MyString();
        str[1]=new MyString();
        for( ; ; ){
            System.out.println("Enter 2 lines.\nStrings must be decimal numbers:");
            str[0].SetString();
            str[1].SetString();
            if(str[0].Validation() && str[1].Validation()) break;
            else System.out.println("Input error. Try again.");
        }
        System.out.println("The sum of these numbers is " + (str[0].getStringAsDouble()+str[1].getStringAsDouble()));
    }
}
