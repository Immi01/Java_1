package at.immanuelehe.objektorientierung.konto.objects;

public class CheckingsAccount extends BaseAccount{

    private float limit;
    private float interestRate;
    private float overdraftInterest;

    public CheckingsAccount(float balance, float limit, float interestRate, float overdraftInterest) {
        super(balance);
        this.limit = round(limit);
        this.interestRate = round(interestRate);
        this.overdraftInterest = round(overdraftInterest);
    }

    @Override
    public void withdraw(float amount) throws Exception{
        amount = round(amount);
        if(amount > 0f) {
            if (amount < getBalance()-limit) {
                withdraw(amount);
                if (getBalance() < 0)
                    System.out.println("Warning, you went bellow zero.");
            } else {
                throw new Exception("Withdrawn amount cannot exceed Balance");
            }
        } else {
            throw new Exception("Entered value too low");
        }
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = round(limit);
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = round(interestRate);
    }

    public float getOverdraftInterest() {
        return overdraftInterest;
    }

    public void setOverdraftInterest(float overdraftInterest) {
        this.overdraftInterest = round(overdraftInterest);
    }

    private float round(float toRound) {
        if (toRound % 0.01f != 0) {
            toRound = Math.round(toRound * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + toRound + " €");
        }
        return toRound;
    }

}
