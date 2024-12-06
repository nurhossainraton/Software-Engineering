import javax.sound.midi.Soundbank;
import java.util.LinkedList;

public class PC {
    private LinkedList<String> components;
    private LinkedList<String> ram;
    private LinkedList<String> GraphicsCard;

    int sum;
    public PC()
    {
        components = new LinkedList<String>();
        ram=new LinkedList<String>();
        GraphicsCard = new LinkedList<String>();
    }
    public void AddRam(String rm)
    {
        ram.addLast(rm);
    }
    public void AddGraphics(String gc)
    {
        GraphicsCard.addLast(gc);
    }
    public void Show()
    {
        System.out.print("Available Ram(s) : ");
        for(int i=0;i< ram.size();i++)
        {

            System.out.print(ram.get(i));
        }
        System.out.println();
        System.out.print("Available GraphicsCard(s) :");
        for(int i=0;i< GraphicsCard.size();i++)
        {

            System.out.print(GraphicsCard.get(i));
        }
        System.out.println();


    }
    public int total()
    {
        int total = 70000;
        for(int i=0;i< ram.size();i++)
        {
            if(ram.get(i).equalsIgnoreCase("2666 MHz"))
            {
                total+=2620;
            }
            else
                total+=2950;
        }
        for(int i=0;i< GraphicsCard.size();i++)
        {
            if(GraphicsCard.get(i).equalsIgnoreCase("2 GB"))
            {
                total+=6500;
            }
            else
                total+=7600;
        }
        return total;
    }
}
