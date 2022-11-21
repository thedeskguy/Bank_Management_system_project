package ATM;

import java.io.IOException;
import java.util.Scanner;


public class Atm 
{
    public static void main(String[] args)throws IOException
    {
        Scanner a = new Scanner(System.in);
        int customerNumber=0;
        int pinNumber=0;
        int x = 1;
        do {
            try {
                System.out.println("Welcome to my Atm");
                System.out.println("Enter your customer number");
                customerNumber = a.nextInt();
                System.out.println("Enter your pin number");
                pinNumber = a.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid characters. \nOnly numbers. ");
                x = 2;
            }
            new Optionmenu(customerNumber,pinNumber);
        } while (x == 1);
          
    }
}
