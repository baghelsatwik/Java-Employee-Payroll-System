package employee.payroll.system;

public class Main {
    public static void main(String[] args){
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee satwik = new FullTimeEmployee("Satwik",1,8_00_000);
        PartTimeEmployee vikas = new PartTimeEmployee("Vikas",2,40,1_000);
        payrollSystem.addEmployee(satwik);
        payrollSystem.addEmployee(vikas);
        payrollSystem.displayEmployee();
        payrollSystem.removeEmployee(2);
        payrollSystem.displayEmployee();
    }
}
