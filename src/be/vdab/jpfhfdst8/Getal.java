package be.vdab.jpfhfdst8;

public class Getal {
    private int x;

    public Getal(int a) {
        setX(a);
    }


    public void print() {
        System.out.println("x = " + x);
    }

    public int absoluut() { // (e)
        return Math.abs(x);
    }

    public int som(int a) { // (f)
        return x + a;
    }

    public void add(int a) { // (g)
        x = x + a;
    }

    public float som(float f) { // (h)
        return x + f;
    }

    public double som(double d) { // (h)
        return x + d;
    }

    public double toDouble() { // (i)
        return (double) x;
    }

    public int getX() { // (j)
        return x;
    }

    public void setX(int a) { // (i)
        x = a;
    }
}