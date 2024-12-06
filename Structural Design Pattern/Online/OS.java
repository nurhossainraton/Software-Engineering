package Online;

public abstract class OS {
    protected Functionalities functionalities;

    public OS(Functionalities functionalities) {
        this.functionalities = functionalities;
    }

    abstract public void Storage();
    abstract public void Interface();
    abstract public void Commuinicate();
}
