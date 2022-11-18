//taha burak sahin
//Write a program which reads five numbers of type int and after reading the third,
//fourth and fifth prints the sum of three numbers last read. You can define at most
//three variables of type int

package task3;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = in.nextInt();


        System.out.println("sum of last three numbers is: " +
                ( num3 + num4 + num5) / 3);
    }
}

