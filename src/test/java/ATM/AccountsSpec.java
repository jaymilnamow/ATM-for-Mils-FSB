package ATM;

import ATM.Accounts;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class AccountsSpec {

    Accounts testAccount;
    @Before
    public void initialize() {
        testAccount = new Accounts();
        testAccount.setAccountBalance(1500.00);
    }

    @Test
    public void setAccountBalanceTest(){
        double expectedValue = 1500.00;
        double actualValue = testAccount.getAccountBalance();
        assertEquals("Expected value should be equal to 1500.00",expectedValue,actualValue,Math.ulp(.0001));
    }

}

