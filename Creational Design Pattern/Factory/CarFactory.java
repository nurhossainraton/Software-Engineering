public class CarFactory {
    public Car getCar(String car)
    {
        if(car.equalsIgnoreCase("Germany"))
            return new BMW();
        else if(car.equalsIgnoreCase("Japan"))
            return new Toyota();
        else if(car.equalsIgnoreCase("USA"))
            return new Tesla();
        else
            return null;
    }
}
