/**
 * @author Rédai Dávid
 *
 */
package sikidom;

public class Haromszog extends Sikidom {

	public Haromszog() {

	}

	@Override
	public float keruletSzamol() {
       double ker=a+b+c;
	}

	@Override
	public float teruletSzamol() {
		double s=(a+b+c)/2;
		double ter=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
