package ATM;
import java.util.Scanner;
abstract class Account 
{
    int customerNumber;
    int pinNumber;
    protected double checkingBalance = 0;
    protected double savingBalance = 0;

    abstract void getChecking();

    abstract void getAccountType();

    abstract void getSaving();

    Scanner input = new Scanner(System.in);
    Account(int customerNumber,int pinNumber)
    {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
    }
    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }
    public double calcCheckingWithdrawn(double amount)
    {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdrawn(double amount)
    {
        savingBalance = savingBalance - amount;
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount)
    {
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount)
    {
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput()
    {
        System.out.printf("Checking account balance %.2f\n",checkingBalance);
        System.out.println("Amount you want to withdraw");
        double amount = input.nextDouble();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdrawn(amount);
            System.out.printf("remaining balance %.2f\n",checkingBalance);
        } else {
            System.out.println("Not enough money");
        }
    }
    public void getSavingWithdrawInput()
    {
        System.out.printf("Saving account balance %.2f\n",savingBalance);
        System.out.println("Amount you want to withdraw");
        double amount = input.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingWithdrawn(amount);
            System.out.printf("remaining balance %.2f\n",savingBalance);

        } else {
            System.out.println("Not enough money");
        }
    }
    public void getCheckingDepositInput()
    {
        System.out.printf("Checking account balance %.2f\n", checkingBalance);
        System.out.println("Amount you want to deposit");
        double amount = input.nextInt();
        calcCheckingDeposit(amount);
        System.out.printf("New balance %.2f\n",checkingBalance);
    }
    public void getSavingDepositInput()
    {
        System.out.printf("Saving account balance %.2f\n", savingBalance);
        System.out.println("Amount you want to deposit");
        double amount = input.nextInt();
        calcSavingDeposit(amount);
        System.out.printf("New balance %.2f\n",savingBalance);
    }
}
