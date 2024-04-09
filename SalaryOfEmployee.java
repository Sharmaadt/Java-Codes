import java.util.Scanner;
public class SalaryOfEmployee{
    public static void main (String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any amount");
        double basic = Sc.nextDouble();
        double hra=0.10*basic;
        double da=0.08*basic;  
        double grossSalary=basic+hra+da;
        double tax=0.05*grossSalary; 
        double netSalary=grossSalary-tax;
        System.out.println("Employee Salary: ");
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}
