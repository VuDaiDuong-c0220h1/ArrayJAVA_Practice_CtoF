import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println("Độ C là: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Độ F là: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit (double celcius) {
        double falhrenheit = (9 / 5)* celcius +32;
        return falhrenheit;
    }
    public static double fahrenheitToCelsius (double fahrenheit) {
        double celsius = (9 / 5)* fahrenheit +32;
        return celsius;
    }
}
