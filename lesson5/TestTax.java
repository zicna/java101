
    public class TestTax {
        public static void main(String[] args) {
            
            double grossIncome = 40000;
            String state = "NJ";
            int dependents = 2;
            
            if(args.length !=3) {
                System.out.println("Sample usage of the program:" + "java TestTax 5000 NJ 2");
                System.exit(0);
            }
            
            grossIncome = Double.parseDouble(args[0]);
            state = args[1];
            dependents = Integer.parseInt(args[2]);
             
            
            Tax t = new Tax(grossIncome, state, dependents);
            double yourTax = t.calcTax();
            
            
            System.out.println("your tax is: " + yourTax );
        }
    }
    
