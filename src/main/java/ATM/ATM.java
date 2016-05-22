package ATM;

import java.util.HashMap;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class ATM {

//    public String menuList<>{}

    public HashMap<String,User> createdUserHashMap = new HashMap<String, User>();

    public double withdrawal(Accounts account, double amount){
        account.transactionHistory.add(account.transactions.recordWithdrawal(amount));
        account.setAccountBalance(account.getAccountBalance() - amount);
        return account.getAccountBalance();
    }

    public double deposit(Accounts account, double amount){
        account.transactionHistory.add(account.transactions.recordDeposit(amount));
        account.setAccountBalance(account.getAccountBalance() + amount);
        return account.getAccountBalance();
    }

    public double transfer(Accounts accountA, Accounts accountB, double amount){
        accountA.transactionHistory.add(accountA.transactions.recordTransfer(amount));
        accountA.setAccountBalance(accountA.getAccountBalance() + amount);
        accountB.setAccountBalance(accountB.getAccountBalance() - amount);
        return accountA.getAccountBalance();
    }

    public double checkBalance(Accounts accountA){
        System.out.println(accountA.getAccountBalance());
        return accountA.getAccountBalance();
    }

    public void createUser(String userName, String password, boolean overdraftProtection){
        createdUserHashMap.put(userName, new User(userName,password,overdraftProtection));
    }

    public User findUser(String userName){
        return (User)createdUserHashMap.get(userName);
    }

    public boolean verifyUser(String userName, String password){
        if(findUser(userName).getPassword().equals(password)){
            return true;
        } else {
            return false;
        }
    }

    public String printTransaction;

    public void printTransactionHistory(Accounts account){
        for(int i=0; i<account.transactionHistory.size(); i++){
            printTransaction += account.transactionHistory.get(i);
        }
        System.out.println(printTransaction);
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
