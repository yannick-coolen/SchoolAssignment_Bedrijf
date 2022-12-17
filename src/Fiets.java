import java.time.LocalDate;

public class Fiets extends Voertuig {
    private String frameNummer;

    public Fiets(String type, double nieuwPrijs, int bouwJaar, String frameNummer) {
        super(type, nieuwPrijs, bouwJaar);
        this.frameNummer = frameNummer;
    }

    @Override
    public double huidigeWaarde() {
        // Als de bouwJaar kleiner is dan het huidige jaar
        // Dan gaat er 10% van het huidige waarde af
        if (bouwJaar < LocalDate.now().getYear()) {
            return nieuwPrijs * Math.pow(0.9,
                    LocalDate.now().getYear() - bouwJaar);
        }
        return nieuwPrijs;
    }

    @Override
    public boolean equals(Object object) {
        // gelijkeObject erft de waarden over van equals methode uit de Parent clas
        boolean gelijkeObjecten = super.equals(object);
        // Als gelijkeObjecten true is
        // Dan wordt de instantie van door gepaste object gecheckt
        if (gelijkeObjecten) {
            // Als object instantie is van Fiets
            // Dan word er gecheckt of de frameNummer van fiets true is.
            // (Bij true betekent dit dat de waarden van het frameNummer niet uniek is)
            if (object instanceof Fiets andereFiets) {
                gelijkeObjecten = this.frameNummer.equals(andereFiets.frameNummer);
            }
        }
        return gelijkeObjecten;
    }
}
