import javax.swing.JOptionPane;

public class SalaryAppV1{

    public static void main(String [] args){

        String empnames [] = {"Ashan" , "Kamal" , "Wimala" , "Suneetha" , "Amara"};
        String empno [] = {"E2101" , "E2202" , "E2303" , "E2404" , "E2405"};
        double empbcsalary [] = {25000.00 , 50000.00 , 35000.00 , 25000.00 , 30000.00 };
        String empcode [] = {"C2101" , "M2202" , "A2303" , "C2102" , "S2404"};

        String dsgname [] = {"Cashier" , "Manager" , "Accountant" , "Cashier" , "Store Keeper"};
        int hrate [] = {120 , 120 , 117 , 120 , 117};

        String empName;
        String empNo;
        double empSalary;
        String empCode;

        String dsgName;
        int hRate;

        String output = "";

        empNo = JOptionPane.showInputDialog(null, "Enter Employee No:");

        int e = 0;

        while(e < empno.length){
            if(empNo.equalsIgnoreCase(empno[e]))
            break;
            e++;
        }

        empName = empnames[e];
        empSalary = empbcsalary[e];
        hRate = hrate[e];
        dsgName = dsgname[e];

        JOptionPane.showMessageDialog(null, "Welcome " + empName + "\n\n" + "Your Employee Basic Salary is:" + empSalary);

        double OverTime = hRate -100;

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