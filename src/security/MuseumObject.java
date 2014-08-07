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
 * Base class for all placeable objects within a grid
 */
public abstract class MuseumObject {
	private int posX;
	private int posY;
	
	
	/**
	 * @param posX
	 * @param posY
	 */
	public MuseumObject(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}
	
	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}
	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
