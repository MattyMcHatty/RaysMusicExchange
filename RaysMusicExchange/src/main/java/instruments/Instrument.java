package instruments;

import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private String colour;
    private InstrumentFamily family;
    private double wholesalePrice;
    private double retailPrice;

    public Instrument(String name, String colour, InstrumentFamily family, double wholesalePrice, double retailPrice){
        this.name = name;
        this.colour = colour;
        this.family = family;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public void setFamily(InstrumentFamily family) {
        this.family = family;
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

    public double calculateMarkup(){
        return this.retailPrice - this.wholesalePrice;
    }
}
