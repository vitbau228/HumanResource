/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.resource;

import java.util.Date;

/**
 *
 * @author Hello VIỆT
 */
public abstract class Staff {
    protected String id;
    protected String name;
    protected int age;
    protected double salaryScale;
    protected String startDate;
    protected Department department;
    protected double annualLeave;
 

    public Staff() {
    }

    public Staff(String id, String name, int age, double salaryScale, String startDate, Department department, double annualLeave) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryScale = salaryScale;
        this.startDate = startDate;
        this.department = department;
        this.annualLeave = annualLeave;
    }

   public abstract double getSalary();
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(double salaryScale) {
        this.salaryScale = salaryScale;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(double annualLeave) {
        this.annualLeave = annualLeave;
    }
    
    
    
    public abstract void displayInformation ();
    
 
    
    
   
}
