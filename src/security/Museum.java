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
			System.out.println("Space is not free Object: ");
		}
		
	}
	
	private void placeIntruder(Intruder i) {
		Space s = grid[i.getPosX()][i.getPosY()];
		if (s.getObject() instanceof Wall) {
			System.out.println("Cannot place intruder inside of a wall.");
		} else if (s.isMonitored()) {
			soundAlarm(i.getPosX(), i.getPosY());
		} else {
			System.out.println("Intruder is hidden.");
		}
	}
	
	private void placeEntrance(Entrance e) {
		MuseumObject o = grid[e.getPosX()][e.getPosY()].getObject();
		if (o instanceof Wall) {
			if (((Wall) o).getEntrance() == null) {
				((Wall) o).setEntrance(e);
				
			} else {
				System.out.println("There is alread an entrance on this section.");
			}
			
		} else {
			System.out.println("Entrance requires a wall to be placed in.");
		}
	}
	
	public static void soundAlarm(int x, int y) {
		System.out.println("The alarm has been sounded at coordinates " + x + ", " + y + "!");
	}
	
	private void fillGrid() {
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				grid[i][j] = new Space();
			}
		}
	}
	
	public void createSquareWall() {
		//create horizontal walls (WEST to EAST)
		for (int i = 0; i < sizeY; i++) {
			place(new Wall(0, i));
			place(new Wall(sizeX - 1, i));
			
		}
		
		//create "vertical" walls (NORTH to SOUTH);
		for (int i = 1; i < sizeX - 1; i++) {
			place(new Wall(i, 0));
			place(new Wall(i, sizeY - 1));
			
		}
	}
	
	public void placeCameras() {
		int d = Camera.getDistance();
		for (int i = 1; i < sizeX - 1; i += d) {
			for (int j = 1; j < sizeY - 1; j += d) {
				place(new Camera(i, j));
			}
		}
	}
	
	public void printGrid() {
		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				char c = 'E';
				MuseumObject o = grid[i][j].getObject();
				
				if (o instanceof Wall) {
					if (((Wall) o).getEntrance() instanceof Door) {
						c = 'D';
					} else if (((Wall) o).getEntrance() instanceof Window) {
						c = 'w';
					} else {
						c = 'W';
					}
				} else if (o instanceof Camera) {
					c = 'C';
				} else if (grid[i][j].isMonitored()) {
					c = 'M';
				} else {
					c = 'E';
				}
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
