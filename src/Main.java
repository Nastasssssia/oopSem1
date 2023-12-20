import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import service.CoinDispenser;
import service.Display;
import service.Holder;
import service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product item1 = new Product("Lays",100,0,"sneki");
        Product item2 = new Product("Twix",50,1,"sugar");
        Product item3 = new Product("Nuts",20,2,"sugar");
        //полиморфизм
        Product item4 = new Bottle("cola",89, 3,"drinks", 0.5);
        Product item5 = new HotDrink("coffee", 50,4,"drinks", 50);
        Product item6 = new HotDrink("tea",40, 5, "drinks", 50);
        List<Product> assort = new ArrayList<>();
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);
        // System.out.println(assort);

        Holder hold1 = new Holder();

        CoinDispenser cd1 = new CoinDispenser();

        Display disp1 = new Display();

        //создаем vendingMachine и передаем все заданные составляющие, в том порядке как в конструкторе
        VendingMachine mach1 = new VendingMachine(hold1, cd1,disp1,assort);

        for (Product prod:mach1.getProducts()) {
            System.out.println(prod);
        }
        }
    }
