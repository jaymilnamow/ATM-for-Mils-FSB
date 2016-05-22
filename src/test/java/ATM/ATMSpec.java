package ATM;

import ATM.Accounts;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by jaymilnamow on 5/19/16.
 */
public class ATMSpec {

    Accounts testAccount;
    Accounts testAccount2;
    ATM testATM = new ATM();

    @Before
    public void initialize(){
        testAccount = new Accounts();
        testAccount2 = new Accounts();
        testAccount.setAccountBalance(1500.00);
        testAccount2.setAccountBalance(1500.00);
    }

    @Test
    public void withdrawalTest(){
        testATM.withdrawal(testAccount,500.00);
        double expectedValue = 1000.00;
        double actualValue = testAccount.getAccountBalance();
        assertEquals("Expected value should be equal to 1000.00",expectedValue,actualValue,Math.ulp(.0001));
    }

    @Test
    public void depositTest(){
        testATM.deposit(testAccount,500.00);
        double expectedValue= 2000.00;
        double actualValue = testAccount.getAccountBalance();
        assertEquals("Expected value should be equal to 2000.00",expectedValue,actualValue,Math.ulp(.0001));
    }

    @Test
    public void transferTest(){
        testATM.transfer(testAccount, testAccount2, 500.00);
        double expectedAccountValue = 2000.00;
        double expectedAccount2Value = 1000.00;
        double actualAccountValue = testAccount.getAccountBalance();
        double actualAccount2Value = testAccount2.getAccountBalance();
        assertEquals("Expected Account value should be equal to 2000.00", expectedAccountValue,actualAccountValue,Math.ulp(.0001));
        assertEquals("Expected Account value should be equal to 1000.00", expectedAccount2Value,actualAccount2Value,Math.ulp(.0001));
    }

    @Test
    public void checkBalanceTest(){
        testATM.checkBalance(testAccount);
        double expectedValue = 1500.00;
        double actualValue = testAccount.getAccountBalance();
        assertEquals("Expected value should be 1500.00", expectedValue, actualValue, Math.ulp(.0001));
    }


}
