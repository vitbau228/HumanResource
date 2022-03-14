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
public class Manager extends Staff implements ICalculator{
    private String title;

    public Manager() {
    }

    public Manager(String title, String id, String name, int age, double salaryScale, String startDate, Department department, double annualLeave) {
        super(id, name, age, salaryScale, startDate, department, annualLeave);
        this.title = title;
    }

  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    
    @Override
    public double calculateSalary() {
        int allowance = 0 ;
        switch (title){
            case "Business Leader" -> allowance = 8000000;
            
            case "Project Leader" -> allowance = 8000000;
            
            case "Technical Leader" -> allowance = 8000000;
        };
        return this.salaryScale * 5000000 + allowance ;
    }
       @Override
    public String toString() {
        return 
        "ten quan ly: "+ name + "\n" +
         "ma so nhan vien : "+ id + "\n" +
           "tuoi nhan vien : "+ age + "\n" +
           "he so luong : "+ salaryScale + "\n" +
        "ngay vao lam : " + this.startDate + "\n" +
         "chuc danh : " + title+ "\n" +
         "so ngay nghi phep : " + annualLeave+"\n" +
         "luong : " + this.calculateSalary();
       
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
