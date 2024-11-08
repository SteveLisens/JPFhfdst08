package be.vdab.jpfhfdst8;

import java.util.Random;

public class Kaart {
    // Definieer kleur en rang
    private static final String[] KLEUREN = {"Harten", "Ruiten", "Klaveren", "Schoppen"};
    private static final String[] RANGEN = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer", "Aas"};

    private final String kleur;
    private final String rang;

    // Constructor om een willekeurige kaart aan te maken
    public Kaart() {
        Random rand = new Random();
        this.kleur = KLEUREN[rand.nextInt(KLEUREN.length)];
        this.rang = RANGEN[rand.nextInt(RANGEN.length)];
    }

    // Methode om de kaart weer te geven
    public void printKaart() {
        System.out.println("Kaart: " + rang + " van " + kleur);
    }

    // Methode om te vergelijken met een andere kaart
    public boolean isHogerDan(Kaart andereKaart) {
        int kleurIndex = getKleurIndex(this.kleur);
        int andereKleurIndex = getKleurIndex(andereKaart.kleur);

        if (kleurIndex > andereKleurIndex) {
            return true; // deze kaart is hoger in kleur
        } else if (kleurIndex == andereKleurIndex) {
            return getRangIndex(this.rang) > getRangIndex(andereKaart.rang); // vergelijk rangen
        }
        return false;
    }

    // Hulpmethodes om indexen te verkrijgen
    private int getKleurIndex(String kleur) {
        for (int i = 0; i < KLEUREN.length; i++) {
            if (KLEUREN[i].equals(kleur)) {
                return i;
            }
        }
        return -1; // foutafhandeling
    }

    private int getRangIndex(String rang) {
        for (int i = 0; i < RANGEN.length; i++) {
            if (RANGEN[i].equals(rang)) {
                return i;
            }
        }
        return -1; // foutafhandeling
    }
}
