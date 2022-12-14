import java.time.LocalDate;
import java.util.Objects;

public class Fiets extends Voertuig {
    private String frameNummer;

    public Fiets(String type, double nieuwPrijs, int bouwJaar, String frameNummer) {
        super(type, nieuwPrijs, bouwJaar);
        this.frameNummer = frameNummer;
    }

    @Override
    public double huidigeWaarde() {
        if (bouwJaar < LocalDate.now().getYear()) {
            return nieuwPrijs * Math.pow(0.9,
                    LocalDate.now().getYear() - bouwJaar);
        }
        return nieuwPrijs;
    }

    @Override
    public boolean equals(Object object) {
        boolean gelijkeObjecten = false;

        if (object instanceof Fiets andereFiets) {
            if (Objects.equals(this.frameNummer, andereFiets.frameNummer)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
