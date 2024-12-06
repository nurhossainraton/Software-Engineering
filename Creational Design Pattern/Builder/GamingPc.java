public class GamingPc implements Builder{
    private PC pc = new PC();
    private String processor;
    private int processorPrice;

    public GamingPc()
    {
        this.processor = "AMD Ryzen 7 5700X" ;

        this.processorPrice = 28000;
    }

    public int getProcessorPrice() {
        return processorPrice;
    }



    public String getProcessor()
    {
        return this.processor;
    }


    public int getPriceExtra()
    {
        return 28000;
    }
    @Override
    public void AddRam(String ram) {
        if(ram.equalsIgnoreCase("2666 MHz"))
            pc.AddRam("2666 MHz");
        else if(ram.equalsIgnoreCase("3200 MHz"))
            pc.AddRam("3200 MHz");
        else
            pc.AddRam(null);
    }

    @Override
    public void AddGraphicsCard(String card) {
        if(card.equalsIgnoreCase("4 GB"))
            pc.AddGraphics("4 GB");
        else if(card.equalsIgnoreCase("2 GB"))
            pc.AddGraphics("2 GB");
        else
            pc.AddGraphics(null);
    }

    @Override
    public PC getPC() {
        return pc;
    }

}
