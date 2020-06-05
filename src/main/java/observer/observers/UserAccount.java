package observer.observers;

import observer.subjects.AccountWatcher;

public class UserAccount {

    private int balance;

    private AccountWatcher watcher = new AccountWatcher();

    public int getBalance() {
        return this.balance;
    }

    public void credit(int amount) {
        this.balance += amount;
        watcher.update(this.balance);
    }

    public void debit(int amount) {
        this.balance -= amount;
        watcher.update(this.balance);
    }
}
