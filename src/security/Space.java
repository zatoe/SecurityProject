/**
 * 
 */
package security;

/**
 * @author Zatoe
 *
 */
public class Space {
	private boolean empty;
	private boolean monitored;
	private MuseumObject object;
	
	public Space() {
		empty = true;
		monitored = false;
		object = null;
	}

	/**
	 * @return the empty
	 */
	public boolean isEmpty() {
		return empty;
	}

	/**
	 * @param empty the empty to set
	 */
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	/**
	 * @return the detected
	 */
	public boolean isMonitored() {
		return monitored;
	}

	/**
	 * @param detected the detected to set
	 */
	public void setMonitored(boolean monitored) {
		this.monitored = monitored;
	}

	/**
	 * @return the object
	 */
	public MuseumObject getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(MuseumObject object) {
		this.object = object;
		this.empty = false;
	}
	
	
}
