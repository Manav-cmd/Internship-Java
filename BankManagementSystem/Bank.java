import java.util.*;

public class Bank{
    private ArrayList<BankAccount> accounts=new ArrayList<>();

    public void createAccount(int no,String name,double bal){
        accounts.add(new BankAccount(no,name,bal));
    }

    public BankAccount find(int no){
        for(BankAccount a:accounts)
            if(a.getAccountNo()==no) return a;
        return null;
    }

    public void showAccounts(){
        if(accounts.isEmpty()) System.out.println("No accounts.");
        else
            for(BankAccount a:accounts) System.out.println(a);
    }
}