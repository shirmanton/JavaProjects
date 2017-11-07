public class Main {
    public static void main(String[] args) {
	    ReverseString string = new ReverseString();
	    System.out.println("Enter the line:");
	    string.setStr();
	    System.out.println("Inverted string:\n" + string.reverse(string.getStr()));
    }
}