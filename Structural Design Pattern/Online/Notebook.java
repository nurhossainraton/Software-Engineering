package Online;

public class Notebook implements Functionalities{
    @Override
    public void Storage() {
        System.out.println("Functionality : Storage");

        System.out.println("Storage used in notebook");
    }

    @Override
    public void Interface() {
        System.out.println("Functionality : Interface");

        System.out.println("User used interface in notebook");
    }

    @Override
    public void Commuinicate() {
        System.out.println("Functionality : Communicate");
        System.out.println("Communication held in notebook");
    }
}
