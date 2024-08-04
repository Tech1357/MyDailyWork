package ATM_Interface;
import java.util.Scanner;

public class ATM {
    //User's Bank Account
    public BankAccount bankAccount;
    Scanner sc=new Scanner(System.in);

    //constructor
    public ATM(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    //Deposits Cash into ATM
    public void deposit(){
        System.out.printf("Enter the Amount you want to deposit:");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();

        deposit(amount);
    }

    //withdraws cash from ATM
    public void withdraw(){
        System.out.printf("Enter the Amount you want to withdraw:");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();

        withdraw(amount);
    }

    //Deposits Cash
    private void deposit(int amount){
        bankAccount.deposit(amount);
        System.out.println("Amount deposited Successfully "+amount);
    }

    //Withdraws Cash
    private void withdraw(int amount){
        if(bankAccount.getBalance() < amount){
            System.out.println("Insufficient Funds");
        }
        else{
            bankAccount.withdraw(amount);
            System.out.println("Amount withdrawed successfully "+amount);
        }
    }
    private void checkBalance(){
        System.out.println("Your Account Balance is: "+bankAccount.getBalance());
    }
    public static void main(String args[]){
        BankAccount bankAccount=new BankAccount(0);
        ATM atm=new ATM(bankAccount);

        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("ATM MENU");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.printf("Please Enter ur choice: ");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    atm.deposit();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice<=4);

        sc.close();
    }
}
