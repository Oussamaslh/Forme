package PK;

public class Cercle extends Forme {
    private int x;
    private int y;
	    private double rayon;

	    public Cercle(int x, int y, double rayon) {
	        this.x = x;
	        this.y = y;
	        this.rayon = rayon;
	    }

	    @Override
	    public double calculerSurface() {
	        return 2 * Math.PI * rayon;
	    }

	    @Override
	    public double calculerVolume() {
	        return Math.PI * rayon * rayon;
	    }

	    @Override
	    public String toString() {
	        return "Cercle";
	    }

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}
