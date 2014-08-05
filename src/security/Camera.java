/**
 * 
 */
package security;

/**
 * @author Zatoe
 * Sensor class that models a camer with omnidirectional view
 */
public class Camera extends Sensor {
	private static int distance = 10;
	
	public Camera(int posX, int posY) {
		super(posX, posY);
	}

	/* (non-Javadoc)
	 * @see security.Sensor#setMonitoredZone(security.Space[][])
	 */
	@Override
	public void setMonitoredZone(Space[][] grid) {
		//Sets all squares in a circle surround the camera to monitored
		int diameter = distance * 2 + 1;
		int y = this.getPosY() - distance;
		
		//top half of circle
		int diameterCount = diameter;
		int startY = y;
		
		for (int i = 0; i < distance + 1; i++) {
			for (int j = 0; j < diameterCount; j++) {				
				try {
					grid[this.getPosX() - i][startY + j].setMonitored(true);
				} catch (ArrayIndexOutOfBoundsException e) {
					//purposefully do nothing lazy and don't want to figure out math
				}
			}
			diameterCount -= 2;
			startY++;
		}
		
		//bottom half of circle
		diameterCount = diameter - 2;
		startY = y + 1;
		
		for (int i = 1; i <= distance; i++) {
			for (int j = 0; j < diameterCount; j++) {
				try {
					grid[this.getPosX() + i][startY + j].setMonitored(true);
				} catch (ArrayIndexOutOfBoundsException e) {
					//purposefully do nothing lazy and don't want to figure out math
				}
			}
			diameterCount -= 2;
			startY++;
		}
	}

	/**
	 * @return the distance
	 */
	public static int getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public static void setDistance(int distance) {
		Camera.distance = distance;
	}
	
	

}
