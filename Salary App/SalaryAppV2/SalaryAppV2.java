import javax.swing.JOptionPane;

public class SalaryAppV2{

    public static void main(String [] args){


        String empnames [] = {"Ashan" , "Kamal" , "Wimala" , "Suneetha" , "Amara"};
        String empnumbers [] = {"E2101" , "E2202" , "E2303" , "E2404" , "E2405"};
        double empbcsalaries [] = {25000.00 , 50000.00 , 35000.00 , 25000.00 , 30000.00 };
        String empcodes [] = {"C2101" , "M2202" , "A2303" , "C2102" , "S2404"};

        String dsgnames [] = {"Cashier" , "Manager" , "Accountant" , "Cashier" , "Store Keeper"};
        int hrates [] = {120 , 120 , 117 , 120 , 117};

        String empName;
        String empNo;
        double empSalary;
        String empCode;

        String dsgName;
        int hRate;

        while(true){

            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-New Employee \n 2-Finish \n 3-Exit"));
            if(op==2) break;
            if(op==3) System.exit(0);

        empNo = JOptionPane.showInputDialog(null, "Enter Employee No:");

        int e = 0;

        while(e < empnumbers.length){
            if(empNo.equalsIgnoreCase(empnumbers[e])){
            break;
            }
            e++;
        }

        empName = empnames[e];
        empSalary = empbcsalaries[e];
        hRate = hrates[e];
        dsgName = dsgnames[e];

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