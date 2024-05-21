package employee.payroll.system;
import java.util.*;
public class PayrollSystem {
    private ArrayList<Employee> employeeList;
    
    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    
    public void removeEmployee(int id){
        System.out.println("Removing Employee Having ID: " + id);
        Employee employeeToRemove = null;
        for(Employee employee: employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }
    
    public void displayEmployee(){
        System.out.println("Employee Details: ");
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
