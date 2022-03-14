/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.resource;

/**
 *
 * @author Hello VIỆT
 */
public class Department {
    private String departmentCode;
    private String departmentName;
    private int numberOfEmployee;

    public Department() {
    }

    public Department(String departmentCode, String departmentName, int numberOfEmployee) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.numberOfEmployee = numberOfEmployee;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
    

    @Override
    public String toString() {
        return "Department{" + "departmentCode=" + departmentCode + ", departmentName=" + departmentName + ", numberOfEmployee=" + numberOfEmployee + '}';
    }
    
    
   
}
