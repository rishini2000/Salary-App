import java.util.Hashtable;

import javax.swing.JOptionPane;

public class SalaryAppV3{

    public static void main(String [] args ){

        String empName;
        String empNo;
        double empSalary;
        String empCode;

        String dsgName;
        int hRate;

        while(true){
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-New Employee \n 2-Exit"));
            if(op==2) System.exit(0);
        

        empNo = JOptionPane.showInputDialog(null, "Enter Employee No:");

        Hashtable emp = EmployeeDao.getEmployee(empNo);

        empName = (String)(emp.get("Name"));
        empSalary = (double)(emp.get("Salary"));
        empCode = (String)(emp.get("Code"));
        dsgName = (String)(emp.get("Designation"));
        hRate = (int)(emp.get("Hour Rate"));


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