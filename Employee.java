package human.resource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hello VIỆT
 */
public class Employee extends Staff implements ICalculator{
    private double OT;
   

    public Employee() {
    }
    
    public Employee(double OT, String id, String name, int age, double salaryScale, String startDate, Department department, double annualLeave) {
        super(id, name, age, salaryScale, startDate, department, annualLeave);
        this.OT = OT;
    }

    public double getOT() {
        return OT;
    }

    public void setOT(double OT) {
        this.OT = OT;
    }

  
    
    
    @Override
    public double calculateSalary() {
        return this.salaryScale * 3000000 + this.OT * 200000;
    }
       @Override
    public String toString() {
        return 
        "ten nhan vien : "+ name + "\n" +
         "ma so nhan vien : "+ id + "\n" +
           "tuoi nhan vien : "+ age + "\n" +
           "he so luong : "+ salaryScale + "\n" +
        "ngay vao lam : " + this.startDate + "\n" +
         "bo phan lam viec : " + this.department + "\n" +
         "so ngay nghi phep : " + annualLeave+"\n"+
         "so gio lam them " + this.OT +
        "luong thang nay : " + this.calculateSalary();
       
    }
    @Override
    public void displayInformation() {
        System.out.println(toString());
        }

    @Override
    public double getSalary() {
       return calculateSalary();
    }
    
    
    

  
    
}
    
