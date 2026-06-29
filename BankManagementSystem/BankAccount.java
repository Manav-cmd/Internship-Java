import java.util.*;

public class BankAccount{
    private int accountNo;
    private String holder;
    private double balance;
    private List<Transaction> history=new ArrayList<>();

    public BankAccount(int accountNo,String holder,double balance){
        this.accountNo=accountNo;
        this.holder=holder;
        this.balance=balance;
        history.add(new Transaction("Account Created",balance));
    }

    public int getAccountNo(){ return accountNo; }
    public String getHolder(){ return holder; }
    public double getBalance(){ return balance; }

    public void deposit(double amount){
        balance+=amount;
        history.add(new Transaction("Deposit",amount));
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance) throw new InsufficientFundsException("Insufficient Balance");
        balance-=amount;
        history.add(new Transaction("Withdraw",amount));
    }

    public void transfer(BankAccount other,double amount) throws InsufficientFundsException{
        withdraw(amount);
        other.deposit(amount);
        history.add(new Transaction("Transfer To "+other.getAccountNo(),amount));
    }

    public void printHistory(){
        for(Transaction t:history) System.out.println(t);
    }

    public String toString(){
        return "Account No: "+accountNo+" | Holder: "+holder+" | Balance: Rs. "+balance;
    }
}