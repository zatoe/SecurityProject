package security;
/**
 * 
 */

/**
 * @author Zatoe
 * Base class to model various sensors on
 */
public abstract class Sensor extends MuseumObject {
	private boolean intruderDetected;
	private boolean disabled = false;
	
	public Sensor(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Abstract method to implement what spaces in a room the sensor is monitoring
	 * @param grid
	 */
	public abstract void setMonitoredZone(Space[][] grid);
	
	/**
	 * @return the intruderDetected
	 */
	public boolean isIntruderDetected() {
		return intruderDetected;
	}

	/**
	 * @param intruderDetected the intruderDetected to set
	 */
	public void setIntruderDetected(boolean intruderDetected) {
		this.intruderDetected = intruderDetected;
	}

	/**
	 * @return the disabled
	 */
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * @param disabled the disabled to set
	 */
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	
	
	
}
