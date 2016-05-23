package ATM;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class UserSpec {

    Account testAccount = new Account("Lauren");
    User testUser = new User("Jay","dkjhgfkjhdg",false);

    @Test
    public void addUserAccountTest(){
        testUser.addAccountToUser(new Account("Jay"));
        String expectedValue = "Jay";
        String actualValue = testUser.getUserName();
        assertEquals("Expected UserName should be Jay",expectedValue,actualValue);
    }

    @Test
    public void removeUserAccountTest(){
    User testUser1 = new User("Lauren","82872737",true);
        testUser1.addAccountToUser(testAccount);
        testUser1.removeUserAccount(testAccount);
        assertEquals(0,testUser1.Accounts.size());
    }
}
