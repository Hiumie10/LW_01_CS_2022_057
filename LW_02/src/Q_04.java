import java.util.Scanner;
public class Q_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[5];

        for (int i=0;i<5;i++) {
            System.out.print("Enter "+(i+1)+" th number of array:");
            numbers[i]= input.nextInt();

        }
        int largest=0;
        int secondLargest=0;
        for(int j=0;j<5;j++){
            if(numbers[j]>largest){
                secondLargest=largest;
                 largest=numbers[j];
            }else{
                if(numbers[j]>secondLargest){
                    secondLargest=numbers[j];
                }
            }
        }
        System.out.println("Largest number="+largest);
        System.out.println("Second largest number"+secondLargest);

    }
}
