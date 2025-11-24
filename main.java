import java.util.Scanner;
import gui.Dashboard;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n=== EMPLOYEE MANAGEMENT ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Department: ");
                    String dept = sc.next();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();

                    service.addEmployee(name, dept, sal);
                }
                case 2 -> service.listEmployees();

                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("New Department: ");
                    String dept = sc.next();
                    System.out.print("New Salary: ");
                    double sal = sc.nextDouble();

                    service.updateEmployee(id, dept, sal);
                }

                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    service.deleteEmployee(id);
                }

                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice!");
                new Dashboard();
            }
        }
    }
}
