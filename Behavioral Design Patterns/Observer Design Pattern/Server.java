import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Clients> clientsList = new ArrayList<Clients>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllClients();
    }

    public Server() {
        state =0;

    }

    private void notifyAllClients() {
      for(Clients client : clientsList)
      {
          client.Update();
      }
    }
    public void Add(Clients client)
    {
        clientsList.add(client);
    }

}
