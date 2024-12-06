import java.util.Scanner;

public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("Press 'O' to start ordering");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();




        int i= 0;

        if(str.equalsIgnoreCase("O")) {
            while(true)
            {
                System.out.println("Which PC do you want? (Press E to exit)");
                String s = scanner.nextLine();
                String s1=null,s2=null;
                if (s.equalsIgnoreCase("pc1")) {
                    Builder pcOne = new PC1();
                    PC1 pc1 = new PC1();
                    System.out.println("Select a RAM type of your PC ");

                     s1 = scanner.nextLine();

                    System.out.println("Select a Graphics Card type of your PC ");
                     s2 = scanner.nextLine();

                    director.Construct(pcOne, s1, s2);
                    System.out.println("Name of your PC : "+s);
                    System.out.println(s+" have CPU, motherboard, 1 TB HDD and the base price  is 70,000 BDT.");
                    System.out.println("Base components : "+pc1.getProcessor() +"(price : "+pc1.getProcessorPrice()+")  "+pc1.getExtra() + "(price : "+pc1.getExtraFeaturePrice()+")");
                    PC pc = pcOne.getPC();
                    pc.Show();
                    int total = pc.total()+pcOne.getPriceExtra();
                    System.out.println("Total price  " + total);

                    i++;
                } else if (s.equalsIgnoreCase("pc2")) {
                    Builder pcTwo = new PC2();
                    PC2 pc2 = new PC2();
                    System.out.println("Select a RAM type of your PC ");

                    s1 = scanner.nextLine();

                    System.out.println("Select a Graphics Card type of your PC ");
                    s2 = scanner.nextLine();

                    director.Construct(pcTwo, s1, s2);
                    System.out.println("Name of your PC : "+s);
                    System.out.println(s+" have CPU, motherboard, 1 TB HDD and the base price  is 70,000 BDT.");
                    System.out.println("Base components : "+pc2.getProcessor() +"(price : "+pc2.getProcessorPrice()+")  "+pc2.getExtra() + "(price : "+pc2.getExtraFeaturePrice()+")");
                    PC pc = pcTwo.getPC();
                    pc.Show();
                    int total = pc.total()+pcTwo.getPriceExtra();
                    System.out.println("Total price  " + total);

                    i++;
                }
                else if (s.equalsIgnoreCase("pc3")) {
                    Builder pcThree = new PC3();
                    PC3 pc3 =new PC3();
                    System.out.println("Select a RAM type of your PC ");

                    s1 = scanner.nextLine();

                    System.out.println("Select a Graphics Card type of your PC ");
                    s2 = scanner.nextLine();

                    director.Construct(pcThree, s1, s2);
                    System.out.println("Name of your PC : "+s);
                    System.out.println(s+" have CPU, motherboard, 1 TB HDD and the base price  is 70,000 BDT.");
                    System.out.println("Base components : "+pc3.getProcessor() +"(price : "+pc3.getProcessorPrice()+")  "+pc3.getExtra() + "(price : "+pc3.getExtraFeaturePrice()+")");
                    PC pc = pcThree.getPC();
                    pc.Show();
                    int total = pc.total()+pcThree.getPriceExtra();
                    System.out.println("Total price  " + total);

                    i++;
                }
                else if (s.equalsIgnoreCase("GamingPc")) {
                    Builder gaming = new GamingPc();
                   GamingPc gamingPc= new GamingPc();
                    System.out.println("Select a RAM type of your PC ");

                    s1 = scanner.nextLine();

                    System.out.println("Select a Graphics Card type of your PC ");
                    s2 = scanner.nextLine();

                    director.Construct(gaming, s1, s2);
                    System.out.println("Name of your PC : "+s);
                    System.out.println(s+" have CPU, motherboard, 1 TB HDD and the base price  is 70,000 BDT.");
                    System.out.println("Base components : "+gamingPc.getProcessor() +"(price : "+gamingPc.getProcessorPrice()+")  ");
                    PC pc = gaming.getPC();
                    pc.Show();
                    int total = pc.total()+gaming.getPriceExtra();
                    System.out.println("Total price  " + total);

                    i++;
                }
                else if(s.equalsIgnoreCase("E") && i !=0)
                {

                    System.exit(1);
                }
            }
            }



    }
}
