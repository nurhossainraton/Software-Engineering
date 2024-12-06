package Problem2;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        System.out.println("Press 1 for Giving Order 2 to Exit");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while(a==1)
        {
            BasicComponent basicCoffee = new BasicComponent ();
            System.out.println("Press 1 to Order Americano,2 to Order Espresso , 3 to Order Cappuccino, 4 to Order Mocha ");
            int order = scanner.nextInt();
            if(order == 1)
            {
                Americano americano = new Americano();
                americano.setBasicIngredients(basicCoffee);
                americano.makeCoffee();
            }
           else if(order == 2)
            {
                Espresso espresso = new Espresso();
                espresso.setBasicIngredients(basicCoffee);
                espresso.makeCoffee();
            }
            else if(order == 3)
            {
                Cappucino cappucino = new Cappucino();
                cappucino.setBasicIngredients(basicCoffee);
                cappucino.makeCoffee();
            }
            else if(order == 4)
            {
                Mocha mocha = new Mocha();
                mocha.setBasicIngredients(basicCoffee);
                mocha.makeCoffee();
            }

            System.out.println("Your Order is Completed !");
            System.out.println("---------------------------");
            System.out.println("Press 1 for Giving New Order 2 to Exit");
            a = scanner.nextInt();
        }


    }

}
