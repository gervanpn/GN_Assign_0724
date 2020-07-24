import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {
        SavingsAccount acct1 = new SavingsAccount(2000, 0);
        SavingsAccount acct2 = new SavingsAccount(3000, 0);
        balances(acct1, acct2);
        newRate = 0;
    }

    private static void balances(SavingsAccount acct1, SavingsAccount acct2) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter 1st balance ");
        acct1.setSavbal(sn.nextDouble());
        System.out.println("Enter 2nd balance ");
        acct2.setSavbal(sn.nextDouble());

        acct1.balanceInfo();
        acct2.balanceInfo();

        
    }

}
