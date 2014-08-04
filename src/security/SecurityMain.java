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
		m.place(c);
		m.place(i);
		
	}

}
