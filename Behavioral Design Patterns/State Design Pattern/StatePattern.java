import java.util.Scanner;

public class StatePattern {


    public static int quantity =5;
    Machine machine;

    StatePattern(int amount)
    {
        machine = new Machine();

        if(quantity == 0)
        {
            machine.setEmptyMachine();
        }
         else if(amount == 50 && quantity !=0)
        {

            this.setQuantity(--quantity);
            machine.setNewOrder();
        }
        else if(amount > 50)
        {

            this.setQuantity(--quantity);
            machine.setGreater();
        }

        else
        {
            machine.setInSufficient();
        }
        machine.More(amount);
        machine.SuccessFul(amount);
        machine.Less(amount);
        machine.NoItems(amount);

    }

    public StatePattern() {
        //this.setQuantity(5);
    }

    public void setQuantity(int q)
    {
        quantity = q;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public static void main(String[] args) {
        System.out.println("Product's Price : 50");
        System.out.println("Number Of Products : 5");
        int price,balance =0,input;
        // System.out.println(statePattern.getQuantity());
        while(quantity != 0) {
            System.out.println("Enter your amount : ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            balance +=input;
            new StatePattern(balance);
            if(balance >=50)
                balance =0;

        }
    }



}
