import java.util.Scanner;
public class Q_03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rowNo= input.nextInt();

        for(int i=1;i<(2*rowNo);i=i+2){
            int x=(((rowNo*2)-1)-i)/2;
            for(int j=1;j<=x;j++){
                System.out.print(" ");
            }
            for(int y=0;y<i;y++){
                System.out.print("*");
            }
            for(int z=1;z<=x;z++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
