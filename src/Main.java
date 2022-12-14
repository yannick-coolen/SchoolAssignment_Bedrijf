public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bedrijfsInventaris = new BedrijfsInventaris("HU", 20_000.00);
        Auto auto = new Auto("Mercedes-Benz A-klasse A 180",
                29_995.00, 2019, "4-ZTV-94");
        // Computer
        Computer computer1 = new Computer("HP ENVY X360 2-IN-1 LAPTOP 15-EW0140ND", "2a:f3:87:e4:6b:a5",
                899.99,2021);
        Computer computer2 = new Computer("HP ENVY X360 2-IN-1 LAPTOP 15-EW0140ND", "2a:f3:87:e4:6b:a5",
                899.99,2021);
        bedrijfsInventaris.schafAan(computer1);
        bedrijfsInventaris.schafAan(computer2);
        System.out.println();
        // Fiets
        Fiets fiets1 = new Fiets("Stadsfiets", 549.00, 2020,"MG3286152");
        Fiets fiets2 = new Fiets("Stadsfiets", 549.00, 2020,"MG3286152");
        Voertuig voertuig1 = fiets1;
        Voertuig voertuig2 = fiets2;
        bedrijfsInventaris.schafAan(voertuig1);
        bedrijfsInventaris.schafAan(voertuig2);
        System.out.println();
        // Auto
        Auto auto1 = new Auto("Opel Zafira 1.8 7 Pers Temptation",
                28_945.00, 2019, "5-RFS-46");
        Auto auto2 = new Auto("Opel Zafira 1.8 7 Pers Temptation",
                28_945.00, 2019, "5-RFS-46");
        Voertuig voertuig3 = auto1;
        Voertuig voertuig4 = auto2;
        bedrijfsInventaris.schafAan(voertuig3);
        bedrijfsInventaris.schafAan(voertuig4);
        System.out.println();

        Fiets fiets3 = new Fiets("Batavus PackD-3", 699.00, 2022, "GFG5624629");
        bedrijfsInventaris.schafAan(fiets3);
        System.out.println();

        Auto auto3 = new Auto("Volkswagen Polo", 26_890.00,2022, "3-HDS-82");
        bedrijfsInventaris.schafAan(auto3);
        Auto auto4 = new Auto("Volkswagen Polo", 26_890.00,2021, "3-HDS-82");
        bedrijfsInventaris.schafAan(auto4);

        System.out.println(bedrijfsInventaris);
    }
}
