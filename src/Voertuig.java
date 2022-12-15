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
        return super.equals(object);
    }

    public String toString() {
        return  "Voertuig: " + type + ", Nieuwprijs: \u20ac" + String.format("%.2f",huidigeWaarde()) +
                ", Bouwjaar: " + bouwJaar;
    }
}
