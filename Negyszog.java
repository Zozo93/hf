/**
 * @author Rédai Dávid
 *
 */
package sikidom;

public abstract class Negyszog extends Sikidom {

	public Negyszog() {
		
	}

	@Override
	public float keruletSzamol() {
     double ker=4*a;
	}

	@Override
	public abstract float teruletSzamol();
     double ter=Math.pow(a,2);
}
