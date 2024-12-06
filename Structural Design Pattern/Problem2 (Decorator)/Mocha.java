package Problem2;

public class Mocha extends AbstractDecorator{
    int priceOfmilk;
    int  priceOfChocolateSauce ;
    BasicComponent coffeeBeans = new BasicComponent();

    public Mocha() {
        this.priceOfmilk = 50;
        this.priceOfChocolateSauce = 60;
    }

    public void makeCoffee()
    {
        super.makeCoffee();
        additionalCoffeeBeans();

    }

    private void additionalCoffeeBeans() {
        System.out.println("Milk is added ---------->"+" price :"+priceOfmilk);
        System.out.println("Cinnamon powder is added ----->"+" price :"+priceOfChocolateSauce);
        System.out.println("Total Price "+(int)(priceOfmilk + coffeeBeans.getCoffeBeansPrice()+coffeeBeans.getMugPrice()+priceOfChocolateSauce));
    }
}
