public class Main {
    public static void main(String[] args) {
        IP myIP = new IP();
        if (myIP.checkAddresses()) System.out.println("Addresses belong to the same mask");
        else System.out.println("Addresses don't belong to the same mask");
    }
}
