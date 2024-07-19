  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

  import java.util.Scanner;

  interface utility{
    public void get_details();

    public void set_details();
  }
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[10];

        Employees employees[] = new Employees[10];
        Car cars[] = new Car[10];

        int carCount = 0;
        int empCount = 0;
        int showroomCount = 0;

        int choice = 100;

        while(choice != 0){
            main_menu();

            choice = sc.nextInt();

            while(choice!=9 && choice !=0){
                switch (choice){
                    case 1:
                        showroom[showroomCount] = new Showroom();
                        showroom[showroomCount].set_details();
                        showroomCount++;
                        System.out.println();
                        System.out.println("1) ADD ANOTHER SHOWROOM");
                        System.out.println("9) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;



                    case 2:
                        employees[empCount] = new Employees();
                        employees[empCount].set_details();
                        empCount++;
                        System.out.println();
                        System.out.println("1) ADD ANOTHER SHOWROOM");
                        System.out.println("9) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;


                    case 3:
                        cars[carCount] = new Car();
                        cars[carCount].set_details();
                        carCount++;
                        System.out.println();
                        System.out.println("1) ADD ANOTHER SHOWROOM");
                        System.out.println("9) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for(int i = 0; i< showroomCount; i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();

                        }
                        System.out.println("9) GO BACK TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i = 0; i<empCount; i++){

                            employees[empCount].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        if(empCount==0){
                            System.out.println("No employee available");
                        }
                        System.out.println("9) GO BACK TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for(int i =0; i<carCount; i++){
                            cars[carCount].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9) GO BACK TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;
                }
            }
        }

    }
}