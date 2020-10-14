package Unit1.ATM;


interface ATM {
    void deposit(int cashIn);
    void withdrawal(int cashOut);

    default void bankConnection() {
        System.out.println("Connecting to the network. Please wait");
    }

    static void shutDown() {
        System.out.println("Transaction complete. Please remember to take your card");
    }

}

class ATMImpl implements ATM{
    private int totalBalance;


    @Override // To check if the method is included in the interface and the method is defined with the same access protocol and type etc.
    public void deposit(int cashIn) throws IllegalArgumentException{
        bankConnection();
        if (cashIn <=0)  {
            System.out.println("Wrong deposit amount");
            throw new IllegalArgumentException("Wrong deposit amount");
        }
        System.out.println("Gimme yo money");
        System.out.println("The sum of " + cashIn + " was deposited");
        totalBalance = totalBalance + cashIn;
        ATM.shutDown();
    }

    @Override
    public void withdrawal(int cashOut) {
        bankConnection();

        if (cashOut <= 0) {
            System.out.println("Wrong withdrawal amount");
            throw new IllegalArgumentException("Wrong withdrawal amount");
        }

        if ((totalBalance - cashOut) >= 0) {
            totalBalance = totalBalance - cashOut;
        } else {
            System.out.println("Not enough cash. Please change the amount");
            throw new IllegalArgumentException("Not enough cash. Please change the amount");
        }
        System.out.println(totalBalance + " is left in your account");
        System.out.println("Get your " + cashOut + " worth of cash and leave!");
        ATM.shutDown();
    }

}

class App {
    public static void main (String[] args) {
        ATM atm = new ATMImpl();
        atm.deposit(150);
        atm.withdrawal(100);
    }
}
