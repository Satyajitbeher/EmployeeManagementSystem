import java.util.List;

 class EmployeeService {
    EmployeeDAO dao = new EmployeeDAO();

    public void addEmployee(String name, String dept, double salary) {
        dao.addEmployee(new Employee(name, dept, salary));
    }

    public void listEmployees() {
        List<Employee> employees = dao.getAllEmployees();
        for (Employee e : employees) {
            System.out.println(e.getId() + " | " + e.getName() +
                    " | " + e.getDepartment() + " | ₹" + e.getSalary());
        }
    }

    public void deleteEmployee(int id) {
        if (dao.deleteEmployee(id)) {
            System.out.println("Employee deleted!");
        } else {
            System.out.println("ID not found!");
        }
    }

    public void updateEmployee(int id, String dept, double salary) {
        if (dao.updateEmployee(id, dept, salary)) {
            System.out.println("Employee updated!");
        } else {
            System.out.println("ID not found!");
        }
    }
}
