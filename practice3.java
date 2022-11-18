//taha burak sahin
//In the U.S.A., fuel consumption is measured in units called mpg — miles per gallon,
//i.e., how many miles you will be able to drive on one gallon of gasoline. In Europe
//the same quantity is measured in `/100 km — how many litres you will use to drive
//100 km.
//One mile = 1.609344 km.
//One gallon = 3.785412 `.
//Write a program which asks the user for fuel consumption, as a double, and units
//used, as a String: eu if this is in European units or usa otherwise. Then the corresponding fuel consumption in the other units is printed. If the string entered is not
//one of eu or usa, the program prints an error message.

package task3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        DecimalFormat df2 =new DecimalFormat("0.00");
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the no of liters to fill the tank for EU and USA");
        int ltt =sc.nextInt();
        double lt= (ltt*1.00);

        if(ltt<1){
            System.out.println(ltt+" is an Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        int diss =sc.nextInt();
        double dis= (diss*1.00);

        if(diss<1){
            System.out.println(diss+" is an Invalid Input");
            System.exit(0);
        }

        double hundered = ((lt/dis)*100);
        System.out.println("Liters/100KM" );
        System.out.println(df2.format(hundered));

        double miles = (dis*0.6214);
        double gallons =(lt*0.2642);
        double mg = miles/gallons;
        System.out.println("Miles/gallons");
        System.out.println(df2.format(mg));
    }
}

