package instruments;

public class ElectricGuitar extends Instrument{

    private int noOfStrings;

    public ElectricGuitar(String name, String colour, InstrumentFamily family, double wholesalePrice, double retailPrice, int noOfStrings) {
        super(name, colour, InstrumentFamily.STRING, wholesalePrice, retailPrice);
        this.noOfStrings = noOfStrings;
    }


    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    @Override
    public String playInstrument() {
        return "Woo!";
    }


}
