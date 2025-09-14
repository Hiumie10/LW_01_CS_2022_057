import java.util.*;
public class Q_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length in centimeters: ");
        double lengthInCentimeters=input.nextFloat();
        double totalLengthInInches= lengthInCentimeters/2.54;
        int feet=(int)(totalLengthInInches/12);
        double inches=totalLengthInInches%12;


        System.out.println(lengthInCentimeters+" cm = "+feet+" feets and "+inches +" inches");
    }
}
