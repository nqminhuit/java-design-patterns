package observer.subjects;

public class AccountWatcher {

    public void update(int balance) {
        if (balance >= 1_000_000) {
            System.out.println("You have too many money, please spend your money!");
        }
        else if (balance <= 10) {
            System.out.println("Your balance is starting to fall, stop spending your money!");
        }
        System.out.println("Your balance is: " + balance);
    }

}
