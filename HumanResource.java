/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author Hello VIỆT
 */
public class HumanResource {
    private static final ArrayList<Staff> humanResourceList= new ArrayList<>();
   private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        tao cac phong ban 
        Department business = new Department("B001","BUSINESS",0);
        Department project = new Department("P001","PROJECT",0);
        Department tech = new Department("T001","TECH",0);
        Department[] departments = {business,project,tech};
        
        int choice = 0;
        do {
            System.out.println("----menu-----");
            System.out.println("1: hien thi danh sach co trong cty");
            System.out.println("2: hien thi cac bo phan co trong cty");
            System.out.println("3: hien thi cac nhan vien theo tung bo phan");
            System.out.println("4: them nhan vien moi vao");
            System.out.println("5: tim kiem thong tinh nhan vien theo ten hoac ma");
            System.out.println("6: hien thi bang luong cua toan cty");
            System.out.println("7: hien thi bang luong cua nhan vien theo thu tu tang dan");
            System.out.println("------chon chuc nang------");
            choice = input.nextInt();
            switch (choice) {
                case 1: 
                    humanResourceList.forEach(staff -> {
//                        System.out.println("ma nhan vien : " + staff.getId() + " ten nhan vien : " +
//                                staff.getName());
                                    staff.displayInformation();
                });
                    break;
                
                case 2:
                for (Department department : departments) {
                    System.out.println(department);
                }
                    break;

                case 3:
                    System.out.println("chon ten bo phan");;
                    System.out.println("1: business");
                    System.out.println("2: project");
                    System.out.println("3: tech");
                     String selectedDepartment;
                    while (true){
                       
                        int option = input.nextInt();
                    if(option == 1) {
                        selectedDepartment = "BUSINESS";
                        break;
                        
                    }else if(option == 2) {
                         selectedDepartment ="PROJECT";
                        break;
                    } else if(option == 3){
                         selectedDepartment ="TECH";
                         break;
                    } else {
                        System.out.println("ban da nhap sai vui long nhap lai");
                        
                    }
                    
                    }
                    humanResourceList.forEach(staff -> {
                           
                        if( staff.getDepartment().getDepartmentName().equals(selectedDepartment)) {
                            staff.displayInformation();
                        }
                    });
                    
                    break;
                    case 4:
                        System.out.println("chon loai nhan vien can them");
                        int select ;
                        do{
                            System.out.println("1: nhan vien ");
                            System.out.println("2: nhan vien quan ly ");
                            System.out.println("3: thoat");
                            select = input.nextInt();
                             input.nextLine();
                            if( select == 1) {
                               
                                System.out.println("nhap id ");
                                String id = input.nextLine();
                                
                                System.out.println("nhap ten");
                                String name = input.nextLine();
                                
                                System.out.println("nhap tuoi");
                                int age = input.nextInt();
                                
                                input.nextLine();
                                System.out.println("nhap he so luo0ng");
                                double salaryScale = input.nextDouble();
                                input.nextLine();
                                
                                System.out.println("nhap bo phan lam viec");
                                String departmentName = input.nextLine();
                                Department boPhanLamViec = null;
                                 for(Department department : departments) {
                                    if(department.getDepartmentName().equals(departmentName)) {
                                       boPhanLamViec = department;
                                    }
                                }
                                 System.out.println("nhap nay bat dau lam viec");
                                String startDate = input.nextLine();
                                 
                                
                                System.out.println("nhap so gio lam them");
                                double ot = input.nextDouble();
                                Staff employee = new Employee(ot,id,name,age,salaryScale,startDate,boPhanLamViec,0.0d);
                                humanResourceList.add(employee);
                                
                            }
                            
                            if(select == 2) {
                                
                                System.out.println("nhap id ");
                                String id = input.nextLine();
                                
                                System.out.println("nhap ten");
                                String name = input.nextLine();
                                
                                System.out.println("nhap tuoi");
                                int age = input.nextInt();
                                
                                input.nextLine();
                                System.out.println("nhap he so luo0ng");
                                double salaryScale = input.nextDouble();
                                input.nextLine();
                                
                                System.out.println("nhap bo phan lam viec");
                                String departmentName = input.nextLine();
                                Department boPhanLamViec = null;
                                 for(Department department : departments) {
                                    if(department.getDepartmentName().equals(departmentName)) {
                                       boPhanLamViec = department;
                                    }
                                }
                                 System.out.println("nhap nay bat dau lam viec");
                                String startDate = input.nextLine();
                                 
                                
                                System.out.println("nhap title");
                                String title = input.nextLine();
                                
                                Staff manager = new Manager(title,id,name,age,salaryScale,startDate,boPhanLamViec,0.0d);
                                humanResourceList.add(manager);
                                
                               
                            }
                            
                           
                        }while (select == 1 || select ==2);
                    
                    break;
                    
                    case 5:
                        System.out.println("tim kiem nhan vien theo ten hoac id");
                        System.out.println("nhap id hoac name");
                        String idOrName = input.nextLine();
                        humanResourceList.forEach(staff -> {
                            if (staff.getId().equals(idOrName) || staff.getName().equals(idOrName)) {
                                staff.displayInformation();
                            }
                        } 
                        );
                    
                    break;
                    case 6:
                        humanResourceList.forEach(staff -> {
                            System.out.println("ma so : " + staff.getId() + "ten : " + staff.getName() + "luong : " +staff.getSalary() );;
                        
                            
                });
                        break;
                    case 7:
                        Collections.sort(humanResourceList, new Comparator<Staff> (){
                            public int compare(Staff staff1 , Staff staff2) {
                                if(staff1.getSalary() < staff2.getSalary()) {
                                    return 1;
                                }
                                else {
                                    if (staff1.getSalary() == staff2.getSalary()) {
                                        return 0;
                                    }
                                    else {
                                        return -1;
                                    }
                                }
                            }
                        });
                    
                        break;
                    case 8:
                        return;
                    default :
                        System.out.println("ban da nhap sai");

                    
            }
        }while(choice <= 8 );
    }
    
    
}
