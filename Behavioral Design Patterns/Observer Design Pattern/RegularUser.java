import java.util.Scanner;

public class RegularUser extends Clients{
    int newState;
    public RegularUser(Server server) {
        this.server = server;
        this.server.Add(this);
        prevstate = server.getState();
    }
    int flag=0;
    @Override
    public void Update() {
        Scanner scanner = new Scanner(System.in);
        int input;
        newState = server.getState();
        //System.out.println("NewState "+newState+ " lastsate " +prevstate);
        if(prevstate == 0)
        {
            if(newState == 1)
            {
                System.out.println("Hello regularuser, Press 1 to take limited service from ABC, 2 to Full Service from DEF");
                input = scanner.nextInt();
                if(input == 2)
                    flag =input;
            }
            else if(newState == 2)
            {
                System.out.println("Hello regularuser,Press  2 to take Full Service from DEF");
                input = scanner.nextInt();
                if(input == 2)
                    flag =input;
            }
           // prevstate = newState;
           // System.out.println("flag is set"+flag);

        }
        else if( newState == 0)
        {
            //System.out.println(flag);
            if(flag == 2)
                System.out.println("Total Bill : x ");
            flag =0;
        }
        prevstate = newState;
    }
}
