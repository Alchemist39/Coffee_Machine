package machine;

import java.util.Scanner;

public class Container {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int money = 550;
    int cups = 9;

    public void addMilk (int fill) {
        milk += fill;
    }

    public int getMilk () {
        return milk;
    }

    public void addWater (int fill) {
        water += fill;
    }

    public int getWater () {
        return water;
    }

    public void addCoffeeBeans (int fill) {
        coffeeBeans += fill;
    }

    public int getCoffeeBeans () {
        return coffeeBeans;
    }

    public void takeMoney () {
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }

    public int getMoney () {
        return money;
    }

    public void addCups (int fill) {
        cups += fill;
    }
    public int getCups () {
        return cups;
    }

    public void makeEspresso () {
        if (water < 250) {
            System.out.println("Sorry, not enough water!\n");
        }
        if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!\n");
        }
        if (cups == 1) {
            System.out.println("Sorry, not enough cups!\n");
        }
        if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
            water -= 250;
            coffeeBeans -= 16;
            cups -=1;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }

    public void makeLatte () {
        if (water < 350) {
            System.out.println("Sorry, not enough water!\n");
        }
        if (milk < 75) {
            System.out.println("Sorry, not enough milk!\n");
        }
        if (coffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans!\n");
        }
        if (cups == 1) {
            System.out.println("Sorry, not enough cups!\n");
        }
        if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            cups -=1;
            money += 7;
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }

    public void makeCappuccino () {
        if (water < 200) {
            System.out.println("Sorry, not enough water!\n");
        }
        if (milk < 100) {
            System.out.println("Sorry, not enough milk!\n");
        }
        if (coffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!\n");
        }
        if (cups == 1) {
            System.out.println("Sorry, not enough cups!\n");
        }
        if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            cups -=1;
            money += 6;
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }

    public void showContains () {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water ");
        System.out.println(milk + " of milk ");
        System.out.println(coffeeBeans + " of coffee beans ");
        System.out.println(cups + " of disposable cups ");
        System.out.println("$" + money + " of money\n");
    }

    public void refill (Container cont, Scanner scanner) {
        System.out.println("Write how many ml of water do you want to add: ");
        cont.addWater(scanner.nextInt());
        System.out.println("Write how many ml of milk do you want to add: ");
        cont.addMilk(scanner.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        cont.addCoffeeBeans(scanner.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cont.addCups(scanner.nextInt());
    }
    public void buy (Container cont, Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String action_2 = scanner.next();
        switch (action_2) {
            case "1":
                cont.makeEspresso();
                break;
            case "2":
                cont.makeLatte();
                break;
            case "3":
                cont.makeCappuccino();
                break;
            case "back":
                break;
            default:
                System.out.println("Wrong input, try 1, 2 or 3");
        }
    }
}
