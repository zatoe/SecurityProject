/**
 * 
 */
package security;

/**
 * @author Zatoe
 *
 */
public class LaserSensor extends Sensor {

	public LaserSensor(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see security.Sensor#setMonitoredZone(security.Space[][])
	 */
	@Override
	public void setMonitoredZone(Space[][] grid) {
		int x = this.getPosX();
		int y = this.getPosY();
		
		while (!(grid[x][y].getObject() instanceof Wall)) {
			
		}

	}

}
