import utils.Utilizer;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwPrijs;
    protected int bouwJaar;

    public Voertuig(String type, double nieuwPrijs, int bouwJaar) {
        this.type = type;
        this.nieuwPrijs = nieuwPrijs;
        this.bouwJaar = bouwJaar;
    }

    /**
     * Vergelijkt de door gepaste object met een andere instantie
     * met als doeleinde om een vegelijkingscheck uit te voeren.
     * @param object Biedt de mogelijkheid om een nieuw object type door te pasen.
     * @return De waarden van gelijkeObjecten, true of false
     */
    @Override
    public boolean equals(Object object) {
        boolean gelijkeObjecten = false;
        // Checkt of de door gepaste object instantie is met een andereVoertuigen
        if (object instanceof Voertuig andereVoertuigen) {
            // Als type gelijk is aan andereVoertuigen type
            // En nieuwPrijs gelijk is aan andereVoertuigen nieuwPrijs
            // En bouwJaar gelijk is aan andereVoertuigen bouwJaar,
            // Dan wordt gelijkeObjecten omgezet tot true.
            if (this.type.equals(andereVoertuigen.type) &&
                this.nieuwPrijs == andereVoertuigen.nieuwPrijs &&
                this.bouwJaar == andereVoertuigen.bouwJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        return  "Voertuig: " + type + ", Nieuwprijs: " + Utilizer.euroBedrag(huidigeWaarde()) +
                ", Bouwjaar: " + bouwJaar;
    }
}
