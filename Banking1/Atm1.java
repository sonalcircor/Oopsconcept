package Banking1;





public class Atm1 {

    public static void currentBalance(int balance) {
        System.out.println("Current Balance =" + balance);
    }

    public static void withdrawal(int balance, int withdrawAmount){
        if (balance>=withdrawAmount){
            System.out.println("Withdrawal Transaction");
            System.out.println("Withdrawal Amount =" + withdrawAmount);
            System.out.println("Current Balance = " + (balance - withdrawAmount));
        }
        else {
            System.out.println("Insufficient Funds");
        }

    }

    public static void deposit(int balance, int depositAmount) {
        System.out.println("Deposite Transaction");
        System.out.println("Deposite Amount =" + depositAmount);
        System.out.println("Current Balance = " + (balance + depositAmount));
    }


    public static void main(String[] args) {
        int balance = 1000;
        int withdrawAmount = 200;
        int depositAmount = 600;
        Atm1 cb = new Atm1();

        cb.currentBalance(balance);
        cb.withdrawal(balance,withdrawAmount);
        cb.deposit(balance,depositAmount);
    }
}

