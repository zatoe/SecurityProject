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

	private boolean detected = false;
	
	public void disable(Sensor s) {
		s.setDisabled(true);
	}
	
	/**
	 * @return the detected
	 */
	public boolean isDetected() {
		return detected;
	}

	/**
	 * @param detected the detected to set
	 */
	public void setDetected(boolean detected) {
		this.detected = detected;
	}
	
	
	
	
}