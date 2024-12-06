package Online;

public class Windoors extends OS{
    public Windoors(Functionalities functionalities) {
        super(functionalities);
    }

    @Override
    public void Storage() {
        System.out.println("OS is Windoors");
        functionalities.Storage();
    }

    @Override
    public void Interface() {
        System.out.println("OS is Windoors");
        functionalities.Interface();
    }

    @Override
    public void Commuinicate() {
        System.out.println("OS is Windoors");
        functionalities.Commuinicate();
    }
}
