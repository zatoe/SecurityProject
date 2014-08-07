/**
 * 
 */
package security;

/**
 * @author William Zielke
 * @author Donald Nardi
 * @author Aarani Permachandra
 * @title Museum Simulation
 * 
 * Class to serve as a place to hold Entrances
 */
public class Wall extends MuseumObject {
	private Entrance entrance;
	
	public Wall(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	
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
