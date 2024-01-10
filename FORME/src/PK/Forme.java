package PK;

abstract class Forme implements Comparable<Forme> {
    public abstract double calculerSurface();
    public abstract double calculerVolume();

    public abstract String toString();

    public void afficherInfo() {
        System.out.println(toString());
        System.out.println("Surface : " + calculerSurface());
        System.out.println("Volume : " + calculerVolume());
    }
  

    @Override
    public int compareTo(Forme f) {
        return Double.compare(this.calculerSurface(), f.calculerSurface());
    }
}

