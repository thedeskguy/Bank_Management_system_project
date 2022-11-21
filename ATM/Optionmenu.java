package ATM;
import java.util.Scanner;
public class Optionmenu extends Account
{
    Scanner a = new Scanner(System.in);
    int selection;
    int customerNumber;
    int pinNumber;
    Optionmenu(int customerNumber,int pinNumber)
    {
        super(customerNumber, pinNumber);
        getAccountType();
    }
    void getAccountType()
    {
        System.out.println("select the account you want to access");
        System.out.println("1.Checking");
        System.out.println("2.Savings");
        System.out.println("3.Exit");
        selection = a.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you ");
                break;
            default:
                System.out.println("Invalid choice");
                getAccountType();
                break;
        }
    }
    void getChecking()
    {
        System.out.println("Checking Account");
        System.out.println("1.View balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        selection = a.nextInt();
        switch (selection) {
            case 1:
                System.out.printf("Account Balance %.2f\n",checkingBalance);
                getChecking();
                break;
            case 2:
                getCheckingWithdrawInput();
                getChecking();
                break;
            case 3:
                getCheckingDepositInput();
                getChecking();
                break;
            case 4:
                getAccountType();
                break;
            default:
                System.out.println("Invalid choice");
                getChecking();
                break;
        }
    }
    void getSaving()
    {
        System.out.println("Saving Account");
        System.out.println("1.View balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        selection = a.nextInt();
        switch (selection) 
        {
            case 1:
            System.out.printf("Account Balance %.2f\n",savingBalance);
                getSaving();
                break;
            case 2:
                getSavingWithdrawInput();
                getSaving();
                break;
            case 3:
                getSavingDepositInput();
                getSaving();
                break;
            case 4:
                getAccountType();
                break;
            default:
                System.out.println("Invalid choice");
                getSaving();
                break;
        }
    }
}