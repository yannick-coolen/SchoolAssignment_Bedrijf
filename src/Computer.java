import java.time.LocalDate;

public class Computer implements Goed {
    private String type, macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }

    @Override
    public double huidigeWaarde() {
        if (productieJaar < LocalDate.now().getYear()) {
            return aanschafPrijs * Math.pow(0.6,
                    LocalDate.now().getYear() - productieJaar);
        }
        return aanschafPrijs;
    }

    @Override
    public boolean equals(Object object) {
        boolean gelijkeObjecten = false;
        if (object instanceof Computer andereComputer) {
            if (this.type.equals(andereComputer.type) &&
                this.macAdres.equals(andereComputer.macAdres) &&
                this.aanschafPrijs == andereComputer.aanschafPrijs &&
                this.productieJaar == andereComputer.productieJaar) {
                gelijkeObjecten = true;
            };
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return "Computertype: " + type +", MAC Adres: " + macAdres + ", Prijs: \u20ac" +
                String.format("%.2f",huidigeWaarde()) + ", Productiejaar: " + productieJaar;
     }
}
