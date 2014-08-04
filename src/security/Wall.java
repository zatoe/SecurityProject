/**
 * 
 */
package security;

/**
 * @author Zatoe
 *
 */
public class Wall extends MuseumObject {
	public Wall(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}

	private Entrance entrance;
	
	/**
	 * @return the entrance
	 */
	public Entrance getEntrance() {
		return entrance;
	}

	/**
	 * @param entrance the entrance to set
	 */
	public void setEntrance(Entrance entrance) {
		this.entrance = entrance;
	}
}
