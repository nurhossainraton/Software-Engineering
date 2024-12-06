public class PC2  implements Builder{
    private PC pc = new PC();

    private String processor,Extra;
    private int processorPrice,ExtraFeaturePrice;
    public PC2()
    {
        this.processor = "Core i7" ;
        this.Extra = "liquid cooler";
        this.ExtraFeaturePrice =17000;
        this.processorPrice = 37000;
    }

    public int getProcessorPrice() {
        return processorPrice;
    }

    public int getExtraFeaturePrice() {
        return ExtraFeaturePrice;
    }

    public String getProcessor()
    {
        return this.processor;
    }
    public String getExtra()
    {
        return this.Extra;
    }
    public int getPriceExtra()
    {
        return 54000;
    }
    @Override
    public void AddRam(String ram) {
       if(ram.equalsIgnoreCase("2666 MHz"))
           pc.AddRam("2666 MHz");
       else if(ram.equalsIgnoreCase("3200 MHz"))
           pc.AddRam("3200 MHz");
    }

    @Override
    public void AddGraphicsCard(String card) {
        if(card.equalsIgnoreCase("4 GB"))
        pc.AddGraphics("4 GB");
       else if(card.equalsIgnoreCase("2 GB"))
            pc.AddGraphics("2 GB");
    }

    @Override
    public PC getPC() {
        return pc;
    }
}

