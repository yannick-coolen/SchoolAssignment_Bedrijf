import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String type, double nieuwPrijs, int bouwJaar, String kenteken) {
        super(type, nieuwPrijs, bouwJaar);
        this.kenteken = kenteken;
    }

    @Override
    public double huidigeWaarde() {
        // Als de bouwJaar kleiner is dan het huidige jaar
        // Dan gaat er 30% van het huidige waarde af
        if (bouwJaar < LocalDate.now().getYear()) {
            return nieuwPrijs * Math.pow(0.7,
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
            // Als object instantie is van Auto
            // Dan word er gecheckt of het kenteken van auto true is.
            // (Bij true betekent dit dat de waarden van het kenteken niet uniek is)
            if (object instanceof Auto andereAuto) {
                gelijkeObjecten = this.kenteken.equals(andereAuto.kenteken);
            }
        }
        return gelijkeObjecten;
    }
}
