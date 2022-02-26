class TestTax{
    public static void main(String[] args){
        double grossIncome;
        String state;
        int dependents;

        grossIncome = 50000;
        dependents = 2;
        state = "NJ";

        Tax t = new Tax(grossIncome, state, dependents);
        Tax t2 = new Tax(65000, "TX", 4);

        double yourTax = t.calcTax();
        double hisTax = t2.calcTax();

        t.convertToEuros(yourTax);
        t2.convertToEuros(hisTax);
    }
}