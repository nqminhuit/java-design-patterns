package observer;

import observer.observers.UserAccount;

public class App {

    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount();
        userAccount.credit(1_000_000);
        userAccount.debit(1_000_000);
    }

}
