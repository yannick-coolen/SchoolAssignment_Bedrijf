import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String bedrijfsNaam, double budget) {
        this.bedrijfsNaam = bedrijfsNaam;
        this.budget = budget;
        this.alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed goed) {
        if (!alleGoederen.contains(goed)) {
            if (budget < goed.huidigeWaarde()) {
                System.out.println("Prijs van goed is te duur.");
            }
            else {
                alleGoederen.add(goed);
                System.out.println(goed);
            }
        }
        else {
            System.out.println("Goed al in bezit");
        }
    }

    public String toString(){
        StringBuilder sGoederen = new StringBuilder();

        for (Goed goed : alleGoederen) {
            sGoederen.append("\n").append(goed);
        }
        return sGoederen.toString();
    }
}
