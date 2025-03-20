
public class StoreOneA extends StoreToRent {
    public void showStoreInfo() {
        System.out.println(toString());
    }

    private boolean specialCustomer;
    private double monthlyPayment;
    private static final double DISCOUNT_RATE = 0.1;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public double calculateLoanFinancing(){
        monthlyPayment = super.calculateLoanFinancing();
        if(specialCustomer) {
            return  monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        } else{
        return monthlyPayment;
        }
    }

    @Override
    public String toString() {
        double loanAmount = super.getLoanAmount();
        double loanPaymentTerm = super.getLoanPaymentTerm();
        double INTEREST_RATE = super.getInterestRate();
        return "LOAN DETAILS (if applicable):" +
        "\nLoan Amount:" + loanAmount +
        "\nLoan Payment Term:" + loanPaymentTerm +
        "\nInterest Rate:" + INTEREST_RATE +
        "\nSpecial Customer:" + specialCustomer +
        "\nMonthly Loan Payment:" + monthlyPayment;
    }
}
