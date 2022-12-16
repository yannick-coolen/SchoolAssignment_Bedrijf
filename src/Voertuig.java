public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwPrijs;
    protected int bouwJaar;

    public Voertuig(String type, double nieuwPrijs, int bouwJaar) {
        this.type = type;
        this.nieuwPrijs = nieuwPrijs;
        this.bouwJaar = bouwJaar;
    }

    @Override
    public boolean equals(Object object) {
        boolean gelijkeObjecten = false;
        if (object instanceof Voertuig andereVoertuigen) {
            if (this.type.equals(andereVoertuigen.type) &&
                this.nieuwPrijs == andereVoertuigen.nieuwPrijs &&
                this.bouwJaar == andereVoertuigen.bouwJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        return  "Voertuig: " + type + ", Nieuwprijs: \u20ac" + String.format("%.2f",huidigeWaarde()) +
                ", Bouwjaar: " + bouwJaar;
    }
}
