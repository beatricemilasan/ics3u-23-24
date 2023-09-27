package lesson5;

public class ExampleThree {
    public static void main(String[] args) {
        System.out.print("Please enter a temperature in Fahrenheit: ");
        int fahrenheit = in.nextInt();

        double celcius = ((double)fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celcius is: ") + celcius;
    }
}
