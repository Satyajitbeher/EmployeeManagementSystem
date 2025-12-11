Employee Management System (Java, Swing, MySQL)
->A desktop-based application built using Java, Swing, and MySQL to manage employee records.
This system allows users to add, view, update, and delete employees through an easy-to-use graphical interface.

To compile : javac -d bin -cp ".;lib/mysql-connector-j-9.4.0.jar" src\model\*.java src\service\*.java src\gui\*.java src\db\*.java src\Main.java
To run : java -cp "bin;lib/mysql-connector-j-9.4.0.jar" Main

The Output:  
=== EMPLOYEE MANAGEMENT ===
1. Add Employee
2. View Employees
3. Update Employee
4. Delete Employee
5. Exit
Enter choice:
<img width="1920" height="1080" alt="Employee Management,output" src="https://github.com/user-attachments/assets/a2ab79e9-7ff8-400b-bda2-98d4fdc31c6e" />


 Component            | Technology                       
 --------------------  --------------------- 
 Programming Language - Java                             
 GUI Framework        - Swing (Java GUI)                 
 Database             - MySQL                            
 Architecture         - DAO (Data Access Object) Pattern 
 Library              - MySQL Connector/J                
