package items;

import behaviours.ISell;
import instruments.Instrument;

public class SheetMusic implements ISell {
    private String name;
    private int pages;
    private String instrument;
    private double wholesalePrice;
    private double retailPrice;

    public SheetMusic(String name, int pages, String instrument, double wholesalePrice, double retailPrice){
        this.name = name;
        this.pages = pages;
        this.instrument = instrument;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;

    }

    @Override
    public double calculateMarkup() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
