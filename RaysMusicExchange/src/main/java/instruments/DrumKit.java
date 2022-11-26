package instruments;

public class DrumKit extends Instrument{

    private int noOfSymbols;
    private boolean sticksIncluded;

    public DrumKit(String name, String colour, InstrumentFamily family, double wholesalePrice, double retailPrice, int noOfSymbols, boolean sticksIncluded) {
        super(name, colour, InstrumentFamily.PERCUSSION, wholesalePrice, retailPrice);
        this.noOfSymbols = noOfSymbols;
        this.sticksIncluded = sticksIncluded;

    }

    public int getNoOfSymbols() {
        return noOfSymbols;
    }

    public void setNoOfSymbols(int noOfSymbols) {
        this.noOfSymbols = noOfSymbols;
    }

    public boolean isSticksIncluded() {
        return sticksIncluded;
    }

    public void setSticksIncluded(boolean sticksIncluded) {
        this.sticksIncluded = sticksIncluded;
    }

    @Override
    public String playInstrument() {
        return "Bish, Bash, Bosh!";
    }
}
