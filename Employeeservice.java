package app;

import java.util.HashSet;
import java.util.Scanner;

public class Employeeservice {

    HashSet<Employee> empset = new HashSet<>();

    Scanner sc = new Scanner(System.in);

    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double sal;

    public Employeeservice() {

        Employee emp1 = new Employee(101, "Shital", 24, "Developer", "IT", 250000);
        Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 57000);
        Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 50000);
        Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);

        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    // 1. View All Employees
    public void viewAllEmps() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    // 2. View Employee by ID
    public void viewEmp() {
        System.out.println("Enter ID:");
        id = sc.nextInt();
        found = false;

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) System.out.println("Employee not found!");
    }

    // 3. Update Basic Salary
    public void updateSalary() {
        System.out.println("Enter ID:");
        id = sc.nextInt();
        found = false;

        for (Employee emp : empset) {
            if (emp.getId() == id) {

                System.out.println("Enter NEW Basic Salary:");
                double newSal = sc.nextDouble();

                emp.updateBasicSalary(newSal);

                System.out.println("Updated Employee Details:");
                System.out.println(emp);

                found = true;
            }
        }

        if (!found)
            System.out.println("Employee not found!");
    }

    // 4. Add Leaves
    public void addLeaves() {
        System.out.println("Enter ID:");
        id = sc.nextInt();

        System.out.println("Enter leaves taken:");
        int leaves = sc.nextInt();

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                emp.addLeaves(leaves);
                System.out.println("Leaves added!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // 5. Salary Slip
    public void salarySlip() {
        System.out.println("Enter ID:");
        id = sc.nextInt();

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("\n------ SALARY SLIP ------");
                System.out.println(emp);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // 6. Add Employee
    public void addEmp() {
        System.out.println("Enter ID:");
        id = sc.nextInt();

        System.out.println("Enter Name:");
        name = sc.next();

        System.out.println("Enter Age:");
        age = sc.nextInt();

        System.out.println("Enter Designation:");
        desiganation = sc.next();

        System.out.println("Enter Department:");
        department = sc.next();

        System.out.println("Enter Basic Salary:");
        sal = sc.nextDouble();

        Employee emp = new Employee(id, name, age, desiganation, department, sal);

        empset.add(emp);
        System.out.println("Employee added!");
        System.out.println(emp);
    }

    // 7. Delete Employee
    public void deleteEmp() {
        System.out.println("Enter ID:");
        id = sc.nextInt();

        Employee empDel = null;

        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empDel = emp;
            }
        }

        if (empDel == null) {
            System.out.println("Employee not found!");
        } else {
            empset.remove(empDel);
            System.out.println("Employee removed!");
        }
    }
}

