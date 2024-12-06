public class Director {
    Builder mybuilder;
    public void Construct(Builder builder,String ram,String gc)
    {
        mybuilder = builder;
        mybuilder.AddGraphicsCard(gc);
        mybuilder.AddRam(ram);
    }
}
