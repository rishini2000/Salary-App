public class EmployeeDao{

    public static Employee getEmployee(String empNo){

         Employee employee = new Employee();

         String empnames [] = {"Ashan" , "Kamal" , "Wimala" , "Suneetha" , "Amara"};
         String empnumbers [] = {"E2101" , "E2202" , "E2303" , "E2404" , "E2405"};
         double empbcsalaries [] = {25000.00 , 50000.00 , 35000.00 , 25000.00 , 30000.00 };
         String empcodes [] = {"C2101" , "M2202" , "A2303" , "C2102" , "S2404"};
     
         String dsgnames [] = {"Cashier" , "Manager" , "Accountant" , "Cashier" , "Store Keeper"};
         int hrates [] = {120 , 120 , 117 , 120 , 117};
     
         int e = 0;
     
         while(e < empnumbers.length){
             if(empNo.equalsIgnoreCase(empnumbers[e])){
     
                 employee.setName(empnames[e]);
                 employee.setSalary(empbcsalaries[e]);
                 employee.setCode(empcodes[e]);
                 employee.setDesignation(dsgnames[e]);
                 employee.setHourRate(hrates[e]);
     
             break;
             }
             e++;
         }
         return employee;

    }
}