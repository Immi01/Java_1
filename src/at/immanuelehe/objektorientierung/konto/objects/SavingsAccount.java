package at.immanuelehe.objektorientierung.konto.objects;

public class SavingsAccount extends BaseAccount{

    private float interestRate;

    public SavingsAccount(float balance, float interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(float amount) throws Exception{
        if (amount % 0.01f != 0) {
            amount = Math.round(amount * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + amount + " €");
        }
        if(amount > 0f) {
            if (amount < getBalance())
                withdraw(amount);
            else
                throw new Exception("Withdrawn amount cannot exceed Balance");
        } else {
            throw new Exception("Entered value too low");
        }
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        if (interestRate % 0.01f != 0) {
            interestRate = Math.round(interestRate * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + interestRate + " €");
        }
        this.interestRate = interestRate;
    }

}
