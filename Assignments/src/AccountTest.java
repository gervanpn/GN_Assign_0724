import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {
        SavingsAccount acct1 = new SavingsAccount(2000, 0, 0);
        SavingsAccount acct2 = new SavingsAccount(3000, 0, 0);
        balances(acct1, acct2);
    }

    private static void balances(SavingsAccount acct1, SavingsAccount acct2) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter 1st balance ");
        acct1.setSavingsBalance(sn.nextDouble());
        System.out.println("Enter 2nd balance ");
        acct2.setSavingsBalance(sn.nextDouble());

        acct1.balanceInfo();
        acct2.balanceInfo();

        System.out.println("Enter the new rate ");
        acct1.setNewRate(sn.nextDouble());

        acct1.modifyInterestRate(0.05);
        acct2.modifyInterestRate(0.05);
        acct1.calculateMonthlyInterest();
        acct2.calculateMonthlyInterest();

        acct1.balanceInfo();
        acct2.balanceInfo();
    }





}
