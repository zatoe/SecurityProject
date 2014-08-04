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
		Museum m = new Museum(12, 12);
		MuseumObject c = new Camera(5, 5);
		MuseumObject i = new Intruder(2, 4);
		MuseumObject i2 = new Intruder(0, 0);
		m.place(c);
		m.place(i);
		m.place(i2);
		
	}

}
