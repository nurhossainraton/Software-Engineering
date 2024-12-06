public class EmptyMachine implements States{

    StatePattern s = new StatePattern();
    public void SuccessFul(int amount) {

    }

    @Override
    public void More(int amount) {

    }

    @Override
    public void Less(int amount) {

    }

    @Override
    public void NoItems(int amount) {
        System.out.println("There is no item !");
    }
}
