package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Container cont = new Container();
        boolean isOnline = true;

        while (isOnline) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "fill":
                    cont.refill(cont, scanner);
                    break;
                case "buy":
                    cont.buy (cont, scanner);
                    break;
                case "take":
                    cont.takeMoney();
                    break;
                case "remaining":
                    cont.showContains();
                    break;
                case "exit":
                    isOnline = false;
                    break;
                default:
                    System.out.println("Wrong command, try buy, fill or take");
            }
        }
    }



}
