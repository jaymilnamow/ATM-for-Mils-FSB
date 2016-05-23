package ATM;

import java.util.ArrayList;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class User {

    private String userName;
    private String userPassword;
    private boolean overdraftProtection;

    ArrayList<Account> Accounts = new ArrayList<>();

    public void addAccountToUser(Account account){
        Accounts.add(account);
    }

    public void removeUserAccount(Account account){
        for(int z = 0; z< Accounts.size(); z++){
            if(Accounts.get(z).equals(account)){
                Accounts.remove(account);
            }
        }
    }

    User(String userName, String userPassword, boolean overdraftProtection){
        this.userName = userName;
        this.userPassword = userPassword;
        this.overdraftProtection = overdraftProtection;

    }

    public String getPassword(){
        return userPassword;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public boolean getOverdraftProtection(){
        return overdraftProtection;
    }


}


