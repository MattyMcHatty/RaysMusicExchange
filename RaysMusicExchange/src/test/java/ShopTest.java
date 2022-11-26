import instruments.DrumKit;
import instruments.ElectricGuitar;
import instruments.InstrumentFamily;
import items.Pick;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    DrumKit drumkit;
    ElectricGuitar electricGuitar;
    Pick pick;
    SheetMusic sheetMusic;
    Shop shop;


    @Before
    public void before(){
        drumkit = new DrumKit("Pearl Elite", "Black", InstrumentFamily.PERCUSSION, 499, 799, 5, false);
        electricGuitar = new ElectricGuitar("Fender Stratocaster", "Sunburst", InstrumentFamily.STRING, 349, 599, 6);
        pick = new Pick("Green", 1, 0.20, 0.50);
        sheetMusic = new SheetMusic("Guitar for Dummies", 120, "Guitar", 12, 18);
        shop = new Shop("Rays Music Exchange");

    }

    @Test
    public void canAddItemToStock(){
        shop.addToStock(drumkit);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canAddMultipleItemsToStock(){
        shop.addToStock(electricGuitar);
        shop.addToStock(pick);
        shop.addToStock(sheetMusic);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(electricGuitar);
        shop.addToStock(pick);
        shop.addToStock(sheetMusic);
        assertEquals(3, shop.getStock().size());
        shop.removeFromStock(pick);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addToStock(electricGuitar);
        shop.addToStock(drumkit);
        assertEquals(550, shop.calculateTotalPotentialProfit(), 0.01);

    }
}
