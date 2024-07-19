import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
    String emp_id;
    String emp_age;
    String emp_name;
    String emp_dept;
    int emp_salary;


    @Override
    public void get_details(){
        System.out.println("Employee Id : "+emp_id);
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee Department : "+emp_dept);
        System.out.println("Employee Salary : "+emp_salary);
        System.out.println("Employee Age "+emp_age);
    }


    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID vvid = UUID.randomUUID();
        emp_id = String.valueOf(vvid);
        System.out.println("==============ENTER EMPLOYEE DETAILS==============");
        System.out.println();
        System.out.println("Enter Name : ");
        emp_name = sc.nextLine();
        System.out.println("Enter Employee Age : ");
        emp_age = sc.nextLine();
        System.out.println("Enter Employee Department : ");
        emp_dept = sc.nextLine();
        System.out.println("Enter Employee Salary : ");
        emp_salary = sc.nextInt();
        System.out.println("Enter Showroom Name : ");
        showroom_name = sc.nextLine();



    }

}
