package lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = in.nextInt();
        System.out.println(x);
        System.out.print("Please enter a double number: ");
        double y = in.nextDouble();
        System.out.println(y);

        System.out.print("Please enter two ints: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a+b);
    }
}
