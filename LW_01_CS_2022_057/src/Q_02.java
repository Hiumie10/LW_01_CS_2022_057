import java.util.*;
public class Q_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName=input.nextLine();

        System.out.print("Enter middle name: ");
        String middleName=input.nextLine();

        System.out.print("Enter last name: ");
        String lastName=input.nextLine();

        System.out.println(lastName+" , "+firstName+" "+middleName.charAt(0)+".");

    }
}
