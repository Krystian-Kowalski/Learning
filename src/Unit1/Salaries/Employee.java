package Unit1.Salaries;

interface Employee {

    double calculateSalary();
}

class FixedSalaryEmployee implements Employee {

    private double bonusSalary;
    private double salary;
    private double bonusAmount = 1.2;
    boolean productSold;

    public FixedSalaryEmployee(double salary, boolean productSold) {
        this.productSold = productSold;
        this.salary = salary;
        this.bonusSalary = salary * bonusAmount;
    }

    public double calculateSalary() {
        if(productSold == true) {
            return this.bonusSalary;
        }
        else {
            return this.salary;
        }
    }
}

class HourlySalaryEmployee implements Employee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }
}

// Payout
abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}

class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }
}

class Application {
    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000, false);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        HourlySalaryEmployee employee2 = new HourlySalaryEmployee( 10, 5);
        FixedSalaryEmployee employee3 = new FixedSalaryEmployee(2000, true);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee1);
        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee2);
        SalaryPayoutProcessor processor3 = new SalaryPayoutProcessor(employee3);
        processor1.processPayout();
    }
}