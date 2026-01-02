import java.util.Scanner;
public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence:");
        String str = sc.nextLine();
        str = str.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) {
            System.out.println("It's is a palindrome.");
        } else {
            System.out.println("It's is not a palindrome.");
        }

        sc.close();
    }
}
