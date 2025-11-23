package app;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String desiganation;
    private String department;

    private double basicSalary;
    private double hra;
    private double ta;
    private double da;

    private int leavesTaken;

    public Employee(int id, String name, int age, String desiganation, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.desiganation = desiganation;
        this.department = department;

        this.basicSalary = basicSalary;

        // Auto calculate salary parts
        this.hra = basicSalary * 0.20;
        this.ta = basicSalary * 0.10;
        this.da = basicSalary * 0.15;

        this.leavesTaken = 0;
    }

    public double calculateTotalSalary() {
        double gross = basicSalary + hra + ta + da;
        double deduction = gross * (0.02 * leavesTaken);  // 2% per leave
        return gross - deduction;
    }

    public void addLeaves(int leaves) {
        this.leavesTaken += leaves;
    }

    public void updateBasicSalary(double newBasic) {
        this.basicSalary = newBasic;

        // Recalculate components
        this.hra = newBasic * 0.20;
        this.ta = newBasic * 0.10;
        this.da = newBasic * 0.15;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getDesiganation() { return desiganation; }
    public double getBasicSalary() { return basicSalary; }
    public int getLeavesTaken() { return leavesTaken; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "\nEmployee [ID=" + id + ", Name=" + name + ", Age=" + age +
                ", Designation=" + desiganation + ", Dept=" + department +
                ", Basic Salary=" + basicSalary +
                ", HRA=" + hra + ", TA=" + ta + ", DA=" + da +
                ", Leaves=" + leavesTaken +
                ", Total Salary=" + calculateTotalSalary() + "]\n";
    }
}

