//taha burak sahin
//Write a program which reads five numbers of type int and prints the two greatest of
//them/ You can define at most three variables of type int. Do
//not use loops or arrays.


package task3;
import java.util.Scanner;
public class practice1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();

            if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { // a >= b,c,d,e
                System.out.println (a);
            } else if ((b >= c) && (b >= d) && (b >= e)) {      // b >= c,d,e
                System.out.println ( b);
            } else if ((c >= d) && (c >= e)) {                  // c >= d,e
                System.out.println ( c);
            } else if (d >= e) {                                // d >= e
                System.out.println ( d);
            } else {                                            // e > d
                System.out.println (e);
            }
        }
    }

