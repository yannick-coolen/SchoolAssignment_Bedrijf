import java.util.ArrayList;
import Utils.*;

public class BedrijfsInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String bedrijfsNaam, double budget) {
        this.bedrijfsNaam = bedrijfsNaam;
        this.budget = budget;
        this.alleGoederen = new ArrayList<Goed>();
    }

    /**
     * Biedt de mogelijkheid om goed aan de lijst goederen toe te voegen, als
     * goed nog niet in bezit is en dat de prijs niet hoger is dan het huidigewaarde
     * @param goed Biedt de mogelijkheid om Goed data waarde door te pasen
     */
    public void schafAan(Goed goed) {
        // Als alleGoederen niet de doorgevoerde goed waarde bevat,
        // dan wordt het budget gechecked of deze lager of gelijk
        // aan huidigeWaarde is.
        if (!alleGoederen.contains(goed)) {
            // Als het budget niet lager of gelijk aan huidigeWaarde is,
            // dan wordt er een nieuwe door gepaste goed aan de lijst
            // alleGoederen toegevoegd.
            if (budget <= goed.huidigeWaarde()) {
                System.out.println("Prijs van goed is te duur.");
            } else {
                alleGoederen.add(goed);
                System.out.println(goed);
            }
        } else {
            System.out.println("Goed is al in bezit");
        }
    }

    public String toString(){
        StringBuilder sGoederen = new StringBuilder();
        // Voeg bij elk goed dat in de lijst alleGoederen zit
        // de stringwaarde van goed toe.
        for (Goed goed : alleGoederen) {
            sGoederen.append("\n").append(goed);
        }
        return sGoederen.toString();
    }
}
