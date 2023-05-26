package ScanerExamples;

import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int to_number  = sc.nextInt();


        System.out.print("Your number in a decimal system: ");
        System.out.println(to_number);

        System.out.print("Your number in a binary system: ");
        System.out.println(Integer.toBinaryString(to_number));

        System.out.print("Your number in an octal system: ");
        System.out.println(Integer.toOctalString(to_number));

        System.out.print("Your number in a hex system: ");
        System.out.println(Integer.toHexString(to_number));


        sc.close ();

    }
}
