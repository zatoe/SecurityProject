/**
 * 
 */
package security;

/**
 * @author Zatoe
 *
 */
public class SecurityMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sizeX = 29;
		int sizeY = 32;
		Museum m = new Museum(sizeX, sizeY);
		m.createSquareWall();
		m.placeCameras();
		MuseumObject c1 = new Camera(24, 30);
		MuseumObject c2 = new Camera(6, 30);
		MuseumObject c3 = new Camera(16, 30);
		Entrance d1 = new Door(sizeX - 1, sizeY/2);
		Entrance w1 = new Window(sizeX - 1, 10);
		
		for (int i = 3; i < sizeX; i += 3) {
			m.place(new Window(0, i));
		}
		
		MuseumObject i1 = new Intruder(2, 4);
		MuseumObject i2 = new Intruder(1, 1);
		MuseumObject i3 = new Intruder(10, 10);
		m.place(d1);
		m.place(w1);
		m.place(c1);
		m.place(c2);
		m.place(c3);
		
		m.printGrid();
		
		m.place(i1);
		m.place(i2);
		m.place(i3);
		
		d1.setOpen(true);
		w1.setOpen(true);
		
		
		
	}

}
