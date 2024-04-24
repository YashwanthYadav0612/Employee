public class TaxCalculator {

    public static double calculateTax(double yearlySalary) {
        double tax = 0;
        if (yearlySalary <= 250000) {
            tax = 0;
        } else if (yearlySalary <= 500000) {
            tax = (yearlySalary - 250000) * 0.05;
        } else if (yearlySalary <= 1000000) {
            tax = 12500 + (yearlySalary - 500000) * 0.1;
        } else {
            tax = 62500 + (yearlySalary - 1000000) * 0.2;
        }
        return tax;
    }

    public static double calculateCess(double yearlySalary) {
        double cess = 0;
        if (yearlySalary > 2500000) {
            cess = (yearlySalary - 2500000) * 0.02;
        }
        return cess;
    }
}
