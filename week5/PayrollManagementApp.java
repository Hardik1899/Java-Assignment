public class PayrollManagementApp {

    public static void main(String[] args) {

        PayrollProcessor payroll = new PayrollProcessor(10);

        SalariedEmployee e1 =
                new SalariedEmployee("E101", "Rahul", 50000);

        SalariedEmployee e2 =
                new SalariedEmployee("E102", "Aman", 60000);

        HourlyEmployee e3 =
                new HourlyEmployee("E103", "Riya", 200, 40);

        HourlyEmployee e4 =
                new HourlyEmployee("E104", "Priya", 250, 35);

        Invoice invoice =
                new Invoice("INV001", "Computer Supplies", 15000);


        payroll.addPayment(e1);
        payroll.addPayment(e2);
        payroll.addPayment(e3);
        payroll.addPayment(e4);
        payroll.addPayment(invoice);


        System.out.println("------ PAYROLL MANAGEMENT ------");

        payroll.displayPayments();

        System.out.println("\nTotal Payment: "
                + payroll.calculateTotalPayment());

        System.out.println("\n------ LARGEST PAYMENT ------");
        payroll.findLargestPayment();

        System.out.println("\n------ PAYMENT COUNT ------");
        payroll.countPaymentTypes();
    }
}


interface Payable {

    double calculatePayment();
}


abstract class Employee implements Payable {

    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract String getEmployeeType();

    @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name;
    }
}


class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String employeeId,
                            String name,
                            double monthlySalary) {

        super(employeeId, name);

        if (monthlySalary <= 0) {
            throw new IllegalArgumentException(
                    "Salary must be positive");
        }

        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        return monthlySalary;
    }

    @Override
    public String getEmployeeType() {
        return "Salaried Employee";
    }

    @Override
    public String toString() {
        return "Salaried Employee - "
                + super.toString()
                + ", Payment: " + calculatePayment();
    }
}


class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String employeeId,
                          String name,
                          double hourlyRate,
                          double hoursWorked) {

        super(employeeId, name);

        if (hourlyRate <= 0 || hoursWorked < 0) {
            throw new IllegalArgumentException(
                    "Invalid hourly details");
        }

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getEmployeeType() {
        return "Hourly Employee";
    }

    @Override
    public String toString() {
        return "Hourly Employee - "
                + super.toString()
                + ", Payment: " + calculatePayment();
    }
}


class Invoice implements Payable {

    private String invoiceId;
    private String description;
    private double amount;

    public Invoice(String invoiceId,
                   String description,
                   double amount) {

        this.invoiceId = invoiceId;
        this.description = description;

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }

        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice - ID: " + invoiceId
                + ", Description: " + description
                + ", Payment: " + calculatePayment();
    }
}


class PayrollProcessor {

    private Payable[] payments;
    private int size;

    public PayrollProcessor(int capacity) {
        payments = new Payable[capacity];
        size = 0;
    }


    public void addPayment(Payable payment) {

        if (size < payments.length) {
            payments[size] = payment;
            size++;
        } else {
            System.out.println("Payroll is full.");
        }
    }


    public double calculateTotalPayment() {

        double total = 0;

        for (int i = 0; i < size; i++) {
            total += payments[i].calculatePayment();
        }

        return total;
    }


    public void displayPayments() {

        for (int i = 0; i < size; i++) {

            Payable payment = payments[i];

            System.out.println(payment);
        }
    }


    public void findLargestPayment() {

        Payable largest = payments[0];

        for (int i = 1; i < size; i++) {

            if (payments[i].calculatePayment()
                    > largest.calculatePayment()) {

                largest = payments[i];
            }
        }

        System.out.println(largest);
    }


    public void countPaymentTypes() {

        int employeeCount = 0;
        int nonEmployeeCount = 0;

        for (int i = 0; i < size; i++) {

            if (payments[i] instanceof Employee) {
                employeeCount++;
            } else {
                nonEmployeeCount++;
            }
        }

        System.out.println("Employee payments: "
                + employeeCount);

        System.out.println("Non-Employee payments: "
                + nonEmployeeCount);
    }
}
