package PK;

class Cylindre extends Cercle {
    private double hauteur;

    public Cylindre(int x, int y, double rayon, double hauteur) {
        super(x, y, rayon);
        this.hauteur = hauteur;
    }

    @Override
    public double calculerSurface() {
        return super.calculerSurface() * 2;
    }

    @Override
    public double calculerVolume() {
        return super.calculerVolume() * hauteur;
    }

    @Override
    public String toString() {
        return "Cylindre";
    }
}