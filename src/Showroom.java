import java.util.Scanner;

public class Showroom implements utility{
String showroom_name;

String Showroom_address;

int total_employees;

int total_cars;

String manager_name;
    @Override
    public void get_details() {
        System.out.println("Showroom Name "+ showroom_name);
        System.out.println("Showroom Address "+ Showroom_address);
        System.out.println("Total employees "+ total_employees);
        System.out.println("Total Cars available "+ total_cars);
        System.out.println("Manager Name "+ manager_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================ENTER SHOWROOM DETAILS===============");
        System.out.println();
        System.out.println("Enter Showroom Name :");
        showroom_name = sc.nextLine();
        System.out.println("Enter Showroom Address :");
        Showroom_address = sc.nextLine();
        System.out.println("Enter number of employees :");
        total_employees = sc.nextInt();
        System.out.println("Enter Number of cars :");
        total_cars = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Manager's name :");
        manager_name = sc.nextLine();
    }
}
