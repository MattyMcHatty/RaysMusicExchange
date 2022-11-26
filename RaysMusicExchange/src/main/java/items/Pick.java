package items;

import behaviours.ISell;

public class Pick implements ISell {

    private String colour;
    private double thickness_mm;
    private double wholesalePrice;
    private double retailPrice;

    public Pick(String colour, double thickness_mm, double wholesalePrice, double retailPrice){
        this.colour = colour;
        this.thickness_mm = thickness_mm;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.retailPrice - this.wholesalePrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getThickness_mm() {
        return thickness_mm;
    }

    public void setThickness_mm(double thickness_mm) {
        this.thickness_mm = thickness_mm;
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
