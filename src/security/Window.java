package security;

/**
 * @author Hipshot
 *
 */
public class Window extends Entrance {

	public Window(int posX, int posY) {
		super(posX, posY);
		this.setSensor(new WindowSensor(posX, posY));
	}

}
