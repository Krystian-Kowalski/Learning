package Unit1.Transaction;


abstract class BankTransaction {
    protected int accountBalance;
    protected int withdrawalAmount;

    private void insertCard() {
        System.out.println("Please insert card");
    }

    private void insertPin() {
        System.out.println("Please insert PIN");
    }

    private void enterAmount() {
        System.out.println("Please enter amount");
    }

    abstract protected void requestConfirmation();

    abstract protected void accountBalanceCheck();

    abstract protected void setWithdrawalAmount(int withdrawalAmount);

    abstract protected boolean withdrawalPossibilityCheck();

    abstract protected void withdrawal();

    abstract protected void thanks();

    public void run(int accountBalance, int withdrawalAmount) {
        insertCard();
        insertPin();
        enterAmount();
        requestConfirmation();
        accountBalanceCheck();
        //setWithdrawalAmount(int withdrawalAmount);
        if (withdrawalPossibilityCheck() == true) {
            withdrawal();
        }
        thanks();
    }
}

class BankTransactionRunner extends BankTransaction{

    @Override
    protected void requestConfirmation() {
        System.out.println("Access granted");
    }

    @Override
    protected void accountBalanceCheck() {
        System.out.println("Checking balance...");
        System.out.println("Your account balance is " + accountBalance);
    }

    @Override
    protected void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    protected boolean withdrawalPossibilityCheck() {
        if (accountBalance >= withdrawalAmount) {
            System.out.println("You may withdraw your assets");
            return true;
        }
        else {
            System.out.println("Sorry, your account balance is insufficient");
            return false;
        }
    }

    @Override
    protected void withdrawal() {
        System.out.println("Cash is being dispensed. Please wait");
    }

    @Override
    protected void thanks() {
        System.out.println("Thank you. Please come again");
    }
}

class Application {
    public static void main(String[] args) {

        BankTransactionRunner runner = new BankTransactionRunner();
        runner.run(1000, 1200);
    }
}