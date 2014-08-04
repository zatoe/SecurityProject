package security;

import java.util.Arrays;

/**
 * 
 */

/**
 * @author Zatoe
 *
 */
public class Museum {
	private int sizeX;
	private int sizeY;
	private Space[][] grid;
	
	/**
	 * @param sizeX
	 * @param sizeY
	 */
	public Museum(int sizeX, int sizeY) {
		super();
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		grid = new Space[this.sizeX][this.sizeY];
		fillGrid();
	}
	
	
	/**
	 * Function to add an MuseumObject to the grid
	 * @param o The museum object to put into the grid
	 */
	public void place(MuseumObject o) {
		Space s = grid[o.getPosX()][o.getPosY()];
		if (o instanceof Intruder) {
			placeIntruder((Intruder) o);
		
		} else if (o instanceof Entrance) {
			placeEntrance((Entrance) o);
		} else if (s.isEmpty()) {
			s.setObject(o);
			if (o instanceof Sensor) {
				((Sensor) o).setMonitoredZone(grid);
			}
			
		} else {
			System.out.println("Space is not free");
		}
		
	}
	
	private void placeIntruder(Intruder i) {
		if (grid[i.getPosX()][i.getPosY()].isMonitored()) {
			soundAlarm();
		} else {
			System.out.println("Intruder is hidden.");
		}
	}
	
	private void placeEntrance(Entrance e) {
		MuseumObject o = grid[e.getPosX()][e.getPosY()].getObject();
		if (o instanceof Wall) {
			((Wall) o).setEntrance(e);
		} else {
			System.out.println("Entrance requires a wall to be placed in.");
		}
	}
	
	private void soundAlarm() {
		System.out.println("The alarm has been sounded!");
	}
	
	private void fillGrid() {
		for (int i = 0; i < sizeX; i++) {
			Arrays.fill(grid[i], new Space());
		}
	}
	
	public void createSquareWall() {
		//create horizontal walls (WEST to EAST)
		for (int i = 0; i < sizeY; i++) {
			MuseumObject w1 = new Wall(i, 0);
			this.place(w1);
			MuseumObject w2 = new Wall(i, sizeY - 1);
			this.place(w2);
		}
		
		//create "vertical" walls (NORTH to SOUTH);
		for (int i = 0; i < sizeX; i++) {
			MuseumObject w1 = new Wall(0, i);
			this.place(w1);
			MuseumObject w2 = new Wall(sizeX - 1, i);
			this.place(w2);
		}
	}
}
