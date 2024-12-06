public class
InSufficient implements States{
    @Override
    public void SuccessFul(int amount) {

    }

    @Override
    public void More(int amount) {

    }

    @Override
    public void Less(int amount) {
        System.out.println("Your balance is low");
        System.out.println("Give extra  "+ (int)(50-amount)+" taka to take the product");
    }

    @Override
    public void NoItems(int amount) {

    }
}
