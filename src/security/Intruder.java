package security;
/**
 * 
 */

/**
 * @author William Zielke
 * @author Donald Nardi
 * @author Aarani Premachandra
 * @title Museum Simulation
 * 
 * Class to model an intruder entering the room
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
