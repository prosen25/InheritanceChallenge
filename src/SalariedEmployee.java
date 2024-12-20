public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retire() {
        String  systemDate = "12/12/2024";
        terminate(systemDate);
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck =  annualSalary / 12;
        return (isRetired) ? 0.9 * paycheck : paycheck;
    }
}