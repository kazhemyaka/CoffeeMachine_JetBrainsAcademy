package machine;
import java.util.Scanner;

class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int dCups = 9;
    static int money = 550;

    public static void start() {
        print("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();
        System.out.println();
        switch (action) {
            case "buy":
                actionBuy();
                System.out.println();
                break;
            case "fill":
                actionFill();
                System.out.println();
                break;
            case "take":
                actionTake();
                System.out.println();
                break;
            case "remaining":
                remaining();
                System.out.println();
                break;
            case "exit":
                System.exit(0);
            default:
                print("Not correct action");
        }
        start();
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void remaining() {
        print("The coffee machine has:");
        print(water + " ml of water");
        print(milk + " ml of milk");
        print (beans + " g of coffee beans");
        print(dCups + " disposable cups");
        print("$" + money + " of money");
    }

    public static void actionBuy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                if (water >= 250 && beans >= 16 && dCups >= 1) {
                    print("I have enough resources, making you a coffee!");
                    water = water - 250;
                    beans = beans - 16;
                    money = money + 4;
                    dCups--;
                } else if (water < 250) {
                    print("Sorry, not enough water!");
                } else if (beans < 16) {
                    print("Sorry, not enough coffee beans!");
                } else if (dCups < 1) {
                    print("Sorry, not enough cups!");
                }
                break;
            case "2":
                if (water >= 350 && milk >= 75 && beans >= 20 && dCups >= 1) {
                    print("I have enough resources, making you a coffee!");
                    water = water - 350;
                    beans = beans - 20;
                    milk = milk - 75;
                    money = money + 7;
                    dCups--;
                } else if (water < 350) {
                    print("Sorry, not enough water!");
                } else if (milk < 75) {
                    print("Sorry, not enough milk!");
                } else if (beans < 20) {
                    print("Sorry, not enough coffee beans!");
                } else if (dCups < 1) {
                    print("Sorry, not enough cups!");
                }
                break;
            case "3":
                if (water >= 200 && milk >= 100 && beans >= 12 && dCups >= 1) {
                    print("I have enough resources, making you a coffee!");
                    water = water - 200;
                    beans = beans - 12;
                    milk = milk - 100;
                    money = money + 6;
                    dCups--;
                } else if (water < 200) {
                    print("Sorry, not enough water!");
                } else if (milk < 100) {
                    print("Sorry, not enough milk!");
                } else if (beans < 12) {
                    print("Sorry, not enough coffee beans!");
                } else if (dCups < 1) {
                    print("Sorry, not enough cups!");
                }
                break;
            case "exit":
                break;
            default:
                print("Not correct choice");
        }
    }

    public static void actionFill() {
        print("Write how many ml of water you want to add: ");
        int addWater = scanner.nextInt();
        water = addWater + water;
        print("Write how many ml of milk you want to add: ");
        int addMilk = scanner.nextInt();
        milk = addMilk + milk;
        print("Write how many grams of coffee beans you want to add: ");
        int addBeans = scanner.nextInt();
        beans = addBeans + beans;
        print("Write how many disposable cups you want to add: ");
        int addDCups = scanner.nextInt();
        dCups = addDCups + dCups;
    }

    public static void actionTake() {
        print("I gave you $" + money);
        money = 0;
    }

    public static void main(String[] args) {
        start();
    }
}