

abstract class BankAccount{
    private String AccountHolderName;
    private double Balance;
    public BankAccount(String AccountHolderName, double Balance){
        this.AccountHolderName = AccountHolderName;
        this.Balance = Balance;
    }
    public String getAccountHolderName()
    {
        return AccountHolderName;
    }
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName = AccountHolderName;
    }
    public double Balance()
    {
        return Balance;
    }
    public abstract void displayDetails();
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
    public void deposit(double Amount){
        if(Amount>0)
        {
         Balance += Amount;
         System.out.println("The Deposited Amount : " + Amount);
        }
        else{
            System.out.println("DEPOSIT PROPERLY");
        }
    }
    public void withdraw(double Amount){
        if(Amount>0 && Amount <= Balance){
            Balance -= Amount;
            System.out.println("Withdrawal Money : " + Amount);
        }
        else{
            System.out.println("Invalid Amount");
        }
        }
    }
    class SavingsAccount extends BankAccount{
        public SavingsAccount(String AccountHolderName,double Balance){
            super(AccountHolderName, Balance);
        }
        public void displayDetails(){
            System.out.println("Savings Account");
            System.out.println("Account Holder Name:" + getAccountHolderName);
            System.out.println("Balance : " + getBalance);
            
        }
        }
    

public class Main{
    public static void main(String[] args){
        BankAccount savingsAccount = new SavingsAccount("SUBITHA, 10000");
        savingsAccount.displayDetails();
        savingsAccount.deposit(7000);
        savingsAccount.withdraw(3000);
        
    }
}