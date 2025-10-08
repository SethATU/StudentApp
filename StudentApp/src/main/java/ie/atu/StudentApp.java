package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();

        Scanner number = new Scanner(System.in);
        System.out.print("How many students do you want to enter? ");
        int count = number.nextInt();
        number.nextLine();

        int i = 0;
        while (i < count) {
            // TODO: prompt for name, email, course using sc.nextLine()
            System.out.print("Enter name: ");
            name.add(number.nextLine());

            System.out.print("Enter email: ");

            System.out.print("Enter course: ");

            // TODO: create a Student using one of your constructors
            // TODO: add the new Student to students
            i++;
        }




    }
}
