import java.util.*;

class ATMProject {

    static Scanner sc = new Scanner(System.in);
    static int balance = 5000;
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("---- ATM INTERFACE ----");

        while (true) {
            System.out.println("\n1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using ATM!");
                    System.exit(0);
            }
        }
    }

    static void showHistory() {
        System.out.println("\nTransaction History:");
        for (String h : history) {
            System.out.println(h);
        }
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();

        if (amt <= balance) {
            balance -= amt;
            history.add("Withdrawn: Rs." + amt);
            System.out.println("Withdraw Successful! Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amt = sc.nextInt();
        balance += amt;
        history.add("Deposited: Rs." + amt);
        System.out.println("Deposit Successful! Balance: Rs." + balance);
    }

    static void transfer() {
        System.out.print("Enter amount to transfer: ");
        int amt = sc.nextInt();
        if (amt <= balance) {
            balance -= amt;
            history.add("Transferred: Rs." + amt);
            System.out.println("Transfer Successful! Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

