package at.immanuelehe.objektorientierung.konto.objects;

public class CreditAccount extends BaseAccount{

    private float interestRate;

    public CreditAccount(float balance, float interestRate) {
        super(balance);
        if (interestRate % 0.01f != 0) {
            interestRate = Math.round(interestRate * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + interestRate + " €");
        }
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(float amount) throws Exception {
        System.out.println("You cannot withdraw money from a Credit Account.");
    }

}
