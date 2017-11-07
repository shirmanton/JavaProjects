public class Main {
    public static void main(String[] args) {
        MyClass string = new MyClass();
        System.out.println("Enter 2 lines:");
        string.setStrings();
        if (string.equalsStrings()) System.out.println("Equal lines.");
        else System.out.println("Not equal lines.");
    }
}
