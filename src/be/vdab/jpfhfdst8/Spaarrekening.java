package be.vdab.jpfhfdst8;

public class Spaarrekening {
    private String rekeningNummer;
    private double saldo;
    private static double intrest;

    public Spaarrekening(String reknr, double intrest) {
        rekeningNummer = reknr;
        intrest = intrest;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getIntrest() {
        return intrest;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }

    public Spaarrekening(String reknr, double saldo, double intrest) {
        this(reknr, intrest);
        this.saldo = saldo;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(String reknr) {
        rekeningNummer = reknr;
    }

    public double getSaldo() {
        return saldo;
    }

    public void storten(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }

    public void afhalen(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
        }
    }

    public void overschrijven(Spaarrekening spaarRek, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            spaarRek.storten(bedrag);
        }
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }
}
