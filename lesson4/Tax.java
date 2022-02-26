class Tax{
    double grossIncome;
    String state;
    int dependents;
    static int customerCounter;

    Tax(double gi, String st, int depend){
        this.grossIncome = gi;
        this.state = st;
        this.dependents = depend;
        customerCounter++;
        System.out.println("Preparing the tax for customer#" + customerCounter);
    }

    public double calcTax(){
        return (grossIncome*0.33 - dependents*100);
    }

    public void convertToEuros(double taxInDollars){
        System.out.println("Tax in Euros: " + taxInDollars/1.25);
    }
}