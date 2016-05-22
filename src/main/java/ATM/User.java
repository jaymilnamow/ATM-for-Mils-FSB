package ATM;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class User {

    private String userName;
    private String userPassword;
    private boolean overdraftProtection;

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


