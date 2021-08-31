public class Employee {
    protected String empName, empId;

    public Employee() {
    }

    public Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
     public void displayEmployee(){
         System.out.println("\nEmployee Name : "+this.getEmpName());
         System.out.println("Employee ID     : "+this.getEmpId());
     }
}
