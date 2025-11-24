package gui;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Employee Management System");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton addBtn = new JButton("Add Employee");
        JButton viewBtn = new JButton("View Employees");
        JButton updateBtn = new JButton("Update Employee");
        JButton deleteBtn = new JButton("Delete Employee");
        JButton exitBtn = new JButton("Exit");

        panel.add(addBtn);
        panel.add(viewBtn);
        panel.add(updateBtn);
        panel.add(deleteBtn);
        panel.add(exitBtn);

        add(panel);

        addBtn.addActionListener(e -> new AddEmployeeForm());
        viewBtn.addActionListener(e -> new ViewEmployees());
        updateBtn.addActionListener(e -> new UpdateEmployeeForm());
        deleteBtn.addActionListener(e -> new DeleteEmployeeForm());
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
