import java.time.LocalDate;
import java.util.Objects;

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
        boolean gelijkeObjecten = false;

        if (object instanceof Auto andereAuto) {
            if (Objects.equals(this.kenteken, andereAuto.kenteken)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
