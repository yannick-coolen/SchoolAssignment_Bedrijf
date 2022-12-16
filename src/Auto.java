import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String type, double nieuwPrijs, int bouwJaar, String kenteken) {
        super(type, nieuwPrijs, bouwJaar);
        this.kenteken = kenteken;
    }

    @Override
    public double huidigeWaarde() {
        if (bouwJaar < LocalDate.now().getYear()) {
            return nieuwPrijs * Math.pow(0.7,
                    LocalDate.now().getYear() - bouwJaar);
        }
        return nieuwPrijs;
    }

    @Override
    public boolean equals(Object object) {
        boolean gelijkeObjecten = super.equals(object);
        if (gelijkeObjecten) {
            if (object instanceof Auto andereAuto) {
                gelijkeObjecten = this.kenteken.equals(andereAuto.kenteken);
            }
        }
        return gelijkeObjecten;
    }
}
