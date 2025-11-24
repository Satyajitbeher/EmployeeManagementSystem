package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import service.EmployeeService;
import model.Employee;
import java.util.List;

public class ViewEmployees extends JFrame {

    EmployeeService service = new EmployeeService();

    public ViewEmployees() {
        setTitle("View Employees");
        setSize(600, 400);
        setLocationRelativeTo(null);

        List<Employee> employees = service.getAllEmployees();

        String[] columnNames = {"ID", "Name", "Department", "Salary"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Employee e : employees) {
            model.addRow(new Object[]{e.getId(), e.getName(), e.getDepartment(), e.getSalary()});
        }

        JTable table = new JTable(model);
        add(new JScrollPane(table));

        setVisible(true);
    }
}
