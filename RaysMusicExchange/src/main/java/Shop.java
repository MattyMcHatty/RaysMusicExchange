import behaviours.ISell;
import instruments.DrumKit;
import items.Pick;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        for(ISell thing: stock){
            if(thing == item){
                stock.remove(thing);
            }

        }
    }

    public double calculateTotalPotentialProfit() {
        double totalProfit = 0;
        for(ISell thing: stock){
            totalProfit += thing.calculateMarkup();
        }
        return totalProfit;
    }
}
