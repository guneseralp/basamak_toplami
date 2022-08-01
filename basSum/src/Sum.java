
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int basNumber=0,basSum=0,number;

        System.out.print("Enter Your Number: ");
        number = inp.nextInt();

        while(number !=0){
            basSum += number % 10;
            number /=10;
            basNumber++;
        }
        System.out.println("basNumber is: "+basNumber);
        System.out.print("basSum is: "+basSum);
    }
}
