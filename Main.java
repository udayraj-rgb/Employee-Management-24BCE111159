package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employeeservice service = new Employeeservice();

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. View All Employees");
            System.out.println("2. View Employee");
            System.out.println("3. Add Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Salary");
            System.out.println("6. Add Leaves");
            System.out.println("7. Show Salary Slip");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: service.viewAllEmps(); break;
                case 2: service.viewEmp(); break;
                case 3: service.addEmp(); break;
                case 4: service.deleteEmp(); break;
                case 5: service.updateSalary(); break;
                case 6: service.addLeaves(); break;
                case 7: service.salarySlip(); break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            sc.close();

        } while (true);
       
    }
}

