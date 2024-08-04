package ATM_Interface;

public class BankAccount {

    //account balance
    private int balance;

    //constructor
    public BankAccount(int balance){
        this.balance=balance;
    }

    //withdraws cash from the account
    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient funds");
        }
        else{
            balance-=amount;
        }
    }

    //deposits cash into the account
    public void deposit(int amount){
        balance+=amount;
    }

    //check balance
    public int getBalance(){
        return balance;
    }
}
