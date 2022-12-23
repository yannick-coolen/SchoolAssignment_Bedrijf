import utils.Utilizer;

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
        // Als de bouwJaar kleiner is dan het huidige jaar
        // Dan gaat er 40% van de waarden van aanschafPrijs af
        if (productieJaar < LocalDate.now().getYear()) {
            return aanschafPrijs * Math.pow(0.6,
                    LocalDate.now().getYear() - productieJaar);
        }
        return aanschafPrijs;
    }

    @Override
    public boolean equals(Object object) {
        boolean gelijkeObjecten = false;
        // Als gelijkeObjecten true is
        // Dan wordt de instantie van door gepaste object gecheckt
        if (object instanceof Computer andereComputer) {
            // Als type gelijk is aan andereComputer type
            // En macAdres gelijk is aan andereComputer macAdres
            // En aanschafPrijs gelijk is aan anderComputer aanschafPrijs
            // En productieJaar gelijk is aan andereVoertuigen productieJaar,
            // Dan wordt gelijkeObjecten omgezet tot true.
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
        return "Computertype: " + type +", MAC Adres: " + macAdres + ", Prijs: " +
                Utilizer.euroBedrag(huidigeWaarde()) + ", Productiejaar: " + productieJaar;
     }
}
