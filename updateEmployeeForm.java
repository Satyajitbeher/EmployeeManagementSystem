package gui;

import javax.swing.*;
import java.awt.*;
import service.EmployeeService;

public class UpdateEmployeeForm extends JFrame {

    EmployeeService service = new EmployeeService();

    public UpdateEmployeeForm() {
        setTitle("Update Employee");
        setSize(350, 300);
        setLocationRelativeTo(null);

        JLabel idLbl = new JLabel("Employee ID:");
        JLabel deptLbl = new JLabel("New Department:");
        JLabel salLbl = new JLabel("New Salary:");

        JTextField idField = new JTextField();
        JTextField deptField = new JTextField();
        JTextField salField = new JTextField();

        JButton updateBtn = new JButton("Update");

        setLayout(new GridLayout(4, 2, 10, 10));
        add(idLbl); add(idField);
        add(deptLbl); add(deptField);
        add(salLbl); add(salField);
        add(new JLabel()); add(updateBtn);

        updateBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String dept = deptField.getText();
            double sal = Double.parseDouble(salField.getText());

            service.updateEmployee(id, dept, sal);
            JOptionPane.showMessageDialog(this, "Employee Updated!");
            dispose();
        });

        setVisible(true);
    }
}
