import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inp;
        System.out.println("The system is in operational mode");
        Server server = new Server();
        new RegularUser(server);
        new PremiumUsers(server);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter 0 to Operational,1 to Partially Down ,2 to Fully Down,any other number to exit");
            inp = scanner.nextInt();
            if (inp > 2)
                break;
            server.setState(inp);
          //  System.out.println(server.getState());
        }
    }
}
