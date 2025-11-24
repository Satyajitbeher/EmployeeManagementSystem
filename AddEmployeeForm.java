package gui;

import javax.swing.*;
import java.awt.*;
import service.EmployeeService;

public class AddEmployeeForm extends JFrame {

    EmployeeService service = new EmployeeService();

    public AddEmployeeForm() {
        setTitle("Add Employee");
        setSize(350, 300);
        setLocationRelativeTo(null);

        JLabel nameLbl = new JLabel("Name:");
        JLabel deptLbl = new JLabel("Department:");
        JLabel salLbl = new JLabel("Salary:");

        JTextField nameField = new JTextField();
        JTextField deptField = new JTextField();
        JTextField salField = new JTextField();

        JButton addBtn = new JButton("Add Employee");

        setLayout(new GridLayout(4, 2, 10, 10));
        add(nameLbl); add(nameField);
        add(deptLbl); add(deptField);
        add(salLbl); add(salField);
        add(new JLabel()); add(addBtn);

        addBtn.addActionListener(e -> {
            String name = nameField.getText();
            String dept = deptField.getText();
            double salary = Double.parseDouble(salField.getText());

            service.addEmployee(name, dept, salary);
            JOptionPane.showMessageDialog(this, "Employee Added!");
            dispose();
        });

        setVisible(true);
    }
}
