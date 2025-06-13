class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) {
        super(name, dob,);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayStudentDetails(); // Calls the inherited method
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "15-08-1990", 101, 75000);
        emp.displayEmployeeDetails();
    }
}
