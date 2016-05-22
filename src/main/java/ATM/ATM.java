package ATM;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class ATM {

//    public String menuList<>{}


    public double withdrawal(Accounts account, double amount){
        account.setAccountBalance(account.getAccountBalance() - amount);
        return account.getAccountBalance();
    }

    public double deposit(Accounts account, double amount){
        account.setAccountBalance(account.getAccountBalance() + amount);
        return account.getAccountBalance();
    }

    public double transfer(Accounts accountA, Accounts accountB, double amount){
        accountA.setAccountBalance(accountA.getAccountBalance() + amount);
        accountB.setAccountBalance(accountB.getAccountBalance() - amount);
        return accountA.getAccountBalance();
    }

    public double checkBalance(Accounts accountA){
        System.out.println(accountA.getAccountBalance());
        return accountA.getAccountBalance();
    }

    public void createUser(User accountHolderName, String userName, String password){

    }

 /*   public boolean verifyUser(String userName, String password){

        return loginStatus;
    } */

    public String printTransactionHistory(String userName){
        return null;
    }

 /*   public String logTransaction(String userName, Accounts accounts, String timeStamp, double amount User userName){
        return transaction;
    } */

    public boolean verifyAccount(String userName, String password){
        return false;
    }

    public void freezeAccount(){

    }

}
