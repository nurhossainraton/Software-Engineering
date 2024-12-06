package Problem2;

public class BasicComponent extends BasicIngredients{
    public static int coffeeBeansPrice;
    public static int mugPrice;

    public BasicComponent() {
        this.coffeeBeansPrice = 30;
        this.mugPrice=100;
    }

    public int getMugPrice() {
        return mugPrice;
    }

    public void setMugPrice(int mugPrice) {
        this.mugPrice = mugPrice;
    }

    public int getCoffeBeansPrice() {
        return coffeeBeansPrice;
    }

    public void setCoffeBeansPrice(int coffeBeansPrice) {
        this.coffeeBeansPrice = coffeBeansPrice;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Total Item and Individual Price :");
        System.out.println("A mug's Price ----------->: "+mugPrice);
        System.out.println("Coffee Beans is added ---> "+ "price "+coffeeBeansPrice);
    }
}
