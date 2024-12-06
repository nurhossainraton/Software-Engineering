package Online;

public class Main {
    public static void main(String[] args) {
        OS l = new Linus(new Notebook());
        l.Storage();
        l.Interface();
        l.Commuinicate();
        System.out.println("-----------------------");
        OS w = new Windoors(new Smartphones());
        w.Storage();
        w.Interface();
        w.Commuinicate();

    }
}
