package Problem2;

public abstract class AbstractDecorator extends BasicIngredients{
    protected BasicIngredients basicIngredients;
    public void setBasicIngredients(BasicIngredients basicIngredients)
    {
        this.basicIngredients =basicIngredients;
    }
    @Override
    public void makeCoffee() {
        if(basicIngredients != null)
        {
            basicIngredients.makeCoffee();
        }
    }

}
