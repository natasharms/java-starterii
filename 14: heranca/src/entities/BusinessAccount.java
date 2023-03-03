package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // CHAMANDO O CONSTRUTOR DA SUPERCLASSE
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount); // É possível chamar a implementação da superclasse usando a palavra super.
        balance -= 2.0;
    }
}
