public abstract class Voertuig implements Goed {
    public String type;
    protected double nieuwPrijs;
    protected int bouwJaar;

    public Voertuig(String type, double nieuwPrijs, int bouwJaar) {
        this.type = type;
        this.nieuwPrijs = nieuwPrijs;
        this.bouwJaar = bouwJaar;
    }

    @Override
    public boolean equals(Object object) {
        boolean gelijkeObject = false;

        if (object instanceof Auto auto) {
            if (this.bouwJaar == auto.bouwJaar) {
                nieuwPrijs = auto.huidigeWaarde();
            }
        }

        if (object instanceof Fiets fiets) {
            if (this.bouwJaar == fiets.bouwJaar) {
                nieuwPrijs = fiets.huidigeWaarde();
            }
        }
        return gelijkeObject;
    }

    public String toString() {
        return  "Voertuig: " + type + ", Nieuwprijs: \u20ac" + String.format("%.2f",huidigeWaarde()) +
                ", Bouwjaar: " + bouwJaar;
    }
}
