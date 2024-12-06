package Problem2;

public class Cappucino extends AbstractDecorator{
    int priceOfmilk;
    int  priceOfCinnamonPowder ;
    BasicComponent coffeeBeans = new BasicComponent();

    public Cappucino() {
        this.priceOfmilk = 50;
        this.priceOfCinnamonPowder = 50;
    }

    public void makeCoffee()
    {
        super.makeCoffee();
        additionalCoffeeBeans();

    }

    private void additionalCoffeeBeans() {
        System.out.println("Milk is added ------------->"+" price :"+priceOfmilk);
        System.out.println("Cinnamon powder is added ----------->"+" price :"+priceOfCinnamonPowder);
        System.out.println("Total Price ----------->"+((int)priceOfmilk + coffeeBeans.getCoffeBeansPrice()+coffeeBeans.getMugPrice()+priceOfCinnamonPowder));
    }
}
