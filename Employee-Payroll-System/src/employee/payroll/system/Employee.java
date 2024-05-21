
package employee.payroll.system;

abstract public class Employee {
    private String name;
    
    private int id;
    
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public abstract double calculateSalary();
    
    @Override
    public String toString(){
        return "Employeee "+ id + " [Name: " + name +  ", Salary: " + calculateSalary() + "]";
    }
}
