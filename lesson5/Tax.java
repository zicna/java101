public class Tax{   
    double grossIncome;
    String state;
    int dependents;
    static int customerCount;

    Tax(double gi, String st, int depend){
        grossIncome = gi;
        state = st;
        dependents = depend;
        customerCount++;
        System.out.println("Preparing tax for customer number " + customerCount );
    }

    public double calcTax() {
     
        if (grossIncome <= 50000){
            return grossIncome*0.06;
        } else {
            return grossIncome*0.08;
        }
    }
}
