package Problem2;

public class Espresso extends AbstractDecorator{

    int dairyCream ;
    BasicComponent coffeeBeans = new BasicComponent();

    public Espresso() {

        this.dairyCream = 40;
    }

    public void makeCoffee()
    {
        super.makeCoffee();
        additionalCoffeeBeans();

    }

    private void additionalCoffeeBeans() {

        System.out.println("Dairy Cream is added --------->"+" price :"+dairyCream);
        System.out.println("Total Price ------------->"+(int)( + coffeeBeans.getCoffeBeansPrice()+coffeeBeans.getMugPrice()+dairyCream));
    }
}
