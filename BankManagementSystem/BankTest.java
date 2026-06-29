import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTest{
    @Test
    void depositTest(){
        BankAccount a=new BankAccount(1,"Manav",1000);
        a.deposit(500);
        assertEquals(1500,a.getBalance());
    }

    @Test
    void withdrawTest() throws Exception{
        BankAccount a=new BankAccount(1,"Manav",1000);
        a.withdraw(200);
        assertEquals(800,a.getBalance());
    }
}