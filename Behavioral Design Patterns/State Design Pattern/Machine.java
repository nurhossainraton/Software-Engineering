public class Machine {
    public static NewOrder newOrder;
    public static Greater greater;
    public static EmptyMachine emptyMachine;
    public static InSufficient inSufficient;

    private States currentState;
    public Machine()
    {
        newOrder = new NewOrder();
        greater = new Greater();
        emptyMachine = new EmptyMachine();
        inSufficient = new InSufficient();

    }
    public void setNewOrder()
    {
        currentState =  newOrder;
    }
    public void setGreater()
    {
        currentState = greater;
    }
    public void setEmptyMachine()
    {
        currentState =emptyMachine;
    }
    public void setInSufficient()
    {
        currentState = inSufficient;
    }


    public void SuccessFul(int amount)
    {
        currentState.SuccessFul(amount);
    }
    public void More(int amount)
    {
        currentState.More(amount);
    }
    public void Less(int amount)
    {
        currentState.Less(amount);
    }
    public void NoItems(int amount) {currentState.NoItems(amount);}
}
