package security;
/**
 * 
 */

/**
 * @author Zatoe
 *
 */
public class Intruder extends MuseumObject {
	
	public Intruder(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	
	public void disable(Sensor s) {
		s.setDisabled(true);
	}
}
