import java.util.Scanner;

public class PremiumUsers extends Clients{
    public PremiumUsers(Server server) {
        this.server = server;
        this.server.Add(this);
        prevstate = server.getState();
    }
    int flag=0;
    int newState;
    @Override
    public void Update() {
        Scanner scanner = new Scanner(System.in);
        int input;
        newState = server.getState();
        // System.out.println("NewState "+newState+ " lastsate " +prevstate);
        if(prevstate == 0)
        {
            if(newState == 1)
            {
                System.out.println("Hello premiumuser,Press 1 to take  service from both servers, 2 to from only DEF");
                input = scanner.nextInt();
                if(input == 1)
                    System.out.println("Hello premiumuser, You are taking Service from both servers");
                else
                    System.out.println("Hello premiumuser,You are now taking service from only DEF server");
            }
            else if(newState == 2)
            {
                System.out.println("Hello premiumuser,You are taking Service from DEF");
            }
            // prevstate = newState;
            // System.out.println("flag is set"+flag);

        }
        else if( prevstate ==1 && newState == 2)
        {
            System.out.println("Hello premiumuser,You are now taking service from only DEF server");
        }
        prevstate = newState;
        System.out.println("------------------------------------------------------");
    }

}
