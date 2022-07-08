package BankInterface22;

public class Main {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        try {
            System.out.println("printing 13month" + bankA.getMiniStatement());

        } catch (Exception e) {
            System.out.println("exception error handled");
        }
    }
}
