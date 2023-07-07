import javax.swing.JOptionPane;

import java.util.List;

public class SalaryAppV4{

    public static void main(String [] args ){

        String empName = null;
        String empNo;
        double empSalary = 0.0;
        String empCode;

        String dsgName = null;
        int hRate;

        while(true){
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-New Employee \n 2-Exit"));
            if(op==2) System.exit(0);
        

        empNo = JOptionPane.showInputDialog(null, "Enter Employee No:");

        Employee employee = (Employee) EmployeeDao.getEmployee(empNo);

           
            empName = employee.getName();
            empSalary = employee.getSalary();
            empCode = employee.getCode();
            dsgName = employee.getDesignation();
            hRate = employee.getHourRate();

            int OverTime = hRate -100;
            double OtSalary = OverTime * 300;
            double grandSalary = empSalary +  OtSalary;

            JOptionPane.showMessageDialog(null, "Welcome" + empName
                                                        + "\n\n" + "Employee Number:" + empNo
                                                        + "\n\n" + "Designation:" + dsgName
                                                        + "\n\n" + "Your Basic Salary:" + empSalary
                                                        + "\n\n" + "OverTime Salary:" + OtSalary
                                                        + "\n\n" + "Salary:" + grandSalary);
        }
    }



}