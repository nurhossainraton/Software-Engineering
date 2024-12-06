import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(str);
        car.PrintDetails();
    }


}
