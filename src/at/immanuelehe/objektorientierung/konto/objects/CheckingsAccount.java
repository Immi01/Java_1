package at.immanuelehe.objektorientierung.konto.objects;

public class CheckingsAccount extends BaseAccount{

    private float limit;
    private float interestRate;

    public CheckingsAccount(float balance, float limit, float interestRate) {
        super(balance);
        if (limit % 0.01f != 0) {
            limit = Math.round(limit * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + limit + " €");
        }
        if (interestRate % 0.01f != 0) {
            interestRate = Math.round(interestRate * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + interestRate + " €");
        }
        this.limit = limit;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(float amount) throws Exception{
        if (amount % 0.01f != 0) {
            amount = Math.round(amount * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + amount + " €");
        }
        if(amount > 0f) {
            if (amount < getBalance()-limit)
                withdraw(amount);
            if (getBalance() < 0)
                System.out.println("Warning, you went bellow zero.");
            else
                throw new Exception("Withdrawn amount cannot exceed Balance");
        } else {
            throw new Exception("Entered value too low");
        }
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
