import java.util.* ;
public class Q_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an odd length word: ");
        String word=input.nextLine();

        int middleIndex=word.length()/2;
        char middleLetter=word.charAt(middleIndex);
        System.out.println("The middle character is "+ middleLetter);
    }
}
