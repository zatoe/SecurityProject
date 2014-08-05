/**
 * 
 */
package security;

import java.util.ArrayList;

/**
 * @author Zatoe
 *
 */
public class SecurityMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sizeX = 50;
		int sizeY = 32;
		Museum m = new Museum(sizeX, sizeY);
		m.createSquareWall();
		m.placeCameras();
		MuseumObject c1 = new Camera(24, 30);
		MuseumObject c2 = new Camera(6, 30);
		MuseumObject c3 = new Camera(16, 30);
		Entrance d1 = new Door(sizeX - 1, sizeY/2);
		Entrance w1 = new Window(sizeX - 1, 10);
		ArrayList<Window> windows = new ArrayList<Window>();

		for (int i = 3; i < sizeY; i += 3) {
			windows.add(new Window(0, i));
			m.place(windows.get(windows.size() - 1));
		}
		
		MuseumObject i1 = new Intruder(2, 4);
		MuseumObject i2 = new Intruder(sizeX - 2, 6);
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
		
		windows.get(3).setOpen(true);
		d1.setOpen(true);
		w1.setOpen(true);
		
		
		
	}

}
