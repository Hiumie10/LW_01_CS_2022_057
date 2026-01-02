import java.util.Scanner;
public class Q_02 {
    public static void countDigit(int number){
        int count=0;
        while(number!=0){
           count++;
           number=number/10;
        }
        System.out.println("Number of digits: "+count);
    }

    public static void main(String[] args) {

        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number= input.nextInt();
            if(number<0){
                System.out.println("System stopped");
                break;
            }else{
                countDigit(number);
            }
        }
    }
}
