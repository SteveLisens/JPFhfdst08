package be.vdab.jpfhfdst8;

public class KaartMain {
    public static void main(String[] args) {
        // Eerste kaart aanmaken
        Kaart kaart1 = new Kaart();
        kaart1.printKaart();

        // Tweede kaart aanmaken
        Kaart kaart2 = new Kaart();
        kaart2.printKaart();

        // Vergelijk de kaarten
        if (kaart1.isHogerDan(kaart2)) {
            System.out.println("De eerste kaart is hoger dan de tweede kaart.");
        } else {
            System.out.println("De tweede kaart is hoger dan de eerste kaart.");
        }
    }
}

