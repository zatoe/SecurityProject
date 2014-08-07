/**
 * 
 */
package security;

/**
 * @author William Zielke
 * @author Donald Nardi
 * @author Aarani Premachandra
 * @title Museum Simulation
 * 
 * Class to model an Entrance to a room
 */
public abstract class Entrance extends MuseumObject {
	private boolean open;
	private Sensor sensor;
	
	public Entrance(int posX, int posY) {
		super(posX, posY);
		open = false;
	}

	/**
	 * @return the open
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * @param open the open to set
	 */
	public void setOpen(boolean open) {
		if (open && !sensor.isDisabled()) {
			Museum.soundAlarm(getPosX(), getPosY());
		}
		
		this.open = open;
	}

	/**
	 * @return the sensor
	 */
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * @param sensor the sensor to set
	 */
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	
	
}
