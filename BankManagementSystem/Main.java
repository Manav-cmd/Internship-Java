import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();

        while(true){
            System.out.println("\n1.Create\n2.Deposit\n3.Withdraw\n4.Transfer\n5.Balance\n6.History\n7.View Accounts\n8.Exit");
            int ch=sc.nextInt();

            try{
                switch(ch){
                    case 1:
                        System.out.print("Account No: ");
                        int no=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Holder Name: ");
                        String name=sc.nextLine();
                        System.out.print("Opening Balance: ");
                        double bal=sc.nextDouble();
                        bank.createAccount(no,name,bal);
                        break;

                    case 2:
                        System.out.print("Account No: ");
                        BankAccount d=bank.find(sc.nextInt());
                        if(d!=null){
                            System.out.print("Amount: ");
                            d.deposit(sc.nextDouble());
                        }
                        break;

                    case 3:
                        System.out.print("Account No: ");
                        BankAccount w=bank.find(sc.nextInt());
                        if(w!=null){
                            System.out.print("Amount: ");
                            w.withdraw(sc.nextDouble());
                        }
                        break;

                    case 4:
                        System.out.print("From: ");
                        BankAccount f=bank.find(sc.nextInt());
                        System.out.print("To: ");
                        BankAccount t=bank.find(sc.nextInt());
                        if(f!=null && t!=null){
                            System.out.print("Amount: ");
                            f.transfer(t,sc.nextDouble());
                        }
                        break;

                    case 5:
                        System.out.print("Account No: ");
                        BankAccount b=bank.find(sc.nextInt());
                        if(b!=null) System.out.println("Balance = Rs. "+b.getBalance());
                        break;

                    case 6:
                        System.out.print("Account No: ");
                        BankAccount h=bank.find(sc.nextInt());
                        if(h!=null) h.printHistory();
                        break;

                    case 7:
                        bank.showAccounts();
                        break;

                    case 8:
                        System.exit(0);
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}