public class SavingsAccount {

    private double anIntRate;
    private double savingsBalance;
    private double intEarned;
    private double endBalance;
    public SavingsAccount(double savbal, double air) {
        air = 0.04;
        anIntRate = air;
        savingsBalance = savbal;
        intEarned = 0.0;
        endBalance = 0.0;
    }

    public double getSavbal() {
        return savingsBalance;
    }
    public double getAnnInt() {
        return anIntRate;
    }
    public double getIntEarn() {
        return intEarned;
    }

    public double getEndbal() {
        return endBalance;
    }

    public void setSavbal(double savbal) {
        savingsBalance = savbal;
        calculateMonthlyInterest();
    }

    public void setAnitrt(double aninrt) {
        anIntRate = aninrt;
    }

    public void calculateMonthlyInterest() {
        intEarned = ((savingsBalance * anIntRate)/12);
        endBalance = savingsBalance + intEarned;
    }

    public void modifyInterestRate(double newRate) {
        anIntRate = newRate;
    }

    public void balanceInfo() {
        System.out.println("Account Balance is: " + savingsBalance + " Interest Earned " + intEarned + " End Balance " + endBalance);
    }
}
