package gui;

import javax.swing.*;
import java.awt.*;
import service.EmployeeService;

public class DeleteEmployeeForm extends JFrame {

    EmployeeService service = new EmployeeService();

    public DeleteEmployeeForm() {
        setTitle("Delete Employee");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel idLbl = new JLabel("Employee ID:");
        JTextField idField = new JTextField();
        JButton deleteBtn = new JButton("Delete");

        setLayout(new GridLayout(2, 2, 10, 10));
        add(idLbl); add(idField);
        add(new JLabel()); add(deleteBtn);

        deleteBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            service.deleteEmployee(id);
            JOptionPane.showMessageDialog(this, "Employee Deleted!");
            dispose();
        });

        setVisible(true);
    }
}
