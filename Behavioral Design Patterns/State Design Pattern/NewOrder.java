public class NewOrder implements States{
    StatePattern s = new StatePattern();
    @Override
    public void SuccessFul(int amount) {
        System.out.println("You have paid the equal amount");
        System.out.println("Order Successful");
        System.out.println("Item remaining "+ s.getQuantity());
    }

    @Override
    public void More(int amount) {

    }

    @Override
    public void Less(int amount) {

    }

    @Override
    public void NoItems(int amount) {

    }
}
