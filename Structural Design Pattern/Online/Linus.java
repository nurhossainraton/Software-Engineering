package Online;

public class Linus extends OS{
    public Linus(Functionalities functionalities) {
        super(functionalities);
    }

    @Override
    public void Storage() {
        System.out.println("OS is Linus");
        functionalities.Storage();
    }

    @Override
    public void Interface() {
        System.out.println("OS is Linus");
        functionalities.Interface();
    }

    @Override
    public void Commuinicate() {
        System.out.println("OS is Linus");
        functionalities.Commuinicate();
    }
}
