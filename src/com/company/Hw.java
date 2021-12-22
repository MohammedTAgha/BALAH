package com.company;
import java.util.Scanner;

public class Hw {


    public static void main( String args[] ) {
        class Employee {
            String Name;
            Double Salary;
            Employee(String employeeName , double currentSalary){
                Salary=currentSalary;
                Name=employeeName;
            }
            public void getName(){
                System.out.println("The employee's name is "+Name);
            }
            public void getSalry(){
                System.out.println("The employee's sallary is "+Salary);
            }
            public void riseSalry(double percent){
                Salary = Salary + (Salary*(percent/100));
                System.out.println("Harry gets a "+percent+" percent raise");
            }
        }
        Employee  mEmployee=new Employee("adam",1800);

        System.out.println("rise the sallary per ");
        Scanner in = new Scanner(System.in);
        Double rise=in.nextDouble();
        mEmployee.riseSalry(rise);
        mEmployee.getSalry();
    }
}
