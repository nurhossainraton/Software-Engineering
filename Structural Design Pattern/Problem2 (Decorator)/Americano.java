package Problem2;

public class Americano extends AbstractDecorator{
    int addCoffeeBeans;
    BasicComponent coffeeBeans = new BasicComponent();

    public Americano() {
        this.addCoffeeBeans = 30;
    }

    public int getAddCoffeeBeans() {
        return addCoffeeBeans;
    }

    public void setAddCoffeeBeans(int addCoffeeBeans) {
        this.addCoffeeBeans = addCoffeeBeans;
    }

    public void makeCoffee()
    {
        super.makeCoffee();
        additionalCoffeeBeans();

    }

    private void additionalCoffeeBeans() {
        System.out.println("Additional Coffee Beans is added ---------->"+" price "+addCoffeeBeans);
        System.out.println("Total Price ------------------------------->"+((int)(addCoffeeBeans + coffeeBeans.getCoffeBeansPrice()+coffeeBeans.getMugPrice())));
    }
}
