/* Multiply Two Floating-Point Numbers */

import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first floating number :");
        float first = sc.nextFloat();
        System.out.println("Enter second floating number :");
        float second = sc.nextFloat();

        float multi = first * second;

        System.out.format("Multiply of two float numbers : %.2f", multi);
    }
}